package com.example.jetpackcompose.componentes

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcompose.R

/**
 * Guía de uso para componentes de Entrada de Texto y Visualización.
 * Componentes incluidos:
 *  - Text
 *  - TextField
 *  - OutlinedTextField
 *  - Icon
 *  - Image
 */

@Composable
fun TextInputsAndDisplayGuide() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        GuideSectionTitle("1. Text")
        Text(
            text = "Hola, Jetpack Compose!",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = "El componente Text muestra texto estático o dinámico en pantalla.",
            style = MaterialTheme.typography.bodyMedium
        )

        Spacer(modifier = Modifier.height(16.dp))

        GuideSectionTitle("2. TextField")
        var textFieldValue by remember { mutableStateOf("Texto editable") }
        TextField(
            value = textFieldValue,
            onValueChange = { textFieldValue = it.replace("\n", "").replace("\r", "") },
            label = { Text("Etiqueta del TextField") },
            placeholder = { Text("Escribe algo aquí") },
            modifier = Modifier.fillMaxWidth(0.9f),
            singleLine = true
        )
        Text(
            text = "TextField permite al usuario ingresar texto. Se usa normalmente para formularios.",
            style = MaterialTheme.typography.bodySmall,
            modifier = Modifier.padding(top = 4.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        GuideSectionTitle("3. OutlinedTextField")
        var outlinedTextFieldValue by remember { mutableStateOf("Contorneado") }
        OutlinedTextField(
            value = outlinedTextFieldValue,
            onValueChange = { outlinedTextFieldValue = it.replace("\n", "").replace("\r", "") },
            label = { Text("Etiqueta Contorneada") },
            modifier = Modifier.fillMaxWidth(0.9f),
            singleLine = true
        )
        Text(
            text = "OutlinedTextField ofrece un diseño más definido con borde exterior.",
            style = MaterialTheme.typography.bodySmall,
            modifier = Modifier.padding(top = 4.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        GuideSectionTitle("4. Icon")
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Filled.Info,
                contentDescription = "Icono de información",
                tint = MaterialTheme.colorScheme.error,
                modifier = Modifier.size(32.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text("Icono cargado desde Material Icons")
        }
        Text(
            text = "Icon muestra símbolos gráficos. Se usa comúnmente en botones o indicadores.",
            style = MaterialTheme.typography.bodySmall,
            modifier = Modifier.padding(top = 4.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        GuideSectionTitle("5. Image")

        Image(
            painter = painterResource(id = R.drawable.placeholder), // <- usa tu imagen "placeholder.jpg"
            contentDescription = "Ejemplo de imagen local",
            modifier = Modifier
                .size(150.dp)
                .padding(8.dp)
        )
        Text(
            text = "Image muestra contenido visual cargado desde recursos locales o URLs.",
            style = MaterialTheme.typography.bodySmall,
            modifier = Modifier.padding(top = 4.dp)
        )
    }
}

@Composable
private fun GuideSectionTitle(title: String) {
    Text(
        text = title,
        fontWeight = FontWeight.Black,
        fontSize = 18.sp,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 16.dp, bottom = 4.dp)
    )
    Divider()
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TextInputsAndDisplayPreview() {
    TextInputsAndDisplayGuide()
}
