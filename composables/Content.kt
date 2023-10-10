package com.caio.feed.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Content(
    modifier: Modifier = Modifier,
    list: List<Unit> = List(1) {}
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.padding(25.dp)
    ) {
        DateButton()
        Spacer(modifier = modifier.padding(22.dp))
        Calorias()
        Spacer(modifier = modifier.padding(22.dp))
        Row(
            modifier = modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Exercicios()
            Spacer(modifier = modifier.width(32.dp))
            Cuidados()
        }
        Spacer(modifier = modifier.padding(22.dp))
        Peso()
    }
}


@Preview
@Composable
fun BodyAppPreview() {
    Content()
}