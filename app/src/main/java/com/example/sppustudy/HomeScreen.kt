package com.example.sppustudy

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun HomeScreen(navController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize() // Fill the entire screen
            .padding(16.dp) // Add some padding
    ) {
        Column(
            modifier = Modifier
                .align(Alignment.Center) // Center the column vertically and horizontally
        ) {
            val years = listOf("Third Year", "Fourth Year")
            years.forEach { year ->
                Card(
                    shape = RoundedCornerShape(8.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 12.dp)
                        .clickable {
                            navController.navigate(year)
                        }
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Text(text = year, fontSize = 20.sp)
                    }
                }
            }
        }
    }
}