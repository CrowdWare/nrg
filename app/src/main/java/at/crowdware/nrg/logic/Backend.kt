/****************************************************************************
 * Copyright (C) 2023 CrowdWare
 *
 * This file is part of NRG.
 *
 *  NRG is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  NRG is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with NRG.  If not, see <http://www.gnu.org/licenses/>.
 *
 ****************************************************************************/
package at.crowdware.nrg.logic

import javax.crypto.Cipher
import javax.crypto.spec.GCMParameterSpec
import javax.crypto.spec.SecretKeySpec
import at.crowdware.nrg.BuildConfig

class Backend {
    companion object {
        private const val secretKey = BuildConfig.SECRET_KEY
        private const val algorithm = BuildConfig.ALGORYTHM

        fun getTransactions(): MutableList<Transaction> {
            val list: MutableList<Transaction> = mutableListOf()
            return list
        }

        fun ByteArray.toHex() : String{
            val result = StringBuffer()

            forEach {
                val st = String.format("%02x", it)
                result.append(st)
            }
            return result.toString()
        }

        fun String.hexToByteArray(): ByteArray {
            val data = ByteArray(length / 2)
            for (i in data.indices) {
                data[i] = ((Character.digit(this[i * 2], 16) shl 4) + Character.digit(this[i * 2 + 1], 16)).toByte()
            }
            return data
        }

        fun encryptStringGCM(value: String): String {
            val keySpec = SecretKeySpec(secretKey.toByteArray(Charsets.UTF_8), "AES")
            val cipher = Cipher.getInstance(algorithm)
            cipher.init(Cipher.ENCRYPT_MODE, keySpec)
            val result = cipher.doFinal(value.toByteArray(Charsets.UTF_8))
            val iv = cipher.iv.copyOf()
            return iv.plus(result).toHex()
        }

        fun decryptStringGCM(value: String): String {
            val encryptedData = value.hexToByteArray()
            val iv = encryptedData.copyOfRange(0, 12) // GCM IV is usually 12 bytes
            val cipherText = encryptedData.copyOfRange(12, encryptedData.size)

            val keySpec = SecretKeySpec(secretKey.toByteArray(Charsets.UTF_8), "AES")
            val cipher = Cipher.getInstance(algorithm)
            val gcmSpec = GCMParameterSpec(128, iv) // 128 bit auth tag length
            cipher.init(Cipher.DECRYPT_MODE, keySpec, gcmSpec)

            val result = cipher.doFinal(cipherText)
            return String(result, Charsets.UTF_8)
        }
    }
}