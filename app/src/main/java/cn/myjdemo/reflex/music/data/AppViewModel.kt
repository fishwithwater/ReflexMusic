package cn.myjdemo.reflex.music.data

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class AppViewModel : ViewModel() {
    var deviceInfo: Map<String, Any> by mutableStateOf(emptyMap())
}