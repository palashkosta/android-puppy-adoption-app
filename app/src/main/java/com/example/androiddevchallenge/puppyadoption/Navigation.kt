/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
