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

import android.app.Activity
import android.media.tv.TvContract.Channels.Logo
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Divider
import androidx.compose.material3.DrawerState
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.NavigationDrawerItemDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import at.crowdware.nrg.R
import at.crowdware.nrg.logic.LocaleManager
import at.crowdware.nrg.ui.theme.BackgroundLight
import at.crowdware.nrg.ui.theme.LogoBackground
import at.crowdware.nrg.ui.theme.NrgTheme
import at.crowdware.nrg.ui.theme.SurfaceLight
import kotlinx.coroutines.launch


data class NavigationItem(val id: String, val icon: ImageVector? = null, val text: String = "", val index: Int = 0)


@Composable
fun DrawerSheet(drawerState: DrawerState, items: List<NavigationItem>, selectedItem: MutableState<String>) {
    val scope = rememberCoroutineScope()
    val context = LocalContext.current
    val currentActivity = LocalContext.current as? Activity
    val languages = LocaleManager.getLanguages()
    val index = LocaleManager.getLanguageIndex()
    val onSelectedIndexChanged: (Int) -> Unit = { idx ->
        LocaleManager.setLocale(context, idx)
        currentActivity?.recreate()
    }
    val stateHolderLanguage =
        rememberDropDownListboxStateHolder(languages, index, onSelectedIndexChanged)

    if ( drawerState.offset.value > -540f) {
        ModalDrawerSheet(
            modifier = Modifier
                .width((LocalConfiguration.current.screenWidthDp * 0.75).dp)
        ) {
            Box(
                modifier = Modifier
                    .background(LogoBackground)
                    .fillMaxWidth()
                    .height(200.dp)
            ) {
                Column(modifier = Modifier.padding(8.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.icon),
                        contentDescription = "icon",
                        modifier = Modifier.weight(1f),
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text("© 2023 CrowdWare", color = MaterialTheme.colorScheme.onPrimary)
                    Spacer(modifier = Modifier.height(8.dp))
                    Text("http://nrg.crowdware.at", color = MaterialTheme.colorScheme.onPrimary)
                }
            }
            Spacer(Modifier.height(12.dp))
            LazyColumn() {
                items(items.size) { index ->
                    if (items[index].id == "divider") {
                        Divider()
                    } else if (items[index].text.isNotEmpty()) {
                        NavigationDrawerItem(
                            icon = {
                                Icon(
                                    items[index].icon!!,
                                    contentDescription = items[index].text
                                )
                            },
                            label = { Text(items[index].text) },
                            selected = items[index].text == selectedItem.value,
                            onClick = {
                                scope.launch { drawerState.close() }
                                selectedItem.value = items[index].text
                                NavigationManager.navigate(items[index].id)
                            },
                            modifier = Modifier.padding(NavigationDrawerItemDefaults.ItemPadding)
                        )
                    }
                }
            }
            DropDownListbox(
                label = stringResource(R.string.select_preferred_language),
                stateHolder = stateHolderLanguage,
                modifier = Modifier.padding(16.dp)
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showSystemUi = true)
@Composable
fun DrawerPreview() {
    val selectedItem = remember { mutableStateOf("Mate list") }
    val list = mutableListOf(
        NavigationItem("home", Icons.Default.Home, stringResource(R.string.navigation_home)),
        NavigationItem("", Icons.Default.Face, stringResource(R.string.navigation_friendlist))
    )
    NrgTheme {
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
            DrawerSheet(drawerState = rememberDrawerState(DrawerValue.Open), list, selectedItem)
        }
    }
}
