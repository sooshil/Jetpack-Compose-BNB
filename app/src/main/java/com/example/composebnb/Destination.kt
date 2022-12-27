package com.example.composebnb

sealed class Destination(val route: String) {
    object Home : Destination(route = "home")
    object Chat : Destination(route = "chat")
    object Gallery : Destination(route = "gallery")
}
