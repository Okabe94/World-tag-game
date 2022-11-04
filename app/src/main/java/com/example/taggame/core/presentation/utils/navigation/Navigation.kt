package com.example.taggame.core.presentation.utils.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.taggame.feature_create_room.presentation.view.CreateRoomScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    controller: NavHostController = rememberNavController(),
    startDestination: String = NavRoutes.CreateRoom.route
) {
    NavHost(
        modifier = modifier,
        navController = controller,
        startDestination = startDestination
    ) {
        composable(route = NavRoutes.CreateRoom.route) {
            CreateRoomScreen()
        }
    }
}