package com.example.college

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.material3.DropdownMenu

@Composable
fun MainScreen( navto:()->Unit,
                navtoo:()->Unit

                ) {

    var expand by remember { mutableStateOf(false) }
    Column(modifier=Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center)  {

Box(modifier = Modifier.padding(24.dp)
    ) {
    Button(onClick = { expand =true }) {
        Text(text = "Select")
        Icon(Icons.Default.ArrowDropDown, contentDescription = "")
    }
    DropdownMenu(expanded=expand, onDismissRequest = { expand=false}) {
            DropdownMenuItem(text = { Text(text = "Teacher")}, onClick = {
                /*Teacher Page */
                navto()
                  expand =false
            })
            DropdownMenuItem(text = { Text(text = "Student") }, onClick = {
                /*Student Page*/
                navtoo()
                 expand=false
            })
        }
    }
}
}