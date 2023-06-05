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

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import at.crowdware.nrg.R
import at.crowdware.nrg.ui.theme.BackgroundLight
import at.crowdware.nrg.ui.theme.OnBackgroundLight
import at.crowdware.nrg.ui.theme.OnPrimaryLight
import at.crowdware.nrg.ui.theme.OnSecondaryLight
import at.crowdware.nrg.ui.theme.PrimaryLight
import at.crowdware.nrg.ui.theme.SecondaryLight
import at.crowdware.nrg.ui.widgets.NavigationDrawer
import at.crowdware.nrg.ui.widgets.NavigationItem
import at.crowdware.nrg.ui.widgets.NavigationManager


@Composable
fun Friendlist() {
    val friends = listOf("Hand Meiser", "Erik Ode", "Paul Breitner", "Dirk", "Hans", "Bert", "Angela",
    "Jens", "Hiinerk", "Zabolo", "Pato")
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp)) {
        Text("People in trust",
            fontSize = 18.sp,
            color = OnBackgroundLight)
        Spacer(modifier=Modifier.height(8.dp))
        LazyColumn(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
        ) {
            items(friends.size) { index ->
                FriendListItem(friend = friends[index])
            }
        }
        Spacer(modifier=Modifier.height(16.dp))
        Row(modifier = Modifier.fillMaxWidth()) {
            Button(
                onClick = { NavigationManager.navigate("invite") },
                modifier = Modifier.weight(1f),
                colors = ButtonDefaults.buttonColors(
                    containerColor = SecondaryLight,
                    contentColor = OnSecondaryLight
                )
            ) {
                Text("Invite", style = TextStyle(fontSize = 20.sp))
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
                Text("Trust", style = TextStyle(fontSize = 20.sp))
            }
        }
    }
}

@Preview
@Composable
fun FriendlistPreview() {
    val selectedItem = remember { mutableStateOf("Home") }
    val list = mutableListOf(
        NavigationItem("home", Icons.Default.Home, "Home"),
        NavigationItem("friendlist", Icons.Default.Face, "Friendlist")
    )

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = BackgroundLight//MaterialTheme.colorScheme.background
    ) {
        NavigationDrawer(list, selectedItem) { Friendlist() }
    }
}


@Composable
fun FriendListItem(friend:String) {
    Card(
        //elevation = CardElevation(4.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(text = friend, fontWeight = FontWeight.Bold)
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun FriendlistItemPreview() {
    FriendListItem(friend = "Hans Meiser")
}
