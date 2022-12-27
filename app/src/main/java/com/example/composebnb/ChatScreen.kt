package com.example.composebnb

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun ChatScreen(
    modifier: Modifier = Modifier,
    navController: NavHostController
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF71DDAE))
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Chat Screen", fontSize = 20.sp, fontWeight = FontWeight.Bold)
    }
}