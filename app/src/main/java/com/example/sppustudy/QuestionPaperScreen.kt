package com.example.sppustudy

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

@Composable
fun QuestionPapersScreen(subject: String, navController: NavHostController) {
    val questionPapers = getQuestionPapersForSubject(subject)
    if (questionPapers.isNotEmpty()) {
        QuestionPaperCardList(questionPapers = questionPapers, navController = navController)
    } else {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text("No question papers available")
        }
    }
}