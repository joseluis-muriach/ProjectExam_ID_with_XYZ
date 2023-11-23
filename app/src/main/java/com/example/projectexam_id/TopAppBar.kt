package com.example.projectexam_id

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun myTopAppBar(){
    TopAppBar(
        //Siempre pondremos el titulo primero y luego lo demas
        title = {
            Text(
                text = "PlacesInTheWold",
                color = Color.White
            )
        },
        colors = TopAppBarDefaults.mediumTopAppBarColors(containerColor = Color(0xFF3D70D6)),
        navigationIcon = { //Aquí pondremos el botton que queramos que haga la acción
            IconButton(onClick = { /*TODO*/ }) { //En el onclick, en este caso no hará nada
                Icon(
                    imageVector = Icons.Filled.Menu,
                    contentDescription = "",
                    tint = Color.White
                )
            }
        },
        actions = { //Para poner los tres puntos o cualquier icono a la derecha
            //Haciendo click el lambda cambia de false a true o viceversa
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Filled.MoreVert,
                    contentDescription = "Desplegable de dos opciones",
                    tint = Color.White
                )
            }
        }
    )
}