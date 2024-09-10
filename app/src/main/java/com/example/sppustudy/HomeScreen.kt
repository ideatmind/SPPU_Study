package com.example.sppustudy

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
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
            Spacer(modifier = Modifier.height(30.dp))

            val CONTACT_URL = "https://rb.gy/c39e4y"

            Card(
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 12.dp)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    val context = LocalContext.current
                    Text(text = "If you have any issues or study materials to share that can help others, please contact us.", fontSize = 16.sp)
                    Text(
                        text = "Contact",
                        fontSize = 16.sp,
                        color = Color.Blue,
                        modifier = Modifier
                            .clickable {

                                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(CONTACT_URL))
                                context.startActivity(intent)
                            }
                            .semantics {
                                contentDescription = "Contact link"
                            }
                    )
                }
            }
        }
    }
}