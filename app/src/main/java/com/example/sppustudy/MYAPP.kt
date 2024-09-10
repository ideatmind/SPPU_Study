package com.example.sppustudy

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
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
        composable("Third Year") {
//            ThirdYearBranchCardList(navController = navController)
            NotAvailableScreenForYear()
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
//        BranchCard("Honors Course"),
        BranchCard("IT Engineering"),
        BranchCard("Mechanical Engineering"),
        BranchCard("Robotics and Automation")
    )
}

fun getSubjectsForBranch(year: String, branchTitle: String): List<String> {
    return when (year) {
        "Third Year" -> when (branchTitle) {
            "Artificial Intelligence and Data Science" -> listOf("Subject 40", "Subject 41", "Subject 42")

            "Civil Engineering" -> listOf("Subject 43", "Subject 44", "Subject 45")

            "Computer Engineering" -> listOf("Subject 46", "Subject 47", "Subject 48")

            "E & TC Engineering" -> listOf("Subject 49", "Subject 50", "Subject 51")

            "Electrical Engineering" -> listOf("Subject 52", "Subject 53", "Subject 54")

//            "Honors Course" -> listOf("Subject 58", "Subject 59", "Subject 60")

            "IT Engineering" -> listOf("Subject 61", "Subject 62", "Subject 63")

            "Mechanical Engineering" -> listOf("Subject 64", "Subject 65", "Subject 66")

            "Robotics and Automation" -> listOf("Subject 67", "Subject 68", "Subject 69")
            else -> emptyList()
        }
        "Fourth Year" -> when (branchTitle) {
            "Artificial Intelligence and Data Science" -> listOf("Big Data Analytics_Ele. V", "Business Intelligence - Ele VI",
                "Computational Intelligence", "Data Modeling & Visualization",
                "Deep Learning - Ele V", "Distributed Computing",
                "Industrial Internet of Things", "Information Retrieval",
                "Machine Learning", "Quantum Artificial Intelligence", "Reinforcement Learning - Ele VI", "UI-UX Designing")

            "Civil Engineering" -> listOf("Air Pollution and Control - Ele IV", "Airport and Bridge Engineering - Ele IV",
                "DAMS & Hydraulics Structures", "Foundation Engineering",
                "Integrated Water Resource Planning & Mgt - Ele III", "Irrigation & Drainage - Ele V",
                "Quantity Surveying Contracts & Tenders",
                "TQM & MIS - Ele VI", "Transportation Engineering")

            "Computer Engineering" -> listOf("Blockchain Technology", "Business Intelligence - Ele VI comp",
                "Cyber Security & Digital Forensics - Ele III", "Deep Learning", "Design & Analysis of Algorithms",
                "High Performance Computing", "Machine Learning comp", "Machine Learning & Data Science",
                "Machine Learning for Internet of Things", "Mobile Computing - Ele IV",
                "Natural Language Processing - Ele V", "Software Testing & Quality Assurance - Ele IV",
                "Virtual Reality in Game Development"
            )

            "E & TC Engineering" -> listOf("Android Development_EleV", "Cloud Computing",
                "Deep Learning - Ele IV", "Digital Marketing - Ele VI",
                "Electronic Product Development - Ele IV", "Fiber Optic Communication",
                "Industrial Robotics & Automation", "Java Script - Ele Ill",
                "Mobile Computing - Ele V", "Modernized IOT",
                "Nano Electronics - Ele VI", "Radiation & Microwave Theory",
                "Smart Contract & Crypto Currency", "VLSI Design & Technology")

            "Electrical Engineering" -> listOf("Advanced Control System", "Advanced Electric Drives & Control",
                "EHV AC Transmission - Ele VI", "Electrical & Hybrid Vehicle - Ele IV",
                "Illumination Engineering - Ele VI", "Java Script - Ele III electrical",
                "PLC & Scada - Ele III", "Power System Operation & Control",
                "Smart Grid - Ele V", "Switchgear & Protection"
            )

//            "Honors Course" -> listOf("Subject 88", "Subject 89", "Subject 90")

            "IT Engineering" -> listOf("Blockchain Technology IT", "Deep Learning IT",
                "Distributed Systems", "Information & Storage Retrieval", "Mobile Computing - Ele III IT",
                "Natural Language Processing - Ele V IT", "Software Project Management IT",
                "Wireless Communication - Ele IV IT"
            )

            "Mechanical Engineering" -> listOf("Computer Integrated Manufacturing", "Dynamics of Machinery",
                "Electrical & Hybrid Vehicle - Ele VI", "Energy Audit & Management - Ele V",
                "Energy Engineering", "Heating Ventilation Air Condi. & Refrigeration",
                "Industrial Engineering - Ele III", "Modelling & Simulation of EHV",
                "Modern Machining Processes - Ele III", "Operation Research - Ele IV",
                "Process Equipment Design - Ele VI", "Product Design & Development - Ele IV",
                "Quality & Reliability Engg - V", "Renewable Energy Technologies - Ele VI", "Turbo machinery"
            )

            "Robotics and Automation" -> listOf("Entrepreneurship & Innovations_Ele. V robotics", "Field & Service Robots",
                "Industry 4.0_Ele.VI robotics", "Internet of Things & Machine Learning robotics", "Machine Vision System",
                "PLC & SCADA Programming robotics", "Robot System Reliability & Safety robotics", "Wireless Sensor Network robotics"
            )
            else -> emptyList()
        }
        else -> emptyList()
    }
}

