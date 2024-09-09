package com.example.sppustudy

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

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
        composable("subjects/{year}/{branchTitle}") { backStackEntry ->
            val year = backStackEntry.arguments?.getString("year") ?: ""
            val branchTitle = backStackEntry.arguments?.getString("branchTitle") ?: ""
            SubjectsScreen(year = year, branchTitle = branchTitle, navController = navController)
        }
        composable("question_papers/{subject}") { backStackEntry ->
            val subject = backStackEntry.arguments?.getString("subject") ?: ""
            QuestionPapersScreen(subject = subject, navController = navController)
        }
    }
}

fun getBranchesForYear(year: String): List<BranchCard> {
    return listOf(
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
}

fun getSubjectsForBranch(year: String, branchTitle: String): List<String> {
    return when (year) {
        "Second Year" -> when (branchTitle) {
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
        "Third Year" -> when (branchTitle) {
            "Artificial Intelligence and Data Science" -> listOf("Subject 40", "Subject 41", "Subject 42")
            "Civil Engineering" -> listOf("Subject 43", "Subject 44", "Subject 45")
            "Computer Engineering" -> listOf("Subject 46", "Subject 47", "Subject 48")
            "E & TC Engineering" -> listOf("Subject 49", "Subject 50", "Subject 51")
            "Electrical Engineering" -> listOf("Subject 52", "Subject 53", "Subject 54")
            "Electronics & Computer Engineering" -> listOf("Subject 55", "Subject 56", "Subject 57")
            "Honors Course" -> listOf("Subject 58", "Subject 59", "Subject 60")
            "IT Engineering" -> listOf("Subject 61", "Subject 62", "Subject 63")
            "Mechanical Engineering" -> listOf("Subject 64", "Subject 65", "Subject 66")
            "Robotics and Automation" -> listOf("Subject 67", "Subject 68", "Subject 69")
            else -> emptyList()
        }
        "Fourth Year" -> when (branchTitle) {
            "Artificial Intelligence and Data Science" -> listOf("Subject 70", "Subject 71", "Subject 72")

            "Civil Engineering" -> listOf("Subject 73", "Subject 74", "Subject 75")

            "Computer Engineering" -> listOf("Subject 76", "Subject 77", "Subject 78")

            "E & TC Engineering" -> listOf("Android Development_EleV", "Cloud Computing",
                "Deep Learning - Ele IV", "Digital Marketing - Ele VI",
                "Electronic Product Development - Ele IV", "Fiber Optic Communication",
                "Industrial Robotics & Automation", "Java Script - Ele Ill",
                "Mobile Computing - Ele V", "Modernized IOT",
                "Nano Electronics - Ele VI", "Radiation & Microwave Theory",
                "Smart Contract & Crypto Currency", "VLSI Design & Technology")

            "Electrical Engineering" -> listOf("Subject 82", "Subject 83", "Subject 84")

            "Electronics & Computer Engineering" -> listOf("Subject 85", "Subject 86", "Subject 87")

            "Honors Course" -> listOf("Subject 88", "Subject 89", "Subject 90")

            "IT Engineering" -> listOf("Subject 91", "Subject 92", "Subject 93")

            "Mechanical Engineering" -> listOf("Subject 94", "Subject 95", "Subject 96")

            "Robotics and Automation" -> listOf("Subject 97", "Subject 98", "Subject 99")
            else -> emptyList()
        }
        else -> emptyList()
    }
}

fun getDriveLinkForQuestionPaper(questionPaper: String): String {
    return when (questionPaper) {
        // fourth year entc
        "Android Development_EleV" -> "https://drive.google.com/drive/folders/1WnzAsvSb1BWFcOWYuHQcH5ARfDNhfyNS"
        "Cloud Computing" -> "https://drive.google.com/drive/folders/1JFSExls-Yc5Linf7UZAc628okdnZNw5P"
        "Deep Learning - Ele IV" -> "https://drive.google.com/drive/folders/1GixEt1YFlMj9GC4POpeh8IB0lNRtborz"
        "Digital Marketing PYQ" -> "https://drive.google.com/drive/folders/15-EpuPwvLLx695awBqPKIUSHsMzNAxc-"
        "Electronic Product Development - Ele IV" -> "https://drive.google.com/drive/folders/1tCDPrtcwbLOSxlTi3X0bvURpaypWu9Q4"
        "Fiber Optic Communication" -> "https://drive.google.com/drive/folders/1HcDMCnMdHdP5mXLEtWBJejF49eNXWnGy"
        "Industrial Robotics & Automation" -> "https://drive.google.com/drive/folders/1UDeUjz4nd0R4e1iRheIwVViCu9Dg71t8"
        "Java Script - Ele Ill" -> "https://drive.google.com/drive/folders/1Vb1FeudILVCEJd-LD2IoC3meAig6cxZg"
        "Mobile Computing - Ele V" -> "https://drive.google.com/drive/folders/1aIJpgwoCh31erwSV2LwV371TvfflQBwP"
        "Modernized IOT" -> "https://drive.google.com/drive/folders/1HTA5H83JQMzEBe5zmePBfvKZRrJXdJdQ"
        "Nano Electronics - Ele VI" -> "https://drive.google.com/drive/folders/1G02C7rBH44DneCGdbY0kfdP7GNrTyGUw"
        "Radiation & Microwave Theory" -> "https://drive.google.com/drive/folders/1uNyFkD1CKWT_f4m2OV8IOrROLIHIMSyN"
        "Smart Contract & Crypto Currency" -> "https://drive.google.com/drive/folders/1ynZ0F1J71HNwSFwr_wJOREHqhofklsLg"
        "VLSI Design & Technology" -> "https://drive.google.com/drive/folders/1zEplP6js68Am528tOS95Oa1C1H499bDQ"
        else -> "Invalid"
    }
}

fun getQuestionPapersForSubject(subject: String): List<String> {
    return when (subject) {
        // fourth year entc
          "Android Development_EleV" -> listOf("Android Development_EleV")
        "Cloud Computing" -> listOf("Cloud Computing")
        "Deep Learning - Ele IV" -> listOf("Deep Learning - Ele IV")
        "Digital Marketing - Ele VI" -> listOf("Digital Marketing PYQ")
        "Electronic Product Development - Ele IV" -> listOf("Electronic Product Development - Ele IV")
        "Fiber Optic Communication" -> listOf("Fiber Optic Communication")
        "Industrial Robotics & Automation" -> listOf("Industrial Robotics & Automation")
        "Java Script - Ele Ill" -> listOf("Java Script - Ele Ill")
        "Mobile Computing - Ele V" -> listOf("Mobile Computing - Ele V")
        "Modernized IOT" -> listOf("Modernized IOT")
        "Nano Electronics - Ele VI" -> listOf("Nano Electronics - Ele VI")
        "Radiation & Microwave Theory" -> listOf("Radiation & Microwave Theory")
        "Smart Contract & Crypto Currency" -> listOf("Smart Contract & Crypto Currency")
        "VLSI Design & Technology" -> listOf("VLSI Design & Technology")
        // Add more subjects and their respective question papers here
        else -> emptyList()
    }
}