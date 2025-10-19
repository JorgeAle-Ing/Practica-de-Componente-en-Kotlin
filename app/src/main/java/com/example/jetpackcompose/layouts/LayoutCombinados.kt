package com.example.jetpackcompose.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.ui.unit.dp


@Preview(showBackground = true)
@Composable
fun MyComplexLayout() {
    Column(Modifier.fillMaxSize()) {

        Box(
            Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.Cyan),
            contentAlignment = Alignment.Center
        ){ Text(text = "Jorge Luis") }
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Yellow),
                contentAlignment = Alignment.Center
            ){Text(text = "Jorge Luis")}
            Spacer(modifier = Modifier.height(8.dp))
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Green),
                contentAlignment = Alignment.Center
            ){Text(text = "Jorge Luis")}

        }
            Spacer(modifier = Modifier.height(8.dp))
        Box(
            Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.Magenta),
            contentAlignment = Alignment.BottomCenter
        ){Text(text = "Jorge Luis")}
    }
}


