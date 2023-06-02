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
package at.crowdware.nrg

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import at.crowdware.nrg.logic.LocaleManager
import at.crowdware.nrg.ui.theme.NrgTheme
import at.crowdware.nrg.ui.widgets.NavigationItem
import at.crowdware.nrg.ui.widgets.NavigationView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NrgTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LocaleManager.init(applicationContext, resources)
                    val list = mutableListOf(
                        NavigationItem("home", Icons.Default.Home, stringResource(R.string.navigation_home)),
                        NavigationItem("friendlist", Icons.Default.Face, stringResource(R.string.navigation_friendlist)),
                        NavigationItem("divider")
                    )
                    // navigation targets which are not listed in the drawer
                    //list.add(NavigationItem(id = "receive_gratitude_qrcode"))
                    //list.add(NavigationItem(id = "receive_gratitude"))
                    //list.add(NavigationItem(id = "give_gratitude"))
                    NavigationView(list)
                }
            }
        }
    }

    override fun attachBaseContext(newBase: Context?) {
        super.attachBaseContext(LocaleManager.wrapContext(newBase!!))
    }
}
