package github.zeshansahi.bottomnavigationcompose.navigations.nav_graph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import github.zeshansahi.bottomnavigationcompose.navigations.Screen
import github.zeshansahi.bottomnavigationcompose.screens.HomeScreen
import github.zeshansahi.bottomnavigationcompose.screens.ProfileScreen
import github.zeshansahi.bottomnavigationcompose.screens.SettingScreen

@Composable
fun NavGraph(navHostController: NavHostController) {

    NavHost(
        navController = navHostController,
        startDestination = Screen.Home.rout
    ) {
        composable(route = Screen.Home.rout) {
            HomeScreen()
        }
        composable(route = Screen.Profile.rout) {
            ProfileScreen()
        }
        composable(route = Screen.Setting.rout) {
            SettingScreen()
        }
    }
}