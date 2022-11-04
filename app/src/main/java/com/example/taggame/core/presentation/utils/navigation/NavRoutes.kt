package com.example.taggame.core.presentation.utils.navigation

sealed class NavRoutes(val route: String) {
    object Home : NavRoutes("home_route")
    object CreateRoom : NavRoutes("create_room_route")
}
