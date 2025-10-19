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

@Preview
@Composable
fun FiguraFinalConstraint() {

    Box(
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        ConstraintLayout(
            modifier = Modifier.size(300.dp)
        ) {
            val (centro, azul, magenta, amarillo, verde, celeste, negro1, negro2) = createRefs()

            Box(
                modifier = Modifier
                    .size(95.dp)
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
                    .size(95.dp)
                    .background(Color.Blue)
                    .constrainAs(azul) {
                        end.linkTo(centro.start)
                        bottom.linkTo(centro.top)
                    }
            )

            Box(
                modifier = Modifier
                    .size(95.dp)
                    .background(Color.Magenta)
                    .constrainAs(magenta) {
                        start.linkTo(centro.end)
                        bottom.linkTo(centro.top)
                    }
            )

            Box(
                modifier = Modifier
                    .size(100.dp)
                    .background(Color.Yellow)
                    .constrainAs(amarillo) {
                        end.linkTo(centro.start)
                        top.linkTo(centro.bottom)
                    }
            )

            Box(
                modifier = Modifier
                    .size(100.dp)
                    .background(Color.Green)
                    .constrainAs(verde) {
                        start.linkTo(centro.end)
                        top.linkTo(centro.bottom)
                    }
            )

            Box(
                modifier = Modifier
                    .size(34.dp)
                    .background(Color.Cyan)
                    .constrainAs(celeste) {
                        bottom.linkTo(centro.top, margin = 0.dp)
                        start.linkTo(centro.start)
                        end.linkTo(centro.end)
                        horizontalBias = -0.0f
                    }
            )

            Box(
                modifier = Modifier
                    .size(32.dp)
                    .background(Color.Black)
                    .constrainAs(negro1) {
                        top.linkTo(celeste.top, margin = -30.dp)
                        start.linkTo(celeste.start, margin = 30.dp)
                    }
            )

            Box(
                modifier = Modifier
                    .size(34.dp)
                    .background(Color.Black)
                    .constrainAs(negro2) {
                        top.linkTo(negro1.top, margin = -30.dp)
                        start.linkTo(negro1.start, margin = 30.dp)
                    }
            )
        }
    }
}

