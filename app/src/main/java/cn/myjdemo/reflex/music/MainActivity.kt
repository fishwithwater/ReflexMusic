package cn.myjdemo.reflex.music

import android.content.Context
import android.os.Bundle
import android.util.DisplayMetrics
import android.util.Log
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import cn.myjdemo.reflex.music.ui.screens.MainScreen
import cn.myjdemo.reflex.music.ui.theme.ReflexMusicAppTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val wm = this.getSystemService(Context.WINDOW_SERVICE) as WindowManager
        val dm = DisplayMetrics()
        wm.defaultDisplay.getMetrics(dm)
        val width = dm.widthPixels // 屏幕宽度（像素）

        val height = dm.heightPixels // 屏幕高度（像素）

        val density = dm.density // 屏幕密度（0.75 / 1.0 / 1.5）

        val densityDpi = dm.densityDpi // 屏幕密度dpi（120 / 160 / 240）

        // 屏幕宽度算法:屏幕宽度（像素）/屏幕密度
        // 屏幕宽度算法:屏幕宽度（像素）/屏幕密度
        val screenWidth = (width / density).toInt() // 屏幕宽度(dp)

        val screenHeight = (height / density).toInt() // 屏幕高度(dp)

        Log.d("h_bl", "屏幕宽度（像素）：$width")
        Log.d("h_bl", "屏幕高度（像素）：$height")
        Log.d("h_bl", "屏幕密度（0.75 / 1.0 / 1.5）：$density")
        Log.d("h_bl", "屏幕密度dpi（120 / 160 / 240）：$densityDpi")
        Log.d("h_bl", "屏幕宽度（dp）：$screenWidth")
        Log.d("h_bl", "屏幕高度（dp）：$screenHeight")

        val deviceWindowInfo = mapOf("width" to width, "height" to height, "density" to density, "densityDpi" to densityDpi, "screenWidth" to screenWidth, "screenHeight" to screenHeight)
        super.onCreate(savedInstanceState)
        setContent {
            ReflexMusicAppTheme {
                MainScreen(deviceWindowInfo)
            }
        }
    }
}