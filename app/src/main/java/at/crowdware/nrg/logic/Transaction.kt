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

import java.io.Serializable
import java.time.LocalDate

enum class TransactionType(val value: UInt) {
    INITIAL_BOOKING(1u),
    SCOOPED(2u),
    LMP(3u);

    override fun toString(): String {
        return value.toString()
    }

    companion object {
        fun fromString(valueString: String): TransactionType {
            return values().find { it.value.toString() == valueString }
                ?: throw IllegalArgumentException("Invalid TransactionType value: $valueString")
        }
    }
}

data class Transaction(
    var amount: Long,
    var from: String,
    val date: LocalDate,
    var purpose: String = "",
    var type: TransactionType):
    Serializable
