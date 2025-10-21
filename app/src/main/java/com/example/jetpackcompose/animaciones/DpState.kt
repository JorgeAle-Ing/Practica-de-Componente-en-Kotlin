package com.example.jetpackcompose.animaciones

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateOffsetAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun MyDpState(modifier: Modifier = Modifier) {
    var isSelected by remember { mutableStateOf(false) }
    val animatedColor by animateColorAsState(
        targetValue = if (isSelected) Color.Red else Color.Blue,
        label = ""
    )

    val animatedSize by animateDpAsState(
        targetValue = if (isSelected) 300.dp else 150.dp,
        label = ""
    )
    val animatedOffset by animateOffsetAsState(
        targetValue = if(isSelected) Offset(x = 0f, y = 100f) else Offset(x = 0f, y = 0f)
    )

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        Spacer(Modifier.height(32.dp))

        Button(onClick = { isSelected = !isSelected }) {
            Text(text = if (isSelected) "Rojo → Azul" else "Azul → Rojo")
        }

        Spacer(Modifier.height(50.dp))
        Box(
            modifier = Modifier
                .offset(animatedOffset.x.dp, animatedOffset.y.dp)
                .size(animatedSize)
                .background(animatedColor),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "¡Hola Mundo!", color = Color.White)
        }
    }
}

