package com.example.androiddevchallenge.puppyadoption

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import androidx.navigation.compose.rememberNavController

@Composable
fun ComposeNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "puppy_list"
    ) {
        composable("puppy_list") {
            PuppyListScreen(navController = navController)
        }
        composable(
            route = "puppy_details/{id}",
            arguments = listOf(navArgument("id") { type = NavType.IntType })
        ) {
            PuppyDetailsScreen(
                navController = navController,
                puppyId = it.arguments?.getInt("id")
            )
        }
    }
}