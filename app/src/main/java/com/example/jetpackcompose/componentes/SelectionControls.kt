package com.example.jetpackcompose.componentes

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
 * Guía de uso para componentes de Controles de Selección.
 * Componentes incluidos:
 *  - Switch
 *  - CheckBox
 *  - CheckBox con texto
 *  - DropdownMenu
 */

@Composable
fun SelectionControlsGuide() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        GuideSectionTitle("1. Switch")

        var switchState by remember { mutableStateOf(false) }

        Row(verticalAlignment = Alignment.CenterVertically) {
            Switch(
                checked = switchState,
                onCheckedChange = { switchState = it }
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(if (switchState) "Activado" else "Desactivado")
        }

        Text(
            text = "Switch permite alternar entre dos estados (activo/inactivo).",
            style = MaterialTheme.typography.bodySmall
        )

        GuideSectionTitle("2. CheckBox")

        var checkState by remember { mutableStateOf(false) }

        Checkbox(
            checked = checkState,
            onCheckedChange = { checkState = it }
        )

        Text(
            text = "Checkbox permite seleccionar o deseleccionar una opción individual.",
            style = MaterialTheme.typography.bodySmall
        )

        GuideSectionTitle("3. CheckBox con texto")

        var acceptTerms by remember { mutableStateOf(false) }

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth(0.8f)
                .clickable { acceptTerms = !acceptTerms }
        ) {
            Checkbox(
                checked = acceptTerms,
                onCheckedChange = { acceptTerms = it }
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text("Acepto los términos y condiciones")
        }

        Text(
            text = "Usa una fila (Row) para combinar Checkbox con texto u otros elementos.",
            style = MaterialTheme.typography.bodySmall
        )

        GuideSectionTitle("4. DropdownMenu")

        var expanded by remember { mutableStateOf(false) }
        var selectedOption by remember { mutableStateOf("Selecciona una opción") }
        val options = listOf("Opción 1", "Opción 2", "Opción 3")

        Box(
            modifier = Modifier.fillMaxWidth(0.8f),
            contentAlignment = Alignment.Center
        ) {
            OutlinedButton(
                onClick = { expanded = true },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(selectedOption)
                Spacer(modifier = Modifier.width(4.dp))
                Icon(imageVector = Icons.Default.ArrowDropDown, contentDescription = null)
            }

            DropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false },
                modifier = Modifier.fillMaxWidth(0.8f)
            ) {
                options.forEach { option ->
                    DropdownMenuItem(
                        text = { Text(option) },
                        onClick = {
                            selectedOption = option
                            expanded = false
                        }
                    )
                }
            }
        }

        Text(
            text = "DropdownMenu permite mostrar una lista de opciones seleccionables.",
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
fun SelectionControlsPreview() {
    SelectionControlsGuide()
}
