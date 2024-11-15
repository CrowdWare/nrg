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

import androidx.compose.foundation.layout.Column
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.res.stringResource
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import at.crowdware.nrg.R
import at.crowdware.nrg.ui.pages.Friendlist
import at.crowdware.nrg.ui.pages.Invite
import at.crowdware.nrg.ui.pages.ScoopPage
import at.crowdware.nrg.ui.theme.OnBackgroundLight
import at.crowdware.nrg.ui.theme.OnPrimaryLight
import at.crowdware.nrg.ui.theme.OnSurfaceLight
import at.crowdware.nrg.ui.theme.PrimaryLight
import at.crowdware.nrg.ui.theme.SurfaceLight
import kotlinx.coroutines.launch

@Composable
fun NavigationView(items: MutableList<NavigationItem>) {
    val navController = rememberNavController()
    val selectedItem = remember { mutableStateOf("home") }

    NavigationManager.setNavController(navController)

    NavHost(navController = navController, startDestination = "home") {
        for(index in items.indices) {
            composable(items[index].id) {
                NavigationDrawer(items, selectedItem) {
                    when(items[index].id) {
                        // have a look at MainActivity for navigation
                        "home" -> ScoopPage()
                        "friendlist" -> Friendlist()
                        "invite" -> Invite()
                        //"receive_gratitude_qrcode" -> ReceiveGratitudeQRCode(receiveViewModel)
                        //"give_gratitude" -> GiveGratitude(giveViewModel)
                    }
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NavigationDrawer(items: List<NavigationItem>, selectedItem: MutableState<String>, content: @Composable() () -> Unit) {
    val openDialog = remember { mutableStateOf(false) }
    val drawerState = rememberDrawerState(DrawerValue.Closed)
    val scope = rememberCoroutineScope()

    if (openDialog.value) {
        About(
            openDialog = openDialog.value,
            onDismiss = { openDialog.value = false })
    }

    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = { DrawerSheet(drawerState, items, selectedItem) },
        content = {
            Column() {
                CenterAlignedTopAppBar(
                    title = { Text("NRG exchange") },
                    colors = TopAppBarDefaults.topAppBarColors(
                        containerColor = PrimaryLight,
                        titleContentColor = OnPrimaryLight,
                        navigationIconContentColor = OnPrimaryLight,
                        actionIconContentColor = OnPrimaryLight
                    ),
                    navigationIcon = {
                        IconButton(onClick = { scope.launch { drawerState.open() } }) {
                            Icon(Icons.Filled.Menu, contentDescription = null)
                        }
                    },
                    actions = {
                        IconButton(onClick = { openDialog.value = true }) {
                            Icon(
                                Icons.Filled.MoreVert,
                                contentDescription = "About"
                            )
                        }
                    }
                )
                content()
            }
        }
    )
}

@Composable
fun About(openDialog: Boolean, onDismiss: () -> Unit) {
    if (openDialog) {
        AlertDialog(
            onDismissRequest = onDismiss,
            title = { Text(text = stringResource(R.string.about_nrg)) },
            text = {
                Text(
                    stringResource(R.string.about_dialog_text),
                    color = OnBackgroundLight
                )
            },
            titleContentColor = OnSurfaceLight,
            containerColor = SurfaceLight,
            confirmButton = { TextButton(onClick = onDismiss ) { Text("OK") } },
            dismissButton = {}
        )
    }
}