package com.example.userinput

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf

@Composable
fun FromDataDiri(modifier: Modifier){
    //variabel untuk mengingat nilai masukan dari keyboard
    var textName by remember { mutableStateOf(value = "") }
}