package com.example.instagrampracticeuicompose.ui.screens.components

import android.graphics.drawable.Drawable
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.instagrampracticeuicompose.R

@Composable
fun RoundedImage(size: Dp,image: Int,modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .size(size)
            .border(
                2.5.dp, brush = Brush.linearGradient(
                    listOf(
                        Color(0xFFC913B9),
                        Color(0xFFF9373F),
                        Color(0xFFFECD00)
                    )
                ), CircleShape
            )
            .clip(CircleShape)
            .background(Color.Transparent)
            .padding(7.dp)
    ){
        Image(painter = painterResource(id = image), contentDescription = null, modifier = Modifier.clip(
            CircleShape
        ))
    }
}

@Preview
@Composable
private fun RoundedImagePreview() {
    RoundedImage(size = 90.dp,R.drawable.dog)
}