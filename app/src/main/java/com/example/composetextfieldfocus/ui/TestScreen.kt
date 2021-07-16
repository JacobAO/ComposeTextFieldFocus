package com.example.composetextfieldfocus.ui

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.remember

@Composable
fun TestScreen() {
    val values = remember { mutableStateMapOf(*Array(20) { it to "" })}

    LazyColumn {
        itemsIndexed(values.keys.toList()) { i: Int, _: Int ->
            TextField(
                value = values[i] ?: "",
                onValueChange = { newValue ->
                    values[i] = newValue
                },
                label = {
                    Text("Field number $i")
                }
            )
        }
    }
}