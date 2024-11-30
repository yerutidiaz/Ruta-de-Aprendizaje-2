package com.example.cupcake.ui.theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

val LightColorScheme = lightColorScheme(
    primary = Color(0xFFD4A5A5), // Café claro
    primaryContainer = Color(0xFFB38D8D), // Gamuza claro
    onPrimary = Color.White,
    secondary = Color(0xFF6A4F4B), // Café oscuro
    secondaryContainer = Color(0xFF8C5A47),
    onSecondary = Color.White,
    background = Color(0xFFF5F5F5),
    surface = Color.White,
    onSurface = Color.Black
)

val DarkColorScheme = darkColorScheme(
    primary = Color(0xFFD4A5A5),
    primaryContainer = Color(0xFFB38D8D),
    onPrimary = Color.Black,
    secondary = Color(0xFF6A4F4B),
    secondaryContainer = Color(0xFF8C5A47),
    onSecondary = Color.Black,
    background = Color(0xFF2C2C2C),
    surface = Color(0xFF3A3A3A),
    onSurface = Color.White
)

val Typography = Typography(
    h6 = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp,
        color = Color(0xFF3E2723) // Café oscuro para encabezados
    )
)

val CupcakeTheme = lightColorScheme(
    primary = Color(0xFFD4A5A5),
    secondary = Color(0xFF6A4F4B),
    background = Color(0xFFF5F5F5),
    surface = Color.White
)
