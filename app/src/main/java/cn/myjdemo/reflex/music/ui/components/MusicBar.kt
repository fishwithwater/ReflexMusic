package cn.myjdemo.reflex.music.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun MusicBar(openMusicSheet: () -> Unit) {
    Row(
        Modifier
            .fillMaxWidth()
            .height(80.dp)
            .clickable { openMusicSheet() }
            .background(MaterialTheme.colorScheme.secondaryContainer)
            .padding(10.dp)
    ) {
        Row(
            Modifier
                .fillMaxHeight()
                .weight(1f),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            AsyncImage(
                model = "https://p3.music.126.net/Yd8j0cuQf9Yv6k1zj59XXQ==/109951168239996277.jpg?param=100y100",
                contentDescription = "歌曲图片",
                Modifier.size(60.dp)
            )
            Column(
                Modifier
                    .padding(10.dp)
            ) {
                Text(text = "《想见你》电影原声带", maxLines = 1, overflow = TextOverflow.Ellipsis, color = MaterialTheme.colorScheme.onSecondaryContainer)
                Text(text = "群星", maxLines = 1, overflow = TextOverflow.Ellipsis, color = MaterialTheme.colorScheme.onSecondaryContainer)
            }
        }
        Row(
            Modifier
                .fillMaxHeight()
                .weight(1f),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            IconButton(onClick = { /*TODO*/ }, Modifier.padding(horizontal = 10.dp)) {
                Icon(
                    Icons.Filled.SkipPrevious,
                    contentDescription = "上一曲",
                    Modifier.size(40.dp),
                    tint = MaterialTheme.colorScheme.onSecondaryContainer
                )
            }
            IconButton(
                onClick = { /*TODO*/ },
                Modifier
                    .padding(horizontal = 10.dp)
            ) {
                Icon(
                    Icons.Filled.PlayArrow,
                    contentDescription = "播放/暂停",
                    Modifier.size(70.dp),
                    tint = MaterialTheme.colorScheme.onSecondaryContainer
                )
            }
            IconButton(onClick = { /*TODO*/ }, Modifier.padding(horizontal = 10.dp)) {
                Icon(
                    Icons.Filled.SkipNext,
                    contentDescription = "下一曲",
                    Modifier.size(40.dp),
                    tint = MaterialTheme.colorScheme.onSecondaryContainer
                )
            }
        }
        Row(
            Modifier
                .fillMaxHeight()
                .weight(1f),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.End
        ) {
            IconButton(onClick = { /*TODO*/ }, Modifier.padding(horizontal = 10.dp)) {
                Icon(
                    Icons.Filled.Repeat,
                    contentDescription = "循环模式",
                    Modifier.size(30.dp),
                    tint = MaterialTheme.colorScheme.onSecondaryContainer
                )
            }
            IconButton(onClick = { /*TODO*/ }, Modifier.padding(horizontal = 10.dp)) {
                Icon(
                    Icons.Filled.PlaylistPlay,
                    contentDescription = "列表",
                    Modifier.size(40.dp),
                    tint = MaterialTheme.colorScheme.onSecondaryContainer
                )
            }
        }
    }
}

@Preview(widthDp = 1280, heightDp = 80, showBackground = true)
@Composable
fun PreviewMusicBar() {
    MusicBar {  }
}
