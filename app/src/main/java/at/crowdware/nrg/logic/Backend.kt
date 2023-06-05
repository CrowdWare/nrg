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

import android.app.ActivityManager
import android.content.Context
import android.content.pm.ApplicationInfo
import android.util.Log
import javax.crypto.Cipher
import javax.crypto.spec.GCMParameterSpec
import javax.crypto.spec.SecretKeySpec
import at.crowdware.nrg.BuildConfig
import com.goterl.lazysodium.LazySodiumAndroid
import com.goterl.lazysodium.SodiumAndroid
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.File
import java.io.ObjectInputStream
import java.io.ObjectOutputStream
import java.util.concurrent.locks.ReentrantLock
import java.util.zip.ZipEntry
import java.util.zip.ZipFile

class Backend {
    companion object {
        private const val secretKey = BuildConfig.SECRET_KEY
        private const val algorithm = BuildConfig.ALGORYTHM
        private const val keyPhrase = BuildConfig.KEYPHRASE
        private const val PUBLIC_KEY_BYTES = 32
        private const val PRIVATE_KEY_BYTES = 32
        private const val db_name = "account.db"
        private val dbLock = ReentrantLock()
        private var account = Account()

        fun init(context: Context) {
            val memoryUsage = getMemoryUsage(context)
            val normalizedMemoryUsage = normalizeMemoryUsage(memoryUsage)
            println("Memory: $memoryUsage $normalizedMemoryUsage")
            val filesInAPK = getFilesInAPK(context)
            //for (file in filesInAPK) {
            //    println("File: $file")
            //}
            if(!readAccount(context)) {
                generateKeys()
                saveAccount(context)
            }
        }

        fun getFilesInAPK(context: Context): List<String> {
            val applicationInfo: ApplicationInfo = context.applicationInfo
            val apkPath: String = applicationInfo.sourceDir
            println("APK:$apkPath")
            val apkFile = ZipFile(apkPath)
            val entries = apkFile.entries()
            val files = mutableListOf<String>()

            while (entries.hasMoreElements()) {
                val entry = entries.nextElement() as ZipEntry
                if (!entry.isDirectory) {
                    val fileName = entry.name
                    files.add(fileName)
                }
            }

            apkFile.close()

            return files
        }

        fun getMemoryUsage(context: Context): Long {
            val activityManager = context.getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager
            val memoryInfo = ActivityManager.MemoryInfo()
            activityManager.getMemoryInfo(memoryInfo)
            return memoryInfo.totalMem
        }

        fun normalizeMemoryUsage(memoryUsage: Long): Long {
            val normalizationFactor = 1024L // Adjust as needed
            return memoryUsage / normalizationFactor
        }


        fun getAccount(): Account { return account }

        fun saveAccount(context: Context) {
            val file = File(context.applicationContext.filesDir, db_name)
            try {
                dbLock.lock()
                // Create a key for the encryption
                val key = SecretKeySpec(keyPhrase.toByteArray(), "AES")

                // Serialize the person object to a byte array
                val baos = ByteArrayOutputStream()
                ObjectOutputStream(baos).use {
                    it.writeObject(account)
                }
                val serializedData = baos.toByteArray()

                // Encrypt the serialized data
                val cipher = Cipher.getInstance("AES")
                cipher.init(Cipher.ENCRYPT_MODE, key)
                val encryptedData = cipher.doFinal(serializedData)

                // Write the encrypted data to a file
                file.writeBytes(encryptedData)
            }
            catch(e: java.lang.Exception)
            {
                if(file.exists())
                    file.delete()
            }
            finally {
                dbLock.unlock()
            }
        }

        fun readAccount(context: Context): Boolean {
            val file = File(context.applicationContext.filesDir, db_name)
            if(!file.exists()) {
                return false
            }
            try {
                var acc: Account
                dbLock.lock()
                val encryptedDataFromFile = file.readBytes()
                val key = SecretKeySpec(keyPhrase.toByteArray(), "AES")
                val cipher = Cipher.getInstance("AES")
                cipher.init(Cipher.DECRYPT_MODE, key)
                val decryptedData = cipher.doFinal(encryptedDataFromFile)
                ObjectInputStream(ByteArrayInputStream(decryptedData)).use {
                    acc = it.readObject() as Account
                }
                account = acc
                return true
            }
            catch (e: Exception) {
                Log.e("NRG", "An error occurred reading the database: " + e.message)
                return false
            }
            finally {
                dbLock.unlock()
            }
        }

        fun getTransactions(): MutableList<Transaction> {
            val list: MutableList<Transaction> = mutableListOf()
            return list
        }

        fun generateKeys() {
            val lazySodium = LazySodiumAndroid(SodiumAndroid())
            val pubKey = ByteArray(PUBLIC_KEY_BYTES)
            val privKey = ByteArray(PRIVATE_KEY_BYTES)
            lazySodium.cryptoBoxKeypair(pubKey, privKey)
            account.publicKey = pubKey.toHex()
            account.privateKey = privKey.toHex()
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