package com.caio.feed.composables

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MySearch(
    modifier: Modifier = Modifier
){
    Surface(
        color = Color.Gray,
        shape = MaterialTheme.shapes.medium,
        modifier = modifier
            .padding(15.dp)
            .fillMaxWidth()
    ) {
        Row(
            modifier = modifier.padding(10.dp)
        ){
            Icon(
                tint = Color.White,
                imageVector = Icons.Outlined.Search,
                contentDescription = null
            )
            Text(
                color = Color.White,
                text = "Busque por alimento...")
            Spacer(modifier = modifier.width(10.dp))
            BasicTextField(
                value = "Busque por alimento...",
                onValueChange = {  }
            ) {

            }
        }
    }
}

@Preview
@Composable
fun MySearchPreview() {
    MySearch()
}