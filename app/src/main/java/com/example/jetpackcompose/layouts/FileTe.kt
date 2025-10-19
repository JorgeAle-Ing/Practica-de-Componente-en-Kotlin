package com.example.jetpackcompose.layouts

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun MyTextoActivity(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var myText by rememberSaveable { mutableStateOf("") }
        var myText1 by rememberSaveable { mutableStateOf("") }

        TextField(
            value = myText,
            onValueChange = { input ->
                myText = input.replace("\n", "").replace("\r", "")
            },
            label = { Text("Ingresa tu nombre") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            singleLine = true
        )


        Spacer(modifier = Modifier.padding(10.dp))

        TextField(
            value = myText1,
            onValueChange = { if (it.length <= 8) myText1 = it },
            label = { Text("Ingresa tu DNI") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )

        Spacer(modifier = Modifier.padding(10.dp))

        Button(onClick = { }) {
            Text("Ingresar")
        }
    }
}

