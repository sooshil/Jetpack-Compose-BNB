package com.example.composebnb

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation(navController: NavHostController) {

    NavHost(navController = navController, startDestination = Destination.Home.route) {
        composable(route = Destination.Home.route) { HomeScreen(navController = navController) }
        composable(route = Destination.Chat.route) { ChatScreen(navController = navController) }
        composable(route = Destination.Gallery.route) { GalaryScreen(navController = navController) }
    }
}