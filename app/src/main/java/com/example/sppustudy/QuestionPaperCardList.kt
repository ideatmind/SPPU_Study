package com.example.sppustudy

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun QuestionPaperCardList(questionPapers: List<String>, navController: NavHostController) {
    val context = LocalContext.current

    LazyColumn(modifier = Modifier.padding(16.dp)) {
        items(questionPapers) { questionPaper ->
            Box(
                modifier = Modifier
                    .fillMaxSize() // Fill the maximum width
                    .padding(vertical = 8.dp),
//                contentAlignment = androidx.compose.ui.Alignment.Center
            ) {
                Card(
                    shape = RoundedCornerShape(8.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp)
                        .clickable {
                            val driveLink = getDriveLinkForQuestionPaper(questionPaper)
                            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(driveLink))
                            context.startActivity(intent)
                        }
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize() // Fill the maximum width
                            .padding(vertical = 8.dp)
                    ) {
                        Column(modifier = Modifier.padding(16.dp)) {
                            Text(text = questionPaper, fontSize = 20.sp)
                        }
                    }

                }
            }

        }
    }
}