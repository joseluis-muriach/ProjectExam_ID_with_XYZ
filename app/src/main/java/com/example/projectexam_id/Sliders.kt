package com.example.projectexam_id

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun sliderRotationX(rotation: Float, onRotationChange: (Float) -> Unit) {
    Slider(
        value = rotation,
        onValueChange = { value -> onRotationChange(value) },
        valueRange = 0f..360f,
        steps = 360,
        modifier = Modifier.fillMaxWidth()
            .padding(start = 27.dp, end = 27.dp)
    )
    Text("Rotation X: $rotation",
        color = Color.White,
        modifier = Modifier.fillMaxWidth()
            .padding(start = 27.dp, end = 27.dp)
    )
    Spacer(modifier = Modifier.height(16.dp))
}

@Composable
fun sliderRotationY(rotation: Float, onRotationChange: (Float) -> Unit) {
    Slider(
        value = rotation,
        onValueChange = { value -> onRotationChange(value) },
        valueRange = 0f..360f,
        steps = 360,
        modifier = Modifier.fillMaxWidth()
            .padding(start = 27.dp, end = 27.dp)
    )
    Text("Rotation Y: $rotation",
        color = Color.White,
        modifier = Modifier.fillMaxWidth()
            .padding(start = 27.dp, end = 27.dp))
    Spacer(modifier = Modifier.height(16.dp))
}

@Composable
fun sliderRotationZ(rotation: Float, onRotationChange: (Float) -> Unit) {
    Slider(
        value = rotation,
        onValueChange = { value -> onRotationChange(value) },
        valueRange = 0f..360f,
        steps = 360,
        modifier = Modifier.fillMaxWidth()
            .padding(start = 27.dp, end = 27.dp)
    )
    Text("Rotation Z: $rotation",
        color = Color.White,
        modifier = Modifier.fillMaxWidth()
            .padding(start = 27.dp, end = 27.dp)
    )
    Spacer(modifier = Modifier.height(16.dp))
}