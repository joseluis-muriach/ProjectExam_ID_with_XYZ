package com.example.projectexam_id

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController

@Composable
fun floatingButtom(navController: NavController){
    FloatingActionButton(
        onClick = {
                  navController.navigate("coverProject")
        },
        containerColor = Color(0xFF6E98EC)
    ) {
        Icon(
            imageVector = Icons.Default.ArrowBack,
            contentDescription = null,
            tint = Color.White
        )
    }
}