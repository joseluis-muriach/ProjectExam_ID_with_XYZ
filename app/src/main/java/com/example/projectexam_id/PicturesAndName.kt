package com.example.projectexam_id

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

data class PicturesAndName(
    var name: String,
    @DrawableRes var photo: Int
)

fun getPicAndName(): List<PicturesAndName> {
    return listOf(
        PicturesAndName(
            "Morella",
            R.drawable.image
        ),
        PicturesAndName(
            "Lugo",
            R.drawable.image1
        ),
        PicturesAndName(
            "Bangkok",
            R.drawable.image2
        ),
        PicturesAndName(
            "Perú",
            R.drawable.image3
        ),
        PicturesAndName(
            "Pekin",
            R.drawable.image4
        ),
        PicturesAndName(
            "Granada",
            R.drawable.image5
        ),
        PicturesAndName(
            "Atenas",
            R.drawable.image6
        ),
        PicturesAndName(
            "Yukatan",
            R.drawable.image7
        ),
        PicturesAndName(
            "Seychelles",
            R.drawable.image8
        ),
    )
}

@Composable
fun cardWithText(picturesAndName: PicturesAndName, navController: NavController) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            modifier = Modifier
                .fillMaxSize()
                .clickable {
                    navController.navigate("screenPicAndName/${picturesAndName.name}/${picturesAndName.photo}")
                }
                .padding(2.dp),
            painter = painterResource(id = picturesAndName.photo),
            contentDescription = "Imagen",
            contentScale = ContentScale.Crop
        )
        Column {
            TextButton(
                onClick = {},
                Modifier
                    .background(
                        color = Color.Black.copy(alpha = 0.4f)
                    )
            ) {
                Row(
                    Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = picturesAndName.name,
                        fontSize = 25.sp,
                        color = Color.White,
                        textDecoration = TextDecoration.Underline
                    )
                }
            }
        }
    }
}



