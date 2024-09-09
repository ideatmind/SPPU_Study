package com.example.sppustudy


fun getQuestionPapersForSubject(subject: String): List<String> {
    return when (subject) {
        // fourth year entc
        "Android Development_EleV" -> listOf("Android Development_EleV PYQ")
        "Cloud Computing" -> listOf("Cloud Computing PYQ")
        "Deep Learning - Ele IV" -> listOf("Deep Learning - Ele IV PYQ")
        "Digital Marketing - Ele VI" -> listOf("Digital Marketing PYQ")
        "Electronic Product Development - Ele IV" -> listOf("Electronic Product Development - Ele IV PYQ")
        "Fiber Optic Communication" -> listOf("Fiber Optic Communication PYQ")
        "Industrial Robotics & Automation" -> listOf("Industrial Robotics & Automation PYQ")
        "Java Script - Ele Ill" -> listOf("Java Script - Ele III PYQ")
        "Mobile Computing - Ele V" -> listOf("Mobile Computing - Ele V PYQ")
        "Modernized IOT" -> listOf("Modernized IOT PYQ")
        "Nano Electronics - Ele VI" -> listOf("Nano Electronics - Ele VI PYQ")
        "Radiation & Microwave Theory" -> listOf("Radiation & Microwave Theory PYQ")
        "Smart Contract & Crypto Currency" -> listOf("Smart Contract & Crypto Currency PYQ")
        "VLSI Design & Technology" -> listOf("VLSI Design & Technology PYQ")

        // fourth year aids
        "Big Data Analytics_Ele. V" -> listOf("Big Data Analytics_Ele. V PYQ")
        "Business Intelligence - Ele VI" -> listOf("Business Intelligence - Ele VI PYQ")
        "Computational Intelligence" -> listOf("Computational Intelligence PYQ")
        "Data Modeling & Visualization" -> listOf("Data Modeling & Visualization PYQ")
        "Deep Learning - Ele V" -> listOf("Deep Learning - Ele V PYQ")
        "Distributed Computing" -> listOf("Distributed Computing PYQ")
        "Industrial Internet of Things" -> listOf("Industrial Internet of Things PYQ")
        "Information Retrieval" -> listOf("Information Retrieval PYQ")
        "Machine Learning" -> listOf("Machine Learning PYQ")
        "Quantum Artificial Intelligence" -> listOf("Quantum Artificial Intelligence PYQ")
        "Reinforcement Learning - Ele VI" -> listOf("Reinforcement Learning - Ele VI PYQ")
        "UI-UX Designing" -> listOf("UI-UX Designing PYQ")

        else -> emptyList()
    }
}