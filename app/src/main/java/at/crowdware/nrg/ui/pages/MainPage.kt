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
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MainPage() {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text("MainPage", fontSize = 20.sp, fontWeight = FontWeight.Bold)
    }
}