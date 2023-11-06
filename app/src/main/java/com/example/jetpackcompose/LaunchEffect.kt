package com.example.jetpackcompose

import android.util.Log
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

class LaunchEffect {
}

@Composable
fun lunchEffectExample() {
    val counter = remember {
        mutableStateOf(0)
    }
    LaunchedEffect(key1 = (counter.value % 2 == 0)) {
     Log.d("Launch effect","called")
    }
    Button(onClick = { counter.value++ }) {
        Text("increment counter")
    }

}