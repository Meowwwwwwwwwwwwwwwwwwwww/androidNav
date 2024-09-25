package com.example.college

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


import androidx.compose.ui.unit.dp


@Composable
fun StudentPage( navigationto:()->Unit){

    Button(modifier = Modifier.size(24.dp), onClick = {
        navigationto()
    }) { Text(text = "movee2") }
}