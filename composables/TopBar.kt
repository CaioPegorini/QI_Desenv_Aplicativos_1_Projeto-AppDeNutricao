package com.caio.feed.composables

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dioni.feed.R
import com.dioni.feed.ui.theme.FeedTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTopBar(
    modifier: Modifier = Modifier,
){
    Surface(
        color = Color(0xFF005500)
    ) {
        Column {
            CenterAlignedTopAppBar(
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    Color(0xFF005500)
                ),
                title = {
                    Image(
                        modifier = modifier.size(100.dp),
                        painter = painterResource(id = R.drawable.logo),
                        contentDescription = null
                    )//Image
                },//title
                navigationIcon = {
                    IconButton(
                        onClick = { /*TODO*/ },
                        content = {
                            Icon(
                                tint = Color.White,
                                imageVector = Icons.Outlined.Menu,
                                contentDescription = null
                            )//Icon
                        })//IconButton
                },//NavigationIcon
                actions = {
                    IconButton(
                        onClick = { /*TODO*/ },
                        content = {
                            Icon(
                                tint = Color.White,
                                imageVector = Icons.Outlined.AccountCircle,
                                contentDescription = null
                            )//Icon
                        })//IconButton

                },//action
            )//CenterAlignedTopBar
            MySearch()
        }
    }//Column

}//MyTopBar


@Preview(
    showBackground = true,
    name = "Light Mode",
    //widthDp = 320,
    //heightDp = 480
)//Preview Light Mode
@Preview(
    showBackground = true,
    name = "Dark Mode",
    //widthDp = 320,
    //heightDp = 480,
    uiMode = Configuration.UI_MODE_NIGHT_YES

)//Preview Dark Mode

@Composable
fun DefaultPreview() {
    FeedTheme {
        MyTopBar()
    }
}