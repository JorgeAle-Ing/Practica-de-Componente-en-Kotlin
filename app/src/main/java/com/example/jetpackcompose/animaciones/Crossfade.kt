package com.example.jetpackcompose.animaciones

import androidx.compose.animation.Crossfade
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.graphics.Color
import androidx.compose.material3.Surface

@Preview(showBackground = true)
@Composable
fun MyCrossfade(modifier: Modifier = Modifier) {
    var currentScreen by remember { mutableStateOf("Welcome") }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(top = 50.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(
                text = "Welcome",
                modifier = Modifier.clickable { currentScreen = "Welcome" },
                color = if (currentScreen == "Welcome") Color.Blue else Color.Black,
                fontWeight = if (currentScreen == "Welcome") FontWeight.Bold else FontWeight.Normal
            )

            Text(
                text = "Home",
                modifier = Modifier.clickable { currentScreen = "Home" },
                color = if (currentScreen == "Home") Color.Blue else Color.Black,
                fontWeight = if (currentScreen == "Home") FontWeight.Bold else FontWeight.Normal
            )
        }

        Crossfade(targetState = currentScreen, label = "") { screen ->
            when (screen) {
                "Welcome" -> WelcomeScreen()
                "Home" -> HomeScreen()
            }
        }
    }
}

@Composable
fun WelcomeScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        contentAlignment = Alignment.Center
    ) {
        Surface(color = Color(0xFFBBDEFB), modifier = Modifier.fillMaxSize()) {
            Box(contentAlignment = Alignment.Center) {
                Text(text = "¡Bienvenido a la app!", color = Color.Black, fontWeight = FontWeight.Bold)
            }
        }
    }
}

@Composable
fun HomeScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        contentAlignment = Alignment.Center
    ) {
        Surface(color = Color(0xFFC8E6C9), modifier = Modifier.fillMaxSize()) {
            Box(contentAlignment = Alignment.Center) {
                Text(text = "Esta es la pantalla Home", color = Color.Black, fontWeight = FontWeight.Bold)
            }
        }
    }
}
