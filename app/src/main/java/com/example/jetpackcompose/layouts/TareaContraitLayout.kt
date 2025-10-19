package com.example.jetpackcompose.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout


@Preview()
@Composable
fun FiguraEquisConstraint() {

    // Contenedor principal centrado en pantalla
    Box(
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        ConstraintLayout(
            modifier = Modifier.size(200.dp)
        ) {
            val (centro, azul, magenta, amarillo, verde) = createRefs()

            Box(
                modifier = Modifier
                    .size(120.dp)
                    .background(Color.Red)
                    .constrainAs(centro) {
                        centerTo(parent)
                    },
                contentAlignment = Alignment.Center
            ) {
                Text(text = "Jorge")
            }


            Box(
                modifier = Modifier
                    .size(120.dp)
                    .background(Color.Blue)
                    .constrainAs(azul) {
                        end.linkTo(centro.start, margin = 0.dp)
                        bottom.linkTo(centro.top, margin = 0.dp)
                    }
            )

            Box(
                modifier = Modifier
                    .size(120.dp)
                    .background(Color.Magenta)
                    .constrainAs(magenta) {
                        start.linkTo(centro.end, margin = 0.dp)
                        bottom.linkTo(centro.top, margin = 0.dp)
                    }
            )

            Box(
                modifier = Modifier
                    .size(120.dp)
                    .background(Color.Yellow)
                    .constrainAs(amarillo) {
                        end.linkTo(centro.start, margin = 0.dp)
                        top.linkTo(centro.bottom, margin = 0.dp)
                    }
            )

            Box(
                modifier = Modifier
                    .size(120.dp)
                    .background(Color.Green)
                    .constrainAs(verde) {
                        start.linkTo(centro.end, margin = 0.dp)
                        top.linkTo(centro.bottom, margin = 0.dp)
                    }
            )
        }
    }
}



