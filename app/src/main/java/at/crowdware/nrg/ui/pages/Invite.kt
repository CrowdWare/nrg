package at.crowdware.nrg.ui.pages

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import at.crowdware.nrg.logic.Backend
import at.crowdware.nrg.ui.theme.BackgroundLight
import at.crowdware.nrg.ui.theme.OnBackgroundLight
import at.crowdware.nrg.ui.theme.OnPrimaryLight
import at.crowdware.nrg.ui.theme.PrimaryLight
import at.crowdware.nrg.ui.widgets.NavigationDrawer
import at.crowdware.nrg.ui.widgets.NavigationItem
import at.crowdware.nrg.ui.widgets.NavigationManager
import com.google.gson.Gson
import com.simonsickle.compose.barcodes.Barcode
import com.simonsickle.compose.barcodes.BarcodeType

@Composable
fun Invite() {
    val map = mutableMapOf("type" to "NRG_INVITE")
    map["publicKey"] = Backend.getAccount().publicKey
    val gson = Gson()
    val mapString = gson.toJson(map)
    val enc = Backend.encryptStringGCM(mapString)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            "Invite",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = OnBackgroundLight
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            "Let the person that you want to invite scan the barcode.",
            modifier = Modifier.fillMaxWidth(),
            style = TextStyle(fontSize = 18.sp),
            color = OnBackgroundLight
        )
        Spacer(modifier = Modifier.height(16.dp))
        Barcode(
            modifier = Modifier.align(Alignment.CenterHorizontally)
                .width(300.dp)
                .height(300.dp),
            resolutionFactor = 10,
            type = BarcodeType.QR_CODE,
            value = enc
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = {
                //viewModel.reset()
                NavigationManager.navigate("friendlist")
                },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                containerColor = PrimaryLight,
                contentColor = OnPrimaryLight
            )
            //enabled = viewModel.total.value > 0L
        ) {
            Text(stringResource(R.string.button_done), style = TextStyle(fontSize = 20.sp))
        }
    }
}

@Preview
@Composable
fun InvitePreview() {
    val selectedItem = remember { mutableStateOf("Home") }
    val list = mutableListOf(
        NavigationItem("home", Icons.Default.Home, "Home"),
        NavigationItem("friendlist", Icons.Default.Face, "Friendlist")
    )
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = BackgroundLight//MaterialTheme.colorScheme.background
    ) {
        NavigationDrawer(list, selectedItem) { Invite() }
    }
}