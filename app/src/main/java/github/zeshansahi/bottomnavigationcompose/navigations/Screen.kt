package github.zeshansahi.bottomnavigationcompose.navigations

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screen(
    val rout: String,
    val title: String,
    val icon: ImageVector
) {
    object Home : Screen(
        rout = "home",
        title = "Home",
        icon = Icons.Default.Home
    )

    object Profile : Screen(
        rout = "profile",
        title = "Profile",
        icon = Icons.Default.Person
    )

    object Setting : Screen(
        rout = "setting",
        title = "Setting",
        icon = Icons.Default.Settings
    )
}