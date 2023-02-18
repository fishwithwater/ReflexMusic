package cn.myjdemo.reflex.music.ui.screens.setting

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import cn.myjdemo.reflex.music.data.AppViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SettingScreen(back: () -> Unit) {
    Scaffold(topBar = {
        CenterAlignedTopAppBar(
            title = { Text(text = "设置") },
            navigationIcon = {
                IconButton(onClick = { back() }) {
                    Icon(imageVector = Icons.Filled.ArrowBack, contentDescription = "返回")
                }
            }
        )
    }) {
        Column(Modifier.padding(it)) {
            Text(text = "Setting")
            Text(text = "", Modifier.clickable { })
        }
    }
}