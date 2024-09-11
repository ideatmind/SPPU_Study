package com.example.sppustudy

import android.content.Intent
import android.net.Uri
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
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
                        },
                    elevation = CardDefaults.cardElevation(0.5.dp),
                    border = BorderStroke(0.5.dp, Color(0xFFFF9800))
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Text(text = year, fontSize = 20.sp,
                            color = Color.Black,
                            modifier = Modifier.animateContentSize(),
                            fontFamily = androidx.compose.ui.text.font.FontFamily.Serif
                        )
                    }
                }

            }
            Spacer(modifier = Modifier.height(30.dp))

            val CONTACT_URL = "https://rb.gy/c39e4y"

            Card(
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 12.dp),
                elevation = CardDefaults.cardElevation(2.dp),
                border = BorderStroke(1.dp, Color.Blue)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    val context = LocalContext.current
                    Text(text = "If you have any issues or study materials to share that can help others, please contact us. Click -", fontSize = 16.sp)
                    Text(
                        text = "Contact-Telegram",
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