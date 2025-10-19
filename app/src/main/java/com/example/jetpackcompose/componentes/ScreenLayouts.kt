package com.example.jetpackcompose.uicomponents

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * Guía de uso para componentes de Layouts y Estructura de Pantalla.
 * Incluye: Scaffold, TopAppBar y BottomBar.
 */

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScreenLayoutsGuide() {
    var selectedItem by remember { mutableStateOf(0) }

    Scaffold(
        topBar = {

            TopAppBar(
                title = { Text("Ejemplo de TopAppBar") },
                navigationIcon = {
                    IconButton(onClick = { }) {
                        Icon(
                            imageVector = Icons.Filled.Home,
                            contentDescription = "Inicio"
                        )
                    }
                },
                actions = {
                    IconButton(onClick = { }) {
                        Icon(
                            imageVector = Icons.Filled.Share,
                            contentDescription = "Compartir"
                        )
                    }
                }
            )
        },

        bottomBar = {
            NavigationBar {
                NavigationBarItem(
                    selected = selectedItem == 0,
                    onClick = { selectedItem = 0 },
                    icon = { Icon(Icons.Filled.Home, contentDescription = "Inicio") },
                    label = { Text("Inicio") }
                )
                NavigationBarItem(
                    selected = selectedItem == 1,
                    onClick = { selectedItem = 1 },
                    icon = { Icon(Icons.Filled.Settings, contentDescription = "Configuración") },
                    label = { Text("Ajustes") }
                )
            }
        }
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Contenido Principal",
                    style = MaterialTheme.typography.titleLarge
                )
                Text(
                    text = "El Scaffold organiza TopBar, contenido y BottomBar de forma automática.",
                    modifier = Modifier.padding(top = 8.dp),
                    style = MaterialTheme.typography.bodyMedium
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ScreenLayoutsPreview() {
    ScreenLayoutsGuide()
}
