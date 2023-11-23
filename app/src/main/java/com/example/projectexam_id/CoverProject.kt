package com.example.projectexam_id

import android.annotation.SuppressLint
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class, ExperimentalFoundationApi::class)
@Composable
fun coverProject(navHostController: NavHostController) {
    //Para el Top Bar y para el Floating Buttom
    Scaffold(
        topBar = { myTopAppBar()
        },
        floatingActionButton = {
            floatingButtom(navHostController)
        }
    ) {
        //Donde meteremos la Lazy mas abajo
        Column(
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.padding(top = it.calculateTopPadding()
            )
        ) {

            LazyVerticalStaggeredGrid(
                columns = StaggeredGridCells.Fixed(2),
                content = {
                    items(getPicAndName()) {allItems ->
                        cardWithText(
                            picturesAndName = allItems,
                            navHostController
                        )
                    }
                }
            )
        }
    }
}