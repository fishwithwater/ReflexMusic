package cn.myjdemo.reflex.music

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import cn.myjdemo.reflex.music.data.AppViewModel
import cn.myjdemo.reflex.music.ui.screens.home.HomeScreen
import cn.myjdemo.reflex.music.ui.screens.setting.SettingScreen

interface ReflexDestination {
    val route: String
    val screen: @Composable (mainNavController: NavHostController, appViewModel: AppViewModel) -> Unit
}

object Home : ReflexDestination {
    override val route = "home"
    override val screen: @Composable (mainNavController: NavHostController, appViewModel: AppViewModel) -> Unit =
        { navHostController: NavHostController, appViewModel: AppViewModel ->
            HomeScreen(toSettingScreen = {
                navHostController.navigate(Setting.route)
            }, appViewModel = appViewModel)
        }
}

object Setting : ReflexDestination {
    override val route = "setting"
    override val screen: @Composable (mainNavController: NavHostController, appViewModel: AppViewModel) -> Unit =
        { navHostController: NavHostController, appViewModel: AppViewModel ->
            SettingScreen(back = {
                navHostController.popBackStack()
            })
        }
}

val reflexDestinations = listOf(
    Home,
    Setting
)