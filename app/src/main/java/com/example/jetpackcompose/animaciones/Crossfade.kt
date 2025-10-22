package com.example.jetpackcompose.animaciones

import androidx.compose.animation.Crossfade
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.graphics.Color
import com.example.jetpackcompose.screens.WelcomeScreen
import com.example.jetpackcompose.screens.HomeScreen

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
                .padding(horizontal = 24.dp, vertical = 16.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(
                onClick = { currentScreen = "Welcome" },
                colors = ButtonDefaults.buttonColors(
                    containerColor = if (currentScreen == "Welcome") Color(0xFF64B5F6) else Color(0xFFE3F2FD),
                    contentColor = if (currentScreen == "Welcome") Color.White else Color(0xFF0D47A1)
                ),
                shape = MaterialTheme.shapes.medium,
                modifier = Modifier
                    .height(50.dp)
                    .width(130.dp)
            ) {
                Text(
                    text = "Welcome",
                    fontWeight = if (currentScreen == "Welcome") FontWeight.Bold else FontWeight.Normal
                )
            }

            Button(
                onClick = { currentScreen = "Home" },
                colors = ButtonDefaults.buttonColors(
                    containerColor = if (currentScreen == "Home") Color(0xFF81C784) else Color(0xFFE8F5E9),
                    contentColor = if (currentScreen == "Home") Color.White else Color(0xFF1B5E20)
                ),
                shape = MaterialTheme.shapes.medium,
                modifier = Modifier
                    .height(50.dp)
                    .width(130.dp)
            ) {
                Text(
                    text = "Home",
                    fontWeight = if (currentScreen == "Home") FontWeight.Bold else FontWeight.Normal
                )
            }
        }

        Crossfade(targetState = currentScreen, label = "") { screen ->
            when (screen) {
                "Welcome" -> WelcomeScreen()
                "Home" -> HomeScreen()
            }
        }
    }
}

