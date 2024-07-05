package com.example.instagrampracticeuicompose.ui.screens.splash

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun SplashScreen(onTextClick: () -> Unit, modifier: Modifier = Modifier) {
 Surface(color = Color.Red) {
     Column(
         modifier = modifier.fillMaxSize(),
         verticalArrangement = Arrangement.Center,
         horizontalAlignment = Alignment.CenterHorizontally
     ) {
         Text(
             text = "Splash Screen",
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