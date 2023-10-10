package com.caio.feed.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dioni.feed.R

@Composable
fun Peso(
    modifier: Modifier = Modifier
) {
    Surface(
        color = Color.Gray,
        shape = MaterialTheme.shapes.small,
        modifier = Modifier.width(260.dp).height(170.dp),
    ) {
        Column(
            modifier = modifier
                .fillMaxWidth()
                .padding(20.dp)
        ) {

            Text(
                text = "Peso",
                color = Color.White,
                fontSize = 15.sp
            )
            Text(
                text = "Últimos 30 dias",
                color = Color.LightGray,
                fontSize = 10.sp
            )

            Spacer(modifier = modifier.padding(7.dp))

            Row {
                Image(
                    painter = painterResource(id = R.drawable.grafico),
                    contentDescription = null,
                    modifier.size(200.dp)
                )
            }
        }//Column
    }//Surface
}//fun Peso





@Preview
@Composable
fun PesoPreview() {
    Peso()
}