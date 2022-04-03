package com.example.note_view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.note_view.ui.theme.Note_viewTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Note_viewTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("Android")
                    MyButton(text = "Click me!")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Composable
fun MyButton(text: String) {
    Button(
        onClick = {}
    ) {
        Text(
            text = text
        )
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Note_viewTheme {
        Greeting("Android")
        Spacer(modifier = Modifier.fillMaxSize())
        MyButton(text = "Click me!")
    }
}