package com.example.projectexam_id

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.projectexam_id.ui.theme.ProjectExam_IDTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProjectExam_IDTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //Creo la variable para navegar
                    val navController  = rememberNavController()
                    //Donde empezara el programa será en el cover
                    NavHost(navController = navController, startDestination = "coverProject"){
                        composable("coverProject") { coverProject(navController) }
                        composable(
                            route = "ScreenPicAndName/{picName}/{picPhoto}",
                            arguments =
                            listOf(
                                navArgument("picName") { type = NavType.StringType},
                                navArgument("picPhoto") { type = NavType.IntType}
                            )
                        ) { backStackEntry ->
                            //Aquí le pasamos la variable que recoge el nombre de la card
                            screenPicAndName(
                                backStackEntry.arguments?.getString("picName") ?: "",
                                backStackEntry.arguments?.getInt("picPhoto") ?: 0
                                ,navController
                            )
                        }
                    }
                }
            }
        }
    }
}
