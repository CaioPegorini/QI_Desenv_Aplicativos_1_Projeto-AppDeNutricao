package com.caio.feed

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.dioni.feed.ui.theme.FeedTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FeedTheme {
                FeedApp()
            }//FeedTheme
        }//setContent
    }//onCreate
}//MainActivity
@Composable
fun FeedApp() {
}//FeedApp


@Preview(
    showBackground = true,
    name = "Light Mode",
    widthDp = 320,
    heightDp = 480
)//Preview Light Mode
@Preview(
    showBackground = true,
    name = "Dark Mode",
    widthDp = 320,
    heightDp = 480,
    uiMode = Configuration.UI_MODE_NIGHT_YES

)//Preview Dark Mode

@Composable
fun DefaultPreview() {
    FeedTheme {
        FeedApp()
    }
}