package com.example.cupcake.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.cupcake.R
import com.example.cupcake.data.OrderUiState

@Composable
fun OrderSummaryScreen(
    orderUiState: OrderUiState,
    onBackButtonClicked: () -> Unit,
    onCancelButtonClicked: () -> Unit,
    onSendButtonClicked: (String, String) -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(lightTan), 
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        // para volver atrás
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
                    tint = darkBrown
                )
            }
            Text(
                text = stringResource(R.string.order_summary),
                style = MaterialTheme.typography.headlineSmall.copy(
                    fontWeight = FontWeight.Bold,
                    color = darkBrown
	)
            )
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(
                text = "${stringResource(R.string.quantity)}: ${orderUiState.quantity}",
                fontWeight = FontWeight.Bold,
                color = darkBrown
            )
            Text(
                text = "${stringResource(R.string.flavor)}: ${orderUiState.flavor}",
                fontWeight = FontWeight.Bold,
                color = darkBrown
            )
            Text(
                text = "${stringResource(R.string.pickup_date)}: ${orderUiState.date}",
                fontWeight = FontWeight.Bold,
                color = black
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Button(
                onClick = { onSendButtonClicked("Order", "Summary") },
                modifier = Modifier
                    .fillMaxWidth()
                    .background(darkBrown, shape = RoundedCornerShape(8.dp)),
                colors = ButtonDefaults.buttonColors(containerColor = mediumTan) 
            ) {
                Text(
                    text = stringResource(R.string.send_order),
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}
