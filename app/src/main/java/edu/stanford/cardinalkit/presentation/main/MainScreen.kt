package edu.stanford.cardinalkit.presentation.main

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import com.google.accompanist.navigation.animation.rememberAnimatedNavController
import edu.stanford.cardinalkit.presentation.main.components.BottomNavigationBar
import edu.stanford.cardinalkit.presentation.navigation.CKNavHost
import edu.stanford.cardinalkit.presentation.navigation.Screens

@OptIn(ExperimentalMaterial3Api::class, ExperimentalAnimationApi::class)
@Composable
fun MainScreen(){
    val navController = rememberAnimatedNavController()
    Scaffold(
        content = { CKNavHost(navController, startDestination = Screens.HomeScreen.route) },
        bottomBar = { BottomNavigationBar(navController = navController) }
    )
}