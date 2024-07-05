package com.example.instagrampracticeuicompose

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.instagrampracticeuicompose.ui.screens.feedpost.FeedPostScreen
import com.example.instagrampracticeuicompose.ui.screens.profile.ProfileScreen
import com.example.instagrampracticeuicompose.ui.screens.splash.SplashScreen

@Composable
fun AppNavHost(navController: NavHostController, modifier: Modifier = Modifier) {
    NavHost(
        navController = navController,
        startDestination = Profile.route,
        modifier = modifier
    ) {
        composable(route= Splash.route){
            SplashScreen(onTextClick = {
                navController.navigateSingleTopTo(Profile.route)
            })
        }
        composable(route = Profile.route){
            ProfileScreen(onTextClick = {
                navController.navigateSingleTopTo(FeedPost.route)
            })
        }
        composable(route = FeedPost.route){
            FeedPostScreen(onTextClick = {
                navController.navigateSingleTopTo(Splash.route)
            })
        }
    }
}


fun NavHostController.navigateSingleTopTo(route: String) =
    this.navigate(route) {
        popUpTo(
            this@navigateSingleTopTo.graph.findStartDestination().id
        ) {
            saveState = true
        }
        launchSingleTop = true
        restoreState = true
    }