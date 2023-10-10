package com.caio.feed.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.caio.feed.composables.Content
import com.caio.feed.composables.MyTopBar


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomePage(
    modifier: Modifier = Modifier
) {
    Scaffold(
        topBar = { MyTopBar() },
        content = {
            Column(modifier = modifier.padding(it)) {
                //MyTopBar()
                Content()
            }
        }
    )
}


@Composable
@Preview
fun HomePagePreview() {
    HomePage()
}