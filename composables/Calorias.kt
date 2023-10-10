package com.caio.feed.composables

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.CircularProgressIndicator
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
fun Calorias(
    modifier: Modifier = Modifier
) {
    Surface(
        color = Color.Gray,
        shape = MaterialTheme.shapes.small,
        modifier = modifier
            .width(260.dp)
            .height(170.dp)
            .padding(20.dp)
    ) {
        Column {
            Text(
                text = "Calorias",
                color = Color.White,
                fontSize = 15.sp
            )
            Row(
                modifier = modifier.fillMaxWidth()
            ) {

                Column(
                    //modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {


                    Spacer(modifier = modifier.padding(5.dp))
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            modifier = modifier.size(20.dp),
                            painter = painterResource(id = R.drawable.banderinha),
                            tint = Color.Green,
                            contentDescription = null
                        )
                        Spacer(modifier = modifier.padding(horizontal = 3.dp))
                        Column {
                            Text(text = "Tempo", color = Color.LightGray, fontSize = 10.sp)
                            Text(
                                text = "00:00",
                                color = Color.White,
                                fontWeight = FontWeight.Bold,
                                fontSize = 10.sp
                            )
                        }//Column
                    }//Row
                    Spacer(modifier = modifier.padding(horizontal = 5.dp))
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            modifier = modifier.size(20.dp),
                            painter = painterResource(id = R.drawable.talheres),
                            tint = Color.DarkGray,
                            contentDescription = null
                        )
                        Spacer(modifier = modifier.padding(horizontal = 5.dp))
                        Column {
                            Text(text = "Tempo", color = Color.LightGray, fontSize = 10.sp)
                            Text(
                                text = "00:00",
                                color = Color.White,
                                fontWeight = FontWeight.Bold,
                                fontSize = 10.sp
                            )
                        }//Column
                    }//Row
                    Spacer(modifier = modifier.padding(horizontal = 5.dp))
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            modifier = modifier.size(20.dp),
                            painter = painterResource(id = R.drawable.foguinho),
                            tint = Color.Red,
                            contentDescription = null
                        )
                        Spacer(modifier = modifier.padding(horizontal = 3.dp))
                        Column {
                            Text(text = "Queima", color = Color.LightGray, fontSize = 10.sp)
                            Text(
                                text = "0 kcal",
                                color = Color.White,
                                fontWeight = FontWeight.Bold,
                                fontSize = 10.sp
                            )
                        }//Column
                    }//Row
                }//Column

                Box(
                    modifier = Modifier,
                    contentAlignment = Alignment.Center
                ) {
                    CircularProgressIndicator(
                        progress = 0.9f, //Vai de 0 até 1 (float)
                        color = Color.White,
                        modifier.size(80.dp)
                    )
                    Column {
                        Text(text = "Faltam", color = Color.LightGray, fontSize = 10.sp)
                        Text(text = "620 kcal", color = Color.LightGray, fontSize = 13.sp)
                    }
                }

            }
        }//Row
    }//Surface
}//fun Ca

@Preview
@Composable
fun CaloriasPrev() {
    Calorias()
}