package com.example.jetpackcompose.layouts

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun MyRow() {
    Row(modifier = Modifier.fillMaxSize()) {
        Text(text = "Item 1", Modifier.weight(weight = 1f))
        Text(text = "Item 2", Modifier.weight(weight = 1f))
        Text(text = "Item 3", Modifier.weight(weight = 1f))
    }
}

