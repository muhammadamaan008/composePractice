package com.example.instagrampracticeuicompose

import androidx.compose.ui.graphics.vector.ImageVector

interface AppDestination {
//    val icon: ImageVector
    val route: String
}


object Splash : AppDestination{
    override val route = "splash"
}

object FeedPost: AppDestination{
    override val route = "feedPost"
}

object Profile : AppDestination{
    override val route = "profile"
}

val appDestinationsList = listOf(Splash,FeedPost,Profile)