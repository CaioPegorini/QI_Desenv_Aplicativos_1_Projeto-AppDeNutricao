package com.caio.feed.composables

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTextField(
    modifier: Modifier = Modifier,
    text: TextFieldValue,
    onTextChange: (TextFieldValue) -> Unit
) {
    TextField(
        value = text,
        onValueChange = onTextChange
    )
}


@Composable
fun MyTextFieldState(
    modifier: Modifier = Modifier
) {
    var txt by remember {
        mutableStateOf(TextFieldValue(""))
    }

    MyTextField(
        text = txt,
        onTextChange = { value -> txt = value }
    )
}