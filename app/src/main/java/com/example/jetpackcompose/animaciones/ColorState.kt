package com.example.jetpackcompose.animaciones

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun MyColorState(modifier: Modifier = Modifier) {
    var isSelected by remember { mutableStateOf(false) }
    val animatedColor by animateColorAsState(
        targetValue = if (isSelected) Color.Red else Color.Blue,
        label = ""
    )

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Spacer(Modifier.height(32.dp))

        Button(onClick = { isSelected = !isSelected }) {
            Text(text = if (isSelected) "Rojo → Azul" else "Azul → Rojo")
        }

        Spacer(Modifier.height(50.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
                .background(animatedColor),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "¡Hola Mundo!", color = Color.White)
        }
    }
}

