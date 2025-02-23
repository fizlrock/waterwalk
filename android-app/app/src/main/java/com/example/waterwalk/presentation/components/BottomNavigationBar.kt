package com.example.waterwalk.presentation.components

import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.waterwalk.presentation.navigation.Screen


@Composable
fun BottomNavigationBar(navController: NavHostController) {
    val screens = listOf(Screen.Locations, Screen.Employees, Screen.Settings)
    NavigationBar {
        screens.forEach { screen ->
            NavigationBarItem(
                icon = { Icon(painterResource(id = screen.icon), contentDescription = screen.label) },
                label = { Text(screen.label) },
                selected = navController.currentDestination?.route == screen.route,
                onClick = { navController.navigate(screen.route) }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewBottomNavigationBar() {
    val navController = rememberNavController()
    MaterialTheme {
        BottomNavigationBar(navController = navController)
    }
}