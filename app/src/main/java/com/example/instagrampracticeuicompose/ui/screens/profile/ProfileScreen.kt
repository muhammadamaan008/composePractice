package com.example.instagrampracticeuicompose.ui.screens.profile

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.instagrampracticeuicompose.R
import com.example.instagrampracticeuicompose.ui.screens.components.RoundedImage
import com.example.instagrampracticeuicompose.ui.theme.InstagramPracticeUiComposeTheme
import com.example.instagrampracticeuicompose.ui.theme.sfuiFontFamily

@Composable
fun ProfileScreen(onTextClick: () -> Unit, modifier: Modifier = Modifier) {
    Scaffold(
        topBar = { TopBar() },
        modifier = Modifier.fillMaxSize(),
    ) { innerPadding ->
        Surface(modifier = Modifier.padding(innerPadding), color = MaterialTheme.colorScheme.background) {
            Column(
                modifier = modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                RoundedImage(size = 90.dp, image = R.drawable.dog)
                Text(
                    text = "Profile Screen",
                    style = TextStyle(
                        color = Color.Black,
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 30.sp
                    ),
                    modifier = Modifier.clickable {
                        onTextClick()
                    }
                )

            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(modifier: Modifier = Modifier) {
    CenterAlignedTopAppBar(
       colors = topAppBarColors(
           containerColor = MaterialTheme.colorScheme.background,
       ),
        navigationIcon = {
            Icon(
                painter = painterResource(id = R.drawable.backicon),
                contentDescription = null,
                modifier = Modifier.padding(15.dp)
            )
        },
        title = {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text("username", style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 16.sp, fontFamily = sfuiFontFamily))
                Icon(
                    painter = painterResource(id = R.drawable.verified_badge),
                    contentDescription = null,
                    tint = Color(0xFF1FA1FF)
                )
            }
        },
        actions = {
            Row (horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.padding(horizontal = 10.dp)){
                Icon(
                    painter = painterResource(id = R.drawable.notificationicon),
                    contentDescription = null,
                )
                Spacer(modifier = modifier.width(15.dp))
                Icon(
                    painter = painterResource(id = R.drawable.dottedlineicon),
                    contentDescription = null
                )
            }
        }
    )
}

@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Preview
@Composable
private fun TopBarPreview() {
    InstagramPracticeUiComposeTheme {
        ProfileScreen(onTextClick = {})
    }
}


//@Preview
//@Composable
//private fun ProfileScreenPreview() {
//    ProfileScreen(onTextClick = { })
//}