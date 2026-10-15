package com.example.userinput

import android.R
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun FromDataDiri(modifier: Modifier){
    //variabel untuk mengingat nilai masukan dari keyboard
    var textName by remember { mutableStateOf(value = "") }
    var textAlamat by remember { mutableStateOf(value = "") }
    var textJK by remember { mutableStateOf(value = "") }
    var gender: List<String> = listOf("Laki-Laki","Perempuan")

    //variabel untuk menyimpan data yg diperoleh dari komponen UI
    var nama by remember {mutableStateOf(value= "")}
    var alamat by remember {mutableStateOf(value= "")}
    var jenis by remember {mutableStateOf(value= "")}

}