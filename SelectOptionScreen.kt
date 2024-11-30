package com.example.cupcake.ui

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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cupcake.R
import com.example.cupcake.ui.theme.CupcakeTheme

@Composable
fun SelectOptionScreen(
    subtotal: String,
    options: List<String>,
    onSelectionChanged: (String) -> Unit,
    onCancelButtonClicked: () -> Unit,
    onNextButtonClicked: () -> Unit,
    onBackButtonClicked: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFF5DEB3)), 
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        // volver atrás
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
                    tint = Color(0xFF8B4513) 
                )
            }
            Text(
                text = stringResource(R.string.select_options),
                style = MaterialTheme.typography.headlineSmall.copy(
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF8B4513) 
                )
            )
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            options.forEach { option ->
                Button(
                    onClick = { onSelectionChanged(option) },
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color(0xFFA0522D), shape = RoundedCornerShape(8.dp)), 
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFDEB887)) 
	 ) {
                    Text(
                        text = option,
                        color = Color.White,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Button(
                onClick = onNextButtonClicked,
                modifier = Modifier
                    .weight(1f)
                    .background(Color(0xFFA0522D), shape = RoundedCornerShape(8.dp))
            ) {
                Text(text = stringResource(R.string.next), color = Color.White)
            }
            OutlinedButton(
                onClick = onCancelButtonClicked,
                modifier = Modifier.weight(1f)
            ) {
                Text(text = stringResource(R.string.cancel), color = Color(0xFF8B4513))
            }
        }
    }
}

@Preview
@Composable
fun SelectOptionPreview() {
    CupcakeTheme {
        SelectOptionScreen(
            subtotal = "$15.00",
            options = listOf("Vanilla", "Chocolate", "Red Velvet"),
            onSelectionChanged = {},
            onCancelButtonClicked = {},
            onNextButtonClicked = {},
            onBackButtonClicked = {},
            modifier = Modifier
        )
    }
}
