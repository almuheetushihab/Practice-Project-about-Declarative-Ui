package com.example.declarativeui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.declarativeui.ui.theme.DeclarativeUiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DeclarativeUiTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android studio",
                        age = 20,
                        list = listOf("a", "b", "c"),
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, age: Int, list: List<String>, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = Modifier.padding(24.dp)
    )
    Text(
        text = "I am $age years old",
        modifier = modifier
    )
    list.forEach { _ ->
        Text(
            text = "my list is $list",
            modifier = modifier
                .padding(54.dp)
                .padding(12.dp)
                .padding(34.dp)
                .padding(24.dp)
                .then(modifier.border(2.dp, androidx.compose.ui.graphics.Color.Black))
                .then(modifier.background(color = androidx.compose.ui.graphics.Color.Green))
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DeclarativeUiTheme {
        Greeting("Android studio", 20, listOf("a", "b", "c"))
    }
}