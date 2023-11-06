package com.example.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTheme {
                // A surface container using the 'background' color from the theme
               // App()
                lunchEffectExample()
            }
        }
    }
}

@Composable
fun App() {
    val theme = remember {
        mutableStateOf(false)
    }
    JetpackComposeTheme(theme.value) {
        Column {
            Text(
                "Hey Coder Take Rest",
                style = MaterialTheme.typography.bodySmall
            )
            Button(onClick = { theme.value = !theme.value }) {
                Text("Switch Theme")
            }
        }
    }

}