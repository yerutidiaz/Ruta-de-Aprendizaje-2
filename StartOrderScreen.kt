package com.example.cupcake.ui

import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cupcake.R
import com.example.cupcake.data.DataSource

@Composable
fun StartOrderScreen(
    quantityOptions: List<Pair<Int, Int>>,
    onBackButtonClicked: () -> Unit,
    onNextButtonClicked: (Int) -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(lightTan),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        // Flecha para volver atrás
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = onBackButtonClicked) {
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = "Back",
                    tint = black
                )
            }
            Text(
                text = stringResource(R.string.order_cupcakes),
                style = MaterialTheme.typography.headlineSmall.copy(
                    fontWeight = FontWeight.Bold,
                    color = black 
                )
            )
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Aquí se puede agregar una imagen
            Image(
                painter = cake.jpg (R.drawable.cupcake), 
                contentDescription = "Cupcake",
                modifier = Modifier
                    .size(200.dp)
                    .padding(16.dp)
            )
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            quantityOptions.forEach { item ->
                Button(
                    onClick = { onNextButtonClicked(item.second) },
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(darkTan, shape = RoundedCornerShape(8.dp)), // Gamuza oscuro
                    colors = ButtonDefaults.buttonColors(containerColor = lightTan) // Gamuza claro
                ) {
                    Text(
                        text = stringResource(item.first),
                        color = Color.White,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
    }
}


