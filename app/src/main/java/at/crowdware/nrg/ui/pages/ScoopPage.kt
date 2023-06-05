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
package at.crowdware.nrg.ui.pages

import android.app.Application
import android.content.Intent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import at.crowdware.nrg.ui.widgets.NavigationDrawer
import at.crowdware.nrg.R
import at.crowdware.nrg.logic.Backend
import at.crowdware.nrg.logic.Transaction
import at.crowdware.nrg.logic.TransactionType
import at.crowdware.nrg.ui.theme.BackgroundLight
import at.crowdware.nrg.ui.theme.OnBackgroundLight
import at.crowdware.nrg.ui.theme.OnPrimaryLight
import at.crowdware.nrg.ui.theme.OnSecondaryLight
import at.crowdware.nrg.ui.theme.PrimaryLight
import at.crowdware.nrg.ui.theme.SecondaryLight
import at.crowdware.nrg.ui.widgets.NavigationItem
import kotlinx.coroutines.delay
import at.crowdware.nrg.ui.widgets.BalanceDisplay
import at.crowdware.nrg.ui.widgets.Bookings
import at.crowdware.nrg.ui.widgets.HourMinutesPicker
import at.crowdware.nrg.ui.widgets.NavigationManager
import at.crowdware.nrg.ui.widgets.TotalDisplay
import java.time.LocalDate


@Composable
fun ScoopPage() {
    val transactions = remember { mutableStateListOf(*Backend.getTransactions().toTypedArray()) }
    var balance by remember { mutableStateOf(/*Backend.getBalance()*/13L) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        BalanceDisplay(balance)

        Spacer(modifier = Modifier.height(16.dp))
        Row(modifier = Modifier.fillMaxWidth()) {
            Button(
                onClick = { /*NavigationManager.navigate("receive_gratitude")*/ },
                modifier = Modifier.weight(1f),
                colors = ButtonDefaults.buttonColors(
                    containerColor = SecondaryLight,
                    contentColor = OnSecondaryLight
                )
            ) {
                Text("Receive", style = TextStyle(fontSize = 20.sp))
            }
            Spacer(modifier = Modifier.width(8.dp))
            Button(
                onClick = { /*NavigationManager.navigate("give_gratitude")*/ },
                modifier = Modifier.weight(1f),
                colors = ButtonDefaults.buttonColors(
                    containerColor = PrimaryLight,
                    contentColor = OnPrimaryLight
                )
            ) {
                Text("Give", style = TextStyle(fontSize = 20.sp))
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            "Bookings", fontWeight = FontWeight.Bold,
            style = TextStyle(fontSize = 18.sp),
            modifier = Modifier.align(Alignment.Start),
            color = OnBackgroundLight
        )
        Spacer(modifier = Modifier.height(4.dp))
        Bookings(transactions, modifier = Modifier.weight(1f))
        Spacer(modifier = Modifier.height(16.dp))
    }
}

@Preview(
    showSystemUi = true,)
@Composable
fun MainPagePreview() {
    val selectedItem = remember { mutableStateOf("Home") }
    val list = mutableListOf(
        NavigationItem("home", Icons.Default.Home, "Home"),
        NavigationItem("friendlist", Icons.Default.Face, "Friendlist")
    )
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = BackgroundLight//MaterialTheme.colorScheme.background
    ) {
        NavigationDrawer(list, selectedItem) { ScoopPage() }
    }
}

