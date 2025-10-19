package com.example.jetpackcompose.componentes

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
 * Guía de uso para componentes de Interacción y Botones.
 * Componentes incluidos:
 *  - Button
 *  - OutlinedButton
 *  - TextButton
 *  - FloatingActionButton
 */

@Composable
fun InteractionAndButtonsGuide() {
    var clickCount by remember { mutableStateOf(0) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {

        GuideSectionTitle("1. Button")

        Button(
            onClick = { clickCount++ },
            modifier = Modifier.fillMaxWidth(0.8f)
        ) {
            Icon(imageVector = Icons.Filled.Send, contentDescription = "Enviar")
            Spacer(modifier = Modifier.width(8.dp))
            Text("Enviar mensaje")
        }

        Text(
            text = "Button es el componente principal para acciones destacadas. Soporta íconos y texto.",
            style = MaterialTheme.typography.bodySmall
        )
        Text("Clicks: $clickCount", fontSize = 16.sp, color = MaterialTheme.colorScheme.primary)

        GuideSectionTitle("2. OutlinedButton")

        OutlinedButton(
            onClick = { clickCount = 0 },
            modifier = Modifier.fillMaxWidth(0.8f)
        ) {
            Icon(imageVector = Icons.Filled.Favorite, contentDescription = "Reiniciar")
            Spacer(modifier = Modifier.width(8.dp))
            Text("Reiniciar contador")
        }

        Text(
            text = "OutlinedButton tiene un borde visible y menos énfasis visual, ideal para acciones secundarias.",
            style = MaterialTheme.typography.bodySmall
        )

        GuideSectionTitle("3. TextButton")

        TextButton(
            onClick = { /* Acción liviana */ },
            modifier = Modifier.fillMaxWidth(0.8f)
        ) {
            Text("Más información")
        }

        Text(
            text = "TextButton es usado para acciones menos prioritarias o enlaces de texto.",
            style = MaterialTheme.typography.bodySmall
        )

        GuideSectionTitle("4. FloatingActionButton")

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp),
            contentAlignment = Alignment.Center
        ) {
            FloatingActionButton(
                onClick = { clickCount++ },
                containerColor = MaterialTheme.colorScheme.primary
            ) {
                Icon(
                    imageVector = Icons.Filled.Add,
                    contentDescription = "Agregar",
                    tint = MaterialTheme.colorScheme.onPrimary
                )
            }
        }

        Text(
            text = "FloatingActionButton representa una acción destacada flotante sobre la interfaz.",
            style = MaterialTheme.typography.bodySmall
        )
    }
}

@Composable
private fun GuideSectionTitle(title: String) {
    Text(
        text = title,
        fontWeight = androidx.compose.ui.text.font.FontWeight.Black,
        fontSize = 18.sp,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 16.dp, bottom = 4.dp)
    )
    Divider()
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun InteractionAndButtonsPreview() {
    InteractionAndButtonsGuide()
}
