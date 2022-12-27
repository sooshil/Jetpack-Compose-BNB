package com.example.composebnb

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.composebnb.ui.theme.ComposeBottomNavigationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeBottomNavigationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                    val navController = rememberNavController()

                    Scaffold(
                        bottomBar = {
                            BottomNavigationBar(
                                navItems = bottomNavItems,
                                navController = navController,
                                onItemClick = {
                                    navController.navigate(it.route)
                                }
                            )
                        }
                    ) {
                        Navigation(navController = navController)
                    }
                }
            }
        }
    }
}

val bottomNavItems = listOf(
    BottomNavItem(
        name = "Home",
        route = Destination.Home.route,
        icon = R.drawable.ic_home,
        badgeCount = 0
    ),
    BottomNavItem(
        name = "Chat",
        route = Destination.Chat.route,
        icon = R.drawable.ic_chat,
        badgeCount = 20
    ),
    BottomNavItem(
        name = "Gallery",
        route = Destination.Gallery.route,
        icon = R.drawable.ic_gallery,
        badgeCount = 0
    ),
)