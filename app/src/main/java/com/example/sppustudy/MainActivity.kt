package com.example.sppustudy

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApp()
        }
    }
}

data class BranchCard(val title: String)

@Composable
fun BranchCardList(branches: List<BranchCard>, navController: NavHostController) {
    LazyColumn(modifier = Modifier.padding(16.dp)) {
        items(branches) { branch ->
            Card(
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
                    .clickable {
                        navController.navigate("subjects/${branch.title}")
                    }
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(text = branch.title, fontSize = 20.sp)
                }
            }
        }
    }
}

@Composable
fun HomeScreen(navController: NavHostController) {
    Column(modifier = Modifier.padding(16.dp)) {
        val years = listOf("Second Year", "Third Year", "Fourth Year")
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

@Composable
fun SecondYearBranchCardList(navController: NavHostController) {
    val branches = getBranchesForYear("Second Year")
    BranchCardList(branches = branches, navController = navController)
}

@Composable
fun ThirdYearBranchCardList(navController: NavHostController) {
    val branches = getBranchesForYear("Third Year")
    BranchCardList(branches = branches, navController = navController)
}

@Composable
fun FourthYearBranchCardList(navController: NavHostController) {
    val branches = getBranchesForYear("Fourth Year")
    BranchCardList(branches = branches, navController = navController)
}

@Composable
fun SubjectsScreen(branchTitle: String, navController: NavHostController) {
    val subjects = getSubjectsForBranch(branchTitle)
    if (subjects.isNotEmpty()) {
        SubjectCardList(subjects = subjects, navController = navController)
    } else {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text("No subjects available")
        }
    }
}

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

fun getQuestionPapersForSubject(subject: String): List<String> {
    return when (subject) {
        "Subject 1" -> listOf("Question Paper 1", "Question Paper 2")
        "Subject 2" -> listOf("Question Paper 3", "Question Paper 4")
        "Subject 3" -> listOf("Question Paper 5", "Question Paper 6")
        // Add more subjects and their respective question papers here
        else -> emptyList()
    }
}
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

@Composable
fun QuestionPaperCardList(questionPapers: List<String>, navController: NavHostController) {
    val context = LocalContext.current

    LazyColumn(modifier = Modifier.padding(16.dp)) {
        items(questionPapers) { questionPaper ->
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
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(text = questionPaper, fontSize = 20.sp)
                }
            }
        }
    }
}

@Composable
fun MyApp() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            HomeScreen(navController = navController)
        }
        composable("Second Year") {
            SecondYearBranchCardList(navController = navController)
        }
        composable("Third Year") {
            ThirdYearBranchCardList(navController = navController)
        }
        composable("Fourth Year") {
            FourthYearBranchCardList(navController = navController)
        }
        composable("subjects/{branchTitle}") { backStackEntry ->
            val branchTitle = backStackEntry.arguments?.getString("branchTitle") ?: ""
            SubjectsScreen(branchTitle = branchTitle, navController = navController)
        }
        composable("question_papers/{subject}") { backStackEntry ->
            val subject = backStackEntry.arguments?.getString("subject") ?: ""
            QuestionPapersScreen(subject = subject, navController = navController)
        }
    }
}

fun getBranchesForYear(year: String): List<BranchCard> {
    return when (year) {
        "Second Year" -> listOf(
            BranchCard("Artificial Intelligence and Data Science"),
            BranchCard("Civil Engineering"),
            BranchCard("Computer Engineering"),
            BranchCard("E & TC Engineering"),
            BranchCard("Electrical Engineering"),
            BranchCard("Electronics & Computer Engineering"),
            BranchCard("Honors Course"),
            BranchCard("IT Engineering"),
            BranchCard("Mechanical Engineering"),
            BranchCard("Robotics and Automation")
        )
        "Third Year" -> listOf(
            BranchCard("Artificial Intelligence and Data Science"),
            BranchCard("Civil Engineering"),
            BranchCard("Computer Engineering"),
            BranchCard("E & TC Engineering"),
            BranchCard("Electrical Engineering"),
            BranchCard("Electronics & Computer Engineering"),
            BranchCard("Honors Course"),
            BranchCard("IT Engineering"),
            BranchCard("Mechanical Engineering"),
            BranchCard("Robotics and Automation")
        )
        "Fourth Year" -> listOf(
            BranchCard("Artificial Intelligence and Data Science"),
            BranchCard("Civil Engineering"),
            BranchCard("Computer Engineering"),
            BranchCard("E & TC Engineering"),
            BranchCard("Electrical Engineering"),
            BranchCard("Electronics & Computer Engineering"),
            BranchCard("Honors Course"),
            BranchCard("IT Engineering"),
            BranchCard("Mechanical Engineering"),
            BranchCard("Robotics and Automation")
        )
        else -> emptyList()
    }
}

fun getSubjectsForBranch(branchTitle: String): List<String> {
    return when (branchTitle) {
        "Artificial Intelligence and Data Science" -> listOf("Subject 1", "Subject 2", "Subject 3")
        "Civil Engineering" -> listOf("Subject 7", "Subject 8", "Subject 9")
        "Computer Engineering" -> listOf("Subject 10", "Subject 11", "Subject 12")
        "E & TC Engineering" -> listOf("Subject 13", "Subject 14", "Subject 15")
        "Electrical Engineering" -> listOf("Subject 16", "Subject 17", "Subject 18")
        "Electronics & Computer Engineering" -> listOf("Subject 19", "Subject 20", "Subject 21")
        "Honors Course" -> listOf("Subject 25", "Subject 26", "Subject 27")
        "IT Engineering" -> listOf("Subject 28", "Subject 29", "Subject 30")
        "Mechanical Engineering" -> listOf("Subject 34", "Subject 35", "Subject 36")
        "Robotics and Automation" -> listOf("Subject 37", "Subject 38", "Subject 39")
        else -> emptyList()
    }
}

fun getDriveLinkForQuestionPaper(questionPaper: String): String {
    return when (questionPaper) {
        "Question Paper 1" -> "https://drive.google.com/link1"
        "Question Paper 2" -> "https://drive.google.com/link2"
        "Question Paper 3" -> "https://drive.google.com/link3"
        "Question Paper 4" -> "https://drive.google.com/link4"
        "Question Paper 5" -> "https://drive.google.com/link5"
        "Question Paper 6" -> "https://drive.google.com/link6"
        else -> "https://drive.google.com"
    }
}
