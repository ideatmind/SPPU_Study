package com.example.sppustudy

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController


@Composable
fun SubjectCardList(subjects: List<String>, navController: NavHostController) {
    LazyColumn(modifier = Modifier.padding(16.dp)) {
        items(subjects) { subject ->
            Card(
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
                    .clickable {
                        navController.navigate("question_papers/${subject}")
                    }
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(text = subject, fontSize = 20.sp)
                }
            }
        }
    }
}





