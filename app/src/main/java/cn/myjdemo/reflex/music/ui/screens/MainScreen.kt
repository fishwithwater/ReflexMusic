package cn.myjdemo.reflex.music.ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import cn.myjdemo.reflex.music.data.AppViewModel
import cn.myjdemo.reflex.music.reflexDestinations
import cn.myjdemo.reflex.music.ui.components.MusicBar
import cn.myjdemo.reflex.music.ui.components.MusicPlayer

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(deviceInfo: Map<String, Any>, appViewModel: AppViewModel = viewModel()) {
    val mainNavController = rememberNavController();
    appViewModel.deviceInfo = deviceInfo
    val scope = rememberCoroutineScope()
    var openBottomSheet by rememberSaveable() {
        mutableStateOf(false)
    }
    val bottomSheetState = rememberSheetState(skipHalfExpanded = true);
    if (openBottomSheet) {
        ModalBottomSheet(
            onDismissRequest = {
                openBottomSheet = false
            },
            sheetState = bottomSheetState,
            modifier = Modifier.fillMaxSize(),
            containerColor = MaterialTheme.colorScheme.secondaryContainer,
        ) {
            MusicPlayer()
        }
    }
    Scaffold(bottomBar = {
        MusicBar(openMusicSheet = {
            openBottomSheet = !openBottomSheet
        })
    }) {
        NavHost(
            navController = mainNavController,
            startDestination = "home",
            Modifier.padding(it)
        ) {
            reflexDestinations.map { destination ->
                composable(destination.route) {
                    destination.screen(mainNavController, appViewModel)
                }
            }

        }
    }

}
