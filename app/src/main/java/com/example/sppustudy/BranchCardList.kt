package com.example.sppustudy

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

data class BranchCard(val title: String)

@Composable
fun BranchCardList(branches: List<BranchCard>, year: String, navController: NavHostController) {
    LazyColumn(modifier = Modifier.padding(16.dp)) {
        items(branches) { branch ->
            Card(
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
                    .clickable {
                        navController.navigate("subjects/$year/${branch.title}")
                    },
                elevation = CardDefaults.cardElevation(0.5.dp),
                border = BorderStroke(0.5.dp, Color.Cyan)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(text = branch.title, fontSize = 20.sp,color = Color.Black,
                        modifier = Modifier.animateContentSize(), fontFamily = FontFamily.Serif)
                }
            }
        }
    }
}