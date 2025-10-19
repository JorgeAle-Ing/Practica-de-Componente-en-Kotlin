package com.example.jetpackcompose.uicomponents

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun ContainersAndProgressPreview() {
    ContainersAndProgress()
}

@Composable
fun ContainersAndProgress() {
    var progress by remember { mutableStateOf(0.3f) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(25.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "1. Card",
            style = MaterialTheme.typography.titleLarge
        )
        Card(
            modifier = Modifier.fillMaxWidth(),
            elevation = CardDefaults.cardElevation(8.dp)
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text("Componente Card", style = MaterialTheme.typography.titleMedium)
                Text("Agrupa contenido dentro de un contenedor con sombra y bordes redondeados.")
            }
        }
        Text(
            text = "2. Surface",
            style = MaterialTheme.typography.titleLarge
        )
        Surface(
            color = MaterialTheme.colorScheme.primaryContainer,
            tonalElevation = 4.dp,
            shadowElevation = 8.dp,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Surface: otro contenedor versátil con color, elevación y forma personalizable.",
                modifier = Modifier.padding(16.dp)
            )
        }

        Text(
            text = "3. Divider",
            style = MaterialTheme.typography.titleLarge
        )
        Divider(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            thickness = 2.dp,
            color = MaterialTheme.colorScheme.secondary
        )
        Text("El Divider separa visualmente secciones de contenido.")

        Text(
            text = "4. Progress Indicators",
            style = MaterialTheme.typography.titleLarge
        )
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text("Indicadores de progreso lineal y circular")

            LinearProgressIndicator(
                progress = progress,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp)
            )
            Spacer(modifier = Modifier.height(10.dp))
            CircularProgressIndicator(progress = progress)

            Spacer(modifier = Modifier.height(10.dp))
            Button(onClick = {
                progress += 0.1f
                if (progress > 1f) progress = 0f
            }) {
                Text("Aumentar Progreso")
            }
        }

        Text(
            text = "5. BadgeBox",
            style = MaterialTheme.typography.titleLarge
        )
        BadgedBox(
            badge = {
                Badge {
                    Text("3")
                }
            }
        ) {
            Icon(
                imageVector = Icons.Default.Email,
                contentDescription = "Icono con notificación"
            )
        }
        Text("El BadgeBox añade una insignia o número sobre un icono (como en las notificaciones).")
    }
}

