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
package at.crowdware.nrg.ui.widgets

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import at.crowdware.nrg.R
import at.crowdware.nrg.logic.Transaction
import at.crowdware.nrg.logic.TransactionType
import at.crowdware.nrg.ui.theme.BackgroundLight
import at.crowdware.nrg.ui.theme.SurfaceLight
import java.time.format.DateTimeFormatter

@Composable
fun Bookings(transactions: SnapshotStateList<Transaction>, modifier: Modifier) {
    LazyColumn(
        modifier = modifier
            .fillMaxWidth()
            .background(SurfaceLight)
    ) {
        items(transactions.size) { index ->
            val transaction = transactions[index]
            val formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy")
            Row {
                Column {

                    Text(
                        transaction.date.format(formatter),
                        style = TextStyle(fontSize = 18.sp)
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                }
                Spacer(modifier = Modifier.width(8.dp))
                val txt = when (transaction.type) {
                    TransactionType.SCOOPED -> "Energy collected"
                    TransactionType.INITIAL_BOOKING -> "Initial energy"
                    TransactionType.LMP -> transaction.purpose
                }
                Text(txt, style = TextStyle(fontSize = 18.sp))
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(4.dp)
                ) {
                    Text(
                        "${transaction.amount} l", style = TextStyle(fontSize = 18.sp),
                        modifier = Modifier.align(Alignment.CenterEnd)
                    )
                }
            }
        }
    }
}