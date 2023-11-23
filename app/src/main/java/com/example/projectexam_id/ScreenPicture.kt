package com.example.projectexam_id

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.projectexam_id.ui.theme.FontTitle
import com.example.projectexam_id.ui.theme.Purple80

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun screenPicAndName(
    navController2: String,
    navController1: Int,
    navController: NavHostController
) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val namePic = navBackStackEntry?.arguments?.getString("picName") ?: ""
    val colorStops =
        arrayOf(
            0.2f to Color.Black,
            1f to Purple80
        )
    Scaffold(
        topBar = {
            myTopAppBar()
        },
        floatingActionButton = {
            floatingButtom(navController)
        }
    ) {

        var rotationX by remember { mutableStateOf(0f) }
        var rotationY by remember { mutableStateOf(0f) }
        var rotationZ by remember { mutableStateOf(0f) }

        Column(
            Modifier
                .fillMaxSize()
                .background(Brush.verticalGradient(colorStops = colorStops)),
            horizontalAlignment = CenterHorizontally

        ) {
            Column(
                //Esta es la row donde va el titulo que cogemos de la otra clase
                Modifier
                    .padding(top = it.calculateTopPadding()),
            ) {
                Text(
                    text = namePic,
                    fontSize = 40.sp,
                    fontFamily = FontTitle,
                    modifier = Modifier.padding(10.dp),
                    color = Color.White
                )
            }
        }

        Column( //Creamos la columna para coger la superficie
            verticalArrangement = Arrangement.Center,
            //Importante por que sino no sale, ya que esta debajo de la pantalla
            modifier = Modifier.fillMaxSize()
        ) {

            Image(
                painter = painterResource(id = navController1),
                contentDescription = "photo",
                modifier = Modifier
                    .graphicsLayer {
                        this.rotationX = rotationX
                        this.rotationY = rotationY
                        this.rotationZ = rotationZ
                    }
                    .align(CenterHorizontally),
                contentScale = ContentScale.FillWidth
            )

            Spacer(modifier = Modifier.height(16.dp))

            sliderRotationX(rotationX) { value ->
                rotationX = value
            }
            sliderRotationY(rotationY) { value ->
                rotationY = value
            }

            sliderRotationZ(rotationZ) { value ->
                rotationZ = value
            }


//            Image(
//                painter =
//                painterResource(
//                    id = navController1
//                ),
//                contentDescription = "photo",
//                //modifier = Modifier.fillMaxSize(),
//                modifier = Modifier
//                    .align(CenterHorizontally),
//                contentScale = ContentScale.FillWidth
//            )
//
//            Spacer(modifier = Modifier.padding(10.dp))

        }
    }
}