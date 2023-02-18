package cn.myjdemo.reflex.music.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.SkipNext
import androidx.compose.material.icons.filled.SkipPrevious
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import cn.myjdemo.reflex.music.R
import coil.compose.AsyncImage

@Preview(widthDp = 1280, heightDp = 600, showBackground = true)
@Composable
fun MusicPlayer() {
    Row(
        Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.secondaryContainer)
            .padding(20.dp)
    ) {
        MusicContent(
            Modifier
                .weight(3f)
                .fillMaxHeight()
                .padding(10.dp)
        )
        LyricsContent(
            Modifier
                .weight(3f)
                .fillMaxHeight()
                .padding(10.dp)
        )
        Column(Modifier.weight(2f)) {
            Text(text = "1")
        }
    }
}

@Composable
fun LyricsContent(modifier: Modifier) {
    Column(modifier) {
        Text("LyricsContent", color = MaterialTheme.colorScheme.onSecondaryContainer)
    }
}

@Composable
fun MusicContent(modifier: Modifier) {
    Column(
        modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
//        Image(
        AsyncImage(
            model = "https://p3.music.126.net/Yd8j0cuQf9Yv6k1zj59XXQ==/109951168239996277.jpg?param=240y240",
//            painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = "歌曲图片",
            Modifier.size(240.dp)
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            "想见你 电影原声带",
            style = MaterialTheme.typography.headlineSmall,
            color = MaterialTheme.colorScheme.onSecondaryContainer
        )
        Text(
            "群星",
            style = MaterialTheme.typography.titleMedium,
            color = MaterialTheme.colorScheme.onSecondaryContainer
        )
        Spacer(modifier = Modifier.height(10.dp))
        Slider(
            value = .5f, onValueChange = {}, colors = SliderDefaults.colors(
                activeTrackColor = MaterialTheme.colorScheme.primary,
                inactiveTrackColor = MaterialTheme.colorScheme.inversePrimary,
                thumbColor = MaterialTheme.colorScheme.primary
            )
        )
        Spacer(modifier = Modifier.height(10.dp))
        Row(
            Modifier
                .fillMaxWidth()
                .height(80.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = { /*TODO*/ },
                Modifier
                    .padding(horizontal = 10.dp)
                    .size(50.dp)) {
                Icon(
                    Icons.Filled.SkipPrevious,
                    contentDescription = "上一曲",
                    Modifier.size(50.dp),
                    tint = MaterialTheme.colorScheme.primary
                )
            }
            Spacer(modifier = Modifier.width(10.dp))
            IconButton(
                onClick = { /*TODO*/ },
                Modifier
                    .padding(horizontal = 10.dp)
                    .size(60.dp)
            ) {
                Icon(
                    Icons.Filled.PlayArrow,
                    contentDescription = "播放/暂停",
                    Modifier.size(60.dp),
                    tint = MaterialTheme.colorScheme.primary
                )
            }
            Spacer(modifier = Modifier.width(10.dp))
            IconButton(onClick = { /*TODO*/ },
                Modifier
                    .padding(horizontal = 10.dp)
                    .size(50.dp)) {
                Icon(
                    Icons.Filled.SkipNext,
                    contentDescription = "下一曲",
                    Modifier.size(50.dp),
                    tint = MaterialTheme.colorScheme.primary
                )
            }
        }
    }
}
