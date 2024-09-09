package com.example.sppustudy

fun getDriveLinkForQuestionPaper(questionPaper: String): String {
    return when (questionPaper) {
        // fourth year entc - drive updated
        "Android Development_EleV PYQ" -> "https://drive.google.com/drive/folders/1WnzAsvSb1BWFcOWYuHQcH5ARfDNhfyNS"
        "Cloud Computing PYQ" -> "https://drive.google.com/drive/folders/1JFSExls-Yc5Linf7UZAc628okdnZNw5P"
        "Deep Learning - Ele IV PYQ" -> "https://drive.google.com/drive/folders/1GixEt1YFlMj9GC4POpeh8IB0lNRtborz"
        "Digital Marketing PYQ" -> "https://drive.google.com/drive/folders/15-EpuPwvLLx695awBqPKIUSHsMzNAxc-"
        "Electronic Product Development - Ele IV PYQ" -> "https://drive.google.com/drive/folders/1tCDPrtcwbLOSxlTi3X0bvURpaypWu9Q4"
        "Fiber Optic Communication PYQ" -> "https://drive.google.com/drive/folders/1HcDMCnMdHdP5mXLEtWBJejF49eNXWnGy"
        "Industrial Robotics & Automation PYQ" -> "https://drive.google.com/drive/folders/1UDeUjz4nd0R4e1iRheIwVViCu9Dg71t8"
        "Java Script - Ele III PYQ" -> "https://drive.google.com/drive/folders/1Vb1FeudILVCEJd-LD2IoC3meAig6cxZg"
        "Mobile Computing - Ele V PYQ" -> "https://drive.google.com/drive/folders/1aIJpgwoCh31erwSV2LwV371TvfflQBwP"
        "Modernized IOT PYQ" -> "https://drive.google.com/drive/folders/1HTA5H83JQMzEBe5zmePBfvKZRrJXdJdQ"
        "Nano Electronics - Ele VI PYQ" -> "https://drive.google.com/drive/folders/1G02C7rBH44DneCGdbY0kfdP7GNrTyGUw"
        "Radiation & Microwave Theory PYQ" -> "https://drive.google.com/drive/folders/1uNyFkD1CKWT_f4m2OV8IOrROLIHIMSyN"
        "Smart Contract & Crypto Currency PYQ" -> "https://drive.google.com/drive/folders/1ynZ0F1J71HNwSFwr_wJOREHqhofklsLg"
        "VLSI Design & Technology PYQ" -> "https://drive.google.com/drive/folders/1zEplP6js68Am528tOS95Oa1C1H499bDQ"

        // fourth year aids - drive updated
        "Big Data Analytics_Ele. V PYQ" -> "https://drive.google.com/drive/folders/14_0Sy3MX-9aDawkPo6J9uK6uAYL1yKhY"
        "Business Intelligence - Ele VI PYQ" -> "https://drive.google.com/drive/folders/1V7hQfdbKBzJMd_p5cktLMb4a3wiu1k8U"
        "Computational Intelligence PYQ" -> "https://drive.google.com/drive/folders/1OypTaHyu6zGdoQU7g0Rn2P10_mshkmMx"
        "Data Modeling & Visualization PYQ" -> "https://drive.google.com/drive/folders/1rHjMfY9t7jrjQOzTb2Cfh7Asm6lO9IT8"
        "Deep Learning - Ele V PYQ" -> "https://drive.google.com/drive/folders/1zBHEYtmjNGyyTCk7RxLiUcwfP78UYoIu"
        "Distributed Computing PYQ" -> "https://drive.google.com/drive/folders/17g5dcXerNQEwyFbnqcJ2ge0fqGz_E5yJ"
        "Industrial Internet of Things PYQ" -> "https://drive.google.com/drive/folders/1ez4Ieh9V5QedE3D6wDBdjXCCQNpwu2oV"
        "Information Retrieval PYQ" -> "https://drive.google.com/drive/folders/1jlnzQXyv8wj0dND6-Q--Gwhuo0KmGNv4"
        "Machine Learning PYQ" -> "https://drive.google.com/drive/folders/1JnzthrniA3vazKgg-xilH2Ogo2oUQDUb"
        "Quantum Artificial Intelligence PYQ" -> "https://drive.google.com/drive/folders/1120ltR8PYnAkZwzowoG5T766fUqsSj3U"
        "Reinforcement Learning - Ele VI PYQ" -> "https://drive.google.com/drive/folders/1OERUVGo64o4fRSxhs-xoAUoS-Y1xntBj"
        "UI-UX Designing PYQ" -> "https://drive.google.com/drive/folders/1qQFio6cYm_mrAuoYCSrCsKCv0Q-Ccfpy"

        else -> "Invalid"
    }
}