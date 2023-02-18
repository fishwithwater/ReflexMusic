package cn.myjdemo.reflex.music.ui.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import cn.myjdemo.reflex.music.data.AppViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(toSettingScreen: () -> Unit, appViewModel: AppViewModel) {
    Scaffold(topBar = {
        CenterAlignedTopAppBar(title = { Text("Home") }, actions = {
            IconButton(onClick = { toSettingScreen() }) {
                Icon(imageVector = Icons.Filled.Settings, contentDescription = "设置")
            }
        })
    }) {
        Column(Modifier.padding(it).background(MaterialTheme.colorScheme.background)){
            Text("HomeScreen", color = MaterialTheme.colorScheme.onBackground)
            appViewModel.deviceInfo.map {
                Text("${it.key} : ${it.value}", color = MaterialTheme.colorScheme.onBackground)
            }
        }
    }
}