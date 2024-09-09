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


@Composable
fun SecondYearBranchCardList(navController: NavHostController) {
    val branches = getBranchesForYear("Second Year")
    BranchCardList(branches = branches, year = "Second Year", navController = navController)
}

@Composable
fun ThirdYearBranchCardList(navController: NavHostController) {
    val branches = getBranchesForYear("Third Year")
    BranchCardList(branches = branches, year = "Third Year", navController = navController)
}

@Composable
fun FourthYearBranchCardList(navController: NavHostController) {
    val branches = getBranchesForYear("Fourth Year")
    BranchCardList(branches = branches, year = "Fourth Year", navController = navController)
}








