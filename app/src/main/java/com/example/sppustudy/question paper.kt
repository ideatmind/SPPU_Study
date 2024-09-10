package com.example.sppustudy


fun getQuestionPapersForSubject(subject: String): List<String> {
    return when (subject) {
        // fourth year entc
        "Android Development_EleV" -> listOf("Android Development_EleV PYQ", "Android Development_EleV Decode/TextBook")
        "Cloud Computing" -> listOf("Cloud Computing PYQ", "Cloud Computing Decode/TextBook")
        "Deep Learning - Ele IV" -> listOf("Deep Learning - Ele IV PYQ", "Deep Learning - Ele IV Decode/TextBook")
        "Digital Marketing - Ele VI" -> listOf("Digital Marketing PYQ", "Digital Marketing Decode/TextBook")
        "Electronic Product Development - Ele IV" -> listOf("Electronic Product Development - Ele IV PYQ", "Electronic Product Development - Ele IV Decode/TextBook")
        "Fiber Optic Communication" -> listOf("Fiber Optic Communication PYQ", "Fiber Optic Communication Decode/TextBook")
        "Industrial Robotics & Automation" -> listOf("Industrial Robotics & Automation PYQ", "Industrial Robotics & Automation Decode/TextBook")
        "Java Script - Ele Ill" -> listOf("Java Script - Ele III PYQ", "Java Script - Ele III Decode/TextBook")
        "Mobile Computing - Ele V" -> listOf("Mobile Computing - Ele V PYQ", "Mobile Computing - Ele V Decode/TextBook")
        "Modernized IOT" -> listOf("Modernized IOT PYQ", "Modernized IOT Decode/TextBook")
        "Nano Electronics - Ele VI" -> listOf("Nano Electronics - Ele VI PYQ", "Nano Electronics - Ele VI Decode/TextBook")
        "Radiation & Microwave Theory" -> listOf("Radiation & Microwave Theory PYQ", "Radiation & Microwave Theory Decode/TextBook")
        "Smart Contract & Crypto Currency" -> listOf("Smart Contract & Crypto Currency PYQ", "Smart Contract & Crypto Currency Decode/TextBook")
        "VLSI Design & Technology" -> listOf("VLSI Design & Technology PYQ", "VLSI Design & Technology Decode/TextBook")

        // fourth year aids
        "Big Data Analytics_Ele. V" -> listOf("Big Data Analytics_Ele. V PYQ", "Big Data Analytics_Ele. V Decode/TextBook")
        "Business Intelligence - Ele VI" -> listOf("Business Intelligence - Ele VI PYQ", "Business Intelligence - Ele VI Decode/TextBook")
        "Computational Intelligence" -> listOf("Computational Intelligence PYQ", "Computational Intelligence Decode/TextBook")
        "Data Modeling & Visualization" -> listOf("Data Modeling & Visualization PYQ", "Data Modeling & Visualization Decode/TextBook")
        "Deep Learning - Ele V" -> listOf("Deep Learning - Ele V PYQ", "Deep Learning - Ele V Decode/TextBook")
        "Distributed Computing" -> listOf("Distributed Computing PYQ", "Distributed Computing Decode/TextBook")
        "Industrial Internet of Things" -> listOf("Industrial Internet of Things PYQ", "Industrial Internet of Things Decode/TextBook")
        "Information Retrieval" -> listOf("Information Retrieval PYQ", "Information Retrieval Decode/TextBook")
        "Machine Learning" -> listOf("Machine Learning PYQ", "Machine Learning Decode/TextBook")
        "Quantum Artificial Intelligence" -> listOf("Quantum Artificial Intelligence PYQ", "Quantum Artificial Intelligence Decode/TextBook")
        "Reinforcement Learning - Ele VI" -> listOf("Reinforcement Learning - Ele VI PYQ", "Reinforcement Learning - Ele VI Decode/TextBook")
        "UI-UX Designing" -> listOf("UI-UX Designing PYQ")

        // fourth year civil
        "Air Pollution and Control - Ele IV" -> listOf("Air Pollution and Control - Ele IV PYQ", "Air Pollution and Control - Ele IV Decode/TextBook")
        "Airport and Bridge Engineering - Ele IV" -> listOf("Airport and Bridge Engineering - Ele IV PYQ", "Airport and Bridge Engineering - Ele IV Decode/TextBook")
        "DAMS & Hydraulics Structures" -> listOf("DAMS & Hydraulics Structures PYQ","DAMS & Hydraulics Structures PYQ Decode/TextBook")
        "Foundation Engineering" -> listOf("Foundation Engineering PYQ","Foundation Engineering PYQ Decode/TextBook")
        "Integrated Water Resource Planning & Mgt - Ele III" -> listOf("Integrated Water Resource Planning & Mgt - Ele III PYQ", "Integrated Water Resource Planning & Mgt - Ele III PYQ Decode/TextBook")
        "Irrigation & Drainage - Ele V" -> listOf("Irrigation & Drainage - Ele V PYQ","Irrigation & Drainage - Ele V PYQ Decode/TextBook")
        "Quantity Surveying Contracts & Tenders" -> listOf("Quantity Surveying Contracts & Tenders PYQ","Quantity Surveying Contracts & Tenders PYQ Decode/TextBook")
        "TQM & MIS - Ele VI" -> listOf("TQM & MIS - Ele VI PYQ", "TQM & MIS - Ele VI PYQ Decode/TextBook")
        "Transportation Engineering" -> listOf( "Transportation Engineering PYQ","Transportation Engineering PYQ Decode/TextBook" )

        // fourth year computer
        "Blockchain Technology" -> listOf("Blockchain Technology PYQ", "Blockchain Technology Decode/TextBook")
        "Business Intelligence - Ele VI " -> listOf("Airport and Bridge Engineering - Ele IV PYQ", "Airport and Bridge Engineering - Ele IV Decode/TextBook")
        "Cyber Security & Digital Forensics - Ele Ill" -> listOf("Cyber Security & Digital Forensics - Ele Ill PYQ", "Cyber Security & Digital Forensics - Ele Ill Decode/TextBook")
        "Foundation Engineering" -> listOf("Foundation Engineering PYQ","Foundation Engineering PYQ Decode/TextBook")
        "Integrated Water Resource Planning & Mgt - Ele III" -> listOf("Integrated Water Resource Planning & Mgt - Ele III PYQ", "Integrated Water Resource Planning & Mgt - Ele III PYQ Decode/TextBook")
        "Irrigation & Drainage - Ele V" -> listOf("Irrigation & Drainage - Ele V PYQ","Irrigation & Drainage - Ele V PYQ Decode/TextBook")
        "Quantity Surveying Contracts & Tenders" -> listOf("Quantity Surveying Contracts & Tenders PYQ","Quantity Surveying Contracts & Tenders PYQ Decode/TextBook")
        "TQM & MIS - Ele VI" -> listOf("TQM & MIS - Ele VI PYQ", "TQM & MIS - Ele VI PYQ Decode/TextBook")
        "Transportation Engineering" -> listOf( "Transportation Engineering PYQ","Transportation Engineering PYQ Decode/TextBook" )

        else -> emptyList()
    }
}