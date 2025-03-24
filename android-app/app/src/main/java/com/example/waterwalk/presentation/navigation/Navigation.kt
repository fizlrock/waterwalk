package com.example.waterwalk.presentation.navigation

import androidx.annotation.DrawableRes
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.waterwalk.R
import com.example.waterwalk.presentation.screens.EmployeesScreen
import com.example.waterwalk.presentation.screens.LocationListScreen
import com.example.waterwalk.presentation.screens.SettingsScreen

sealed class Screen(val route: String, @DrawableRes val icon: Int, val label: String) {
    object Locations : Screen("locations", R.drawable.ic_location, "Локации")
    object Employees : Screen("employees", R.drawable.ic_workers, "Работники")
    object Settings : Screen("settings", R.drawable.ic_settings, "Настройки")
}

@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screen.Locations.route) {
        composable(Screen.Locations.route) { LocationListScreen() }
        composable(Screen.Employees.route) { EmployeesScreen() }
        composable(Screen.Settings.route) { SettingsScreen() }
    }
}