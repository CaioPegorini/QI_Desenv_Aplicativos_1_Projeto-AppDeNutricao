package com.caio.feed.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DateButton(
    modifier: Modifier = Modifier
) {
    Surface(
        color = Color.Gray,
        shape = MaterialTheme.shapes.small,
        modifier = Modifier
            .width(75.dp)
            .height(30.dp)
    ) {
        Row(
            modifier = Modifier,
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {

            Text(
                text = "Hoje v",
                color = Color.LightGray,
                fontSize = 18.sp,
                )
        }
    }
}



@Composable
@Preview
fun DateButtonPreview() {
    DateButton()
}