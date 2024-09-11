package com.example.sppustudy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApp()
        }
    }
}


@Composable
fun ThirdYearBranchCardList(navController: NavHostController) {
    val branches = getBranchesForYear("Third Year")
    BranchCardList(branches = branches, year = "Third Year", navController = navController)
}

@Composable
fun FourthYearBranchCardList(navController: NavHostController,modifier: Modifier = Modifier) {
    val branches = getBranchesForYear("Fourth Year")
    BranchCardList(branches = branches, year = "Fourth Year", navController = navController)
}









