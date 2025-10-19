package com.example.jetpackcompose.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun EjemploColumn() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(state = rememberScrollState()),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = "Text 1",
            modifier = Modifier
                .background(Color.Red)
                .padding(8.dp)
        )
        Text(
            text = "Text 2",
            modifier = Modifier
                .background(Color.Gray)
                .padding(8.dp)
        )
        Text(
            text = "Text 3",
            modifier = Modifier
                .background(Color.Yellow)
                .padding(8.dp)
        )
        Text(
            text = "Text 4",
            modifier = Modifier
                .background(Color.Blue)
                .padding(8.dp)
        )
        Text(
            text = "Text 1",
            modifier = Modifier
                .background(Color.Red)
                .padding(8.dp)
        )
        Text(
            text = "Text 2",
            modifier = Modifier
                .background(Color.Gray)
                .padding(8.dp)
        )
        Text(
            text = "Text 3",
            modifier = Modifier
                .background(Color.Yellow)
                .padding(8.dp)
        )
        Text(
            text = "Text 4",
            modifier = Modifier
                .background(Color.Blue)
                .padding(8.dp)
        )
        Text(
            text = "Text 1",
            modifier = Modifier
                .background(Color.Red)
                .padding(8.dp)
        )
        Text(
            text = "Text 2",
            modifier = Modifier
                .background(Color.Gray)
                .padding(8.dp)
        )
        Text(
            text = "Text 3",
            modifier = Modifier
                .background(Color.Yellow)
                .padding(8.dp)
        )
        Text(
            text = "Text 4",
            modifier = Modifier
                .background(Color.Blue)
                .padding(8.dp)
        )
        Text(
            text = "Text 1",
            modifier = Modifier
                .background(Color.Red)
                .padding(8.dp)
        )
        Text(
            text = "Text 2",
            modifier = Modifier
                .background(Color.Gray)
                .padding(8.dp)
        )
        Text(
            text = "Text 3",
            modifier = Modifier
                .background(Color.Yellow)
                .padding(8.dp)
        )
        Text(
            text = "Text 4",
            modifier = Modifier
                .background(Color.Blue)
                .padding(8.dp)
        )
        Text(
            text = "Text 1",
            modifier = Modifier
                .background(Color.Red)
                .padding(8.dp)
        )
        Text(
            text = "Text 2",
            modifier = Modifier
                .background(Color.Gray)
                .padding(8.dp)
        )
        Text(
            text = "Text 3",
            modifier = Modifier
                .background(Color.Yellow)
                .padding(8.dp)
        )
        Text(
            text = "Text 4",
            modifier = Modifier
                .background(Color.Blue)
                .padding(8.dp)
        )
        Text(
            text = "Text 1",
            modifier = Modifier
                .background(Color.Red)
                .padding(8.dp)
        )
        Text(
            text = "Text 2",
            modifier = Modifier
                .background(Color.Gray)
                .padding(8.dp)
        )
        Text(
            text = "Text 3",
            modifier = Modifier
                .background(Color.Yellow)
                .padding(8.dp)
        )
        Text(
            text = "Text 4",
            modifier = Modifier
                .background(Color.Blue)
                .padding(8.dp)
        )
        Text(
            text = "Text 1",
            modifier = Modifier
                .background(Color.Red)
                .padding(8.dp)
        )
        Text(
            text = "Text 2",
            modifier = Modifier
                .background(Color.Gray)
                .padding(8.dp)
        )
        Text(
            text = "Text 3",
            modifier = Modifier
                .background(Color.Yellow)
                .padding(8.dp)
        )
        Text(
            text = "Text Final",
            modifier = Modifier
                .background(Color.Blue)
                .padding(8.dp)
        )
    }
}
