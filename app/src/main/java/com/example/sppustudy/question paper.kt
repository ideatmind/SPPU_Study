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
        "DAMS & Hydraulics Structures" -> listOf("DAMS & Hydraulics Structures PYQ","DAMS & Hydraulics Structures Decode/TextBook")
        "Foundation Engineering" -> listOf("Foundation Engineering PYQ","Foundation Engineering Decode/TextBook")
        "Integrated Water Resource Planning & Mgt - Ele III" -> listOf("Integrated Water Resource Planning & Mgt - Ele III PYQ", "Integrated Water Resource Planning & Mgt - Ele III Decode/TextBook")
        "Irrigation & Drainage - Ele V" -> listOf("Irrigation & Drainage - Ele V PYQ","Irrigation & Drainage - Ele V Decode/TextBook")
        "Quantity Surveying Contracts & Tenders" -> listOf("Quantity Surveying Contracts & Tenders PYQ","Quantity Surveying Contracts & Tenders Decode/TextBook")
        "TQM & MIS - Ele VI" -> listOf("TQM & MIS - Ele VI PYQ", "TQM & MIS - Ele VI Decode/TextBook")
        "Transportation Engineering" -> listOf( "Transportation Engineering PYQ","Transportation Engineering Decode/TextBook" )

        // fourth year computer
        "Blockchain Technology" -> listOf("Blockchain Technology PYQ", "Blockchain Technology Decode/TextBook")
        "Business Intelligence - Ele VI comp" -> listOf("Business Intelligence - Ele VI comp PYQ", "Business Intelligence - Ele VI comp Decode/TextBook")
        "Cyber Security & Digital Forensics - Ele III" -> listOf("Cyber Security & Digital Forensics - Ele III PYQ", "Cyber Security & Digital Forensics - Ele III Decode/TextBook")
        "Deep Learning" -> listOf("Deep Learning PYQ","Deep Learning Decode/TextBook")
        "Design & Analysis of Algorithms" -> listOf("Design & Analysis of Algorithms PYQ", "Design & Analysis of Algorithms Decode/TextBook")
        "High Performance Computing" -> listOf("High Performance Computing PYQ","High Performance Computing Decode/TextBook")
        "Machine Learning comp" -> listOf("Machine Learning comp PYQ","Machine Learning comp Decode/TextBook")
        "Machine Learning & Data Science" -> listOf("Machine Learning & Data Science PYQ", "Machine Learning & Data Science Decode/TextBook")
        "Machine Learning for Internet of Things" -> listOf( "Machine Learning for Internet of Things PYQ","Machine Learning for Internet of Things Decode/TextBook" )
        "Mobile Computing - Ele IV" -> listOf("Mobile Computing - Ele IV PYQ", "Mobile Computing - Ele IV Decode/TextBook")
        "Natural Language Processing - Ele V" -> listOf( "Natural Language Processing - Ele V PYQ","Natural Language Processing - Ele V Decode/TextBook" )
        "Software Testing & Quality Assurance - Ele IV" -> listOf("Software Testing & Quality Assurance - Ele IV PYQ", "Software Testing & Quality Assurance - Ele IV Decode/TextBook")
        "Virtual Reality in Game Development" -> listOf( "Virtual Reality in Game Development PYQ","Virtual Reality in Game Development Decode/TextBook" )


        // fourth year electrical
        "Advanced Control System" -> listOf("Advanced Control System PYQ", "Advanced Control System Decode/TextBook")
        "Advanced Electric Drives & Control" -> listOf("Advanced Electric Drives & Control PYQ", "Advanced Electric Drives & Control Decode/TextBook")
        "EHV AC Transmission - Ele VI" -> listOf("EHV AC Transmission - Ele VI PYQ", "EHV AC Transmission - Ele VI Decode/TextBook")
        "Electrical & Hybrid Vehicle - Ele IV" -> listOf("Electrical & Hybrid Vehicle - Ele IV PYQ","Electrical & Hybrid Vehicle - Ele IV Decode/TextBook")
        "Illumination Engineering - Ele VI" -> listOf("Illumination Engineering - Ele VI PYQ", "Illumination Engineering - Ele VI Decode/TextBook")
        "Java Script - Ele III electrical" -> listOf("Java Script - Ele III electrical PYQ","Java Script - Ele III electrical Decode/TextBook")
        "PLC & Scada - Ele III" -> listOf("PLC & Scada - Ele III PYQ","PLC & Scada - Ele III Decode/TextBook")
        "Power System Operation & Control" -> listOf("Power System Operation & Control PYQ", "Power System Operation & Control Decode/TextBook")
        "Smart Grid - Ele V" -> listOf( "Smart Grid - Ele V PYQ","Smart Grid - Ele V Decode/TextBook" )
        "Switchgear & Protection" -> listOf("Switchgear & Protection PYQ", "Switchgear & Protection Decode/TextBook")


        // fourth year IT
        "Blockchain Technology IT" -> listOf("Blockchain Technology IT PYQ", "Blockchain Technology IT Decode/TextBook")
        "Deep Learning IT" -> listOf("Deep Learning IT PYQ", "Deep Learning IT Decode/TextBook")
        "Distributed Systems" -> listOf("Distributed Systems PYQ", "Distributed Systems Decode/TextBook")
        "Information & Storage Retrieval" -> listOf("Information & Storage Retrieval PYQ", "Information & Storage Retrieval Decode/TextBook")
        "Mobile Computing - Ele III IT" -> listOf("Mobile Computing - Ele III IT PYQ", "Mobile Computing - Ele III IT Decode/TextBook")
        "Natural Language Processing - Ele V IT" -> listOf("Natural Language Processing - Ele V IT PYQ", "Natural Language Processing - Ele V IT Decode/TextBook")
        "Software Project Management IT" -> listOf("Software Project Management IT PYQ", "Software Project Management IT Decode/TextBook")
        "Wireless Communication - Ele IV IT" -> listOf("Wireless Communication - Ele IV IT PYQ", "Wireless Communication - Ele IV IT Decode/TextBook")

        else -> emptyList()
    }
}