package com.caio.feed.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dioni.feed.R


@Composable
fun Cuidados(
    modifier: Modifier = Modifier
) {
    Surface(
        color = Color.Gray,
        shape = MaterialTheme.shapes.large,
        modifier = modifier.width(124.dp)
    ) {
        Column(
            modifier = modifier
                .fillMaxWidth()
                .padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = "Cuidados",
                color = Color.White,
                fontSize = 20.sp
            )

            Spacer(modifier = modifier.padding(5.dp))

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    modifier = modifier.size(50.dp),
                    painter = painterResource(id = R.drawable.passos),
                    tint = Color(0xFF883A21),
                    contentDescription = null
                )
                Spacer(modifier = modifier.padding(horizontal = 3.dp))
                Column {
                    Text(text = "Passos", color = Color.LightGray)
                    Text(text = "0 m", color = Color.White, fontWeight = FontWeight.Bold)
                }//Column
            }//Row

            Spacer(modifier = modifier.padding(5.dp))

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    modifier = modifier.size(50.dp),
                    painter = painterResource(id = R.drawable.agua),
                    tint = Color.Blue,
                    contentDescription = null)
                Spacer(modifier = modifier.padding(horizontal = 3.dp))
                Column {
                    Text(text = "Água", color = Color.LightGray)
                    Text(text = "0 ml", color = Color.White, fontWeight = FontWeight.Bold)
                }//Column
            }//Row
        }//Column
    }//Surface
}//fun Exercicios




@Preview
@Composable
fun CuidadosPreview() {
    Cuidados()
}