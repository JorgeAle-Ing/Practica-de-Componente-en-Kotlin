package com.example.jetpackcompose.uicomponents

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * Ejemplo de controles de valor:
 * Incluye Slider individual y un conjunto de Sliders en sección.
 */

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ValueControlsGuide() {
    var sliderValue by remember { mutableStateOf(0.5f) }
    var redValue by remember { mutableStateOf(0.3f) }
    var greenValue by remember { mutableStateOf(0.6f) }
    var blueValue by remember { mutableStateOf(0.8f) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Controles de Valor (Sliders)") }
            )
        }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            contentAlignment = Alignment.Center
        ) {

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 24.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(24.dp)
            ) {

                ElevatedCard(
                    modifier = Modifier.fillMaxWidth(),
                    colors = CardDefaults.elevatedCardColors(
                        containerColor = MaterialTheme.colorScheme.surfaceVariant
                    )
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(20.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = "Slider",
                            style = MaterialTheme.typography.titleMedium
                        )
                        Spacer(Modifier.height(8.dp))
                        Text(
                            text = "Permite seleccionar un valor dentro de un rango continuo (0.0 a 1.0).",
                            textAlign = TextAlign.Center
                        )
                        Spacer(Modifier.height(16.dp))
                        Slider(
                            value = sliderValue,
                            onValueChange = { sliderValue = it },
                            valueRange = 0f..1f,
                            modifier = Modifier.fillMaxWidth(0.9f)
                        )
                        Spacer(Modifier.height(8.dp))
                        Text("Valor actual: ${String.format("%.2f", sliderValue)}")
                    }
                }

                ElevatedCard(
                    modifier = Modifier.fillMaxWidth(),
                    colors = CardDefaults.elevatedCardColors(
                        containerColor = MaterialTheme.colorScheme.surfaceVariant
                    )
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(20.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = "Section Slider",
                            style = MaterialTheme.typography.titleMedium
                        )
                        Spacer(Modifier.height(8.dp))
                        Text(
                            text = "Conjunto de Sliders que controlan valores independientes, por ejemplo componentes de color RGB.",
                            textAlign = TextAlign.Center
                        )
                        Spacer(Modifier.height(16.dp))

                        // Slider Rojo
                        Text("Rojo: ${String.format("%.2f", redValue)}")
                        Slider(
                            value = redValue,
                            onValueChange = { redValue = it },
                            valueRange = 0f..1f,
                            colors = SliderDefaults.colors(
                                thumbColor = MaterialTheme.colorScheme.error,
                                activeTrackColor = MaterialTheme.colorScheme.error
                            )
                        )
                        Spacer(Modifier.height(8.dp))

                        // Slider Verde
                        Text("Verde: ${String.format("%.2f", greenValue)}")
                        Slider(
                            value = greenValue,
                            onValueChange = { greenValue = it },
                            valueRange = 0f..1f,
                            colors = SliderDefaults.colors(
                                thumbColor = MaterialTheme.colorScheme.primary,
                                activeTrackColor = MaterialTheme.colorScheme.primary
                            )
                        )
                        Spacer(Modifier.height(8.dp))

                        // Slider Azul
                        Text("Azul: ${String.format("%.2f", blueValue)}")
                        Slider(
                            value = blueValue,
                            onValueChange = { blueValue = it },
                            valueRange = 0f..1f,
                            colors = SliderDefaults.colors(
                                thumbColor = MaterialTheme.colorScheme.tertiary,
                                activeTrackColor = MaterialTheme.colorScheme.tertiary
                            )
                        )

                        Spacer(Modifier.height(16.dp))
                        Surface(
                            modifier = Modifier
                                .size(80.dp)
                                .padding(8.dp),
                            color = androidx.compose.ui.graphics.Color(
                                redValue,
                                greenValue,
                                blueValue
                            ),
                            shape = MaterialTheme.shapes.medium
                        ) {}
                        Text(
                            text = "Color resultante",
                            style = MaterialTheme.typography.bodyMedium
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ValueControlsPreview() {
    ValueControlsGuide()
}
