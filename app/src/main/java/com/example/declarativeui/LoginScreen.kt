package com.example.declarativeui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LoginScreen() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(16.dp)
            .padding(top = 80.dp)
    ) {
        Text(
            text = "Welcome, User",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            modifier = Modifier
                .padding(16.dp)
                .height(30.dp)
                .align(Alignment.CenterHorizontally)

        )
        Image(
            painter = painterResource(id = R.drawable.product_1),
            contentDescription = "Product Image",
            modifier = Modifier
                .size(150.dp)
                .padding(top = 16.dp, bottom = 16.dp)
        )
        TextField(
            value = "",
            onValueChange = {},
            placeholder = { Text(text = "FullName") },
            modifier = Modifier
                .height(100.dp)
                .padding(top = 24.dp, start = 16.dp, end = 16.dp)
                .fillMaxWidth(),
            singleLine = true
        )
        TextField(
            value = "",
            onValueChange = {},
            placeholder = { Text(text = "Username") },
            modifier = Modifier
                .height(100.dp)
                .padding(top = 24.dp, start = 16.dp, end = 16.dp)
                .fillMaxWidth(),
            singleLine = true
        )
        TextField(
            value = "",
            onValueChange = {},
            placeholder = { Text(text = "Password") },
            modifier = Modifier
                .height(100.dp)
                .padding(top = 24.dp, start = 16.dp, end = 16.dp)
                .fillMaxWidth(),
            singleLine = true
        )
        Text(
            text = "Forgot Password?",
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Blue,
            modifier = Modifier
                .align(Alignment.End)
                .padding(end = 16.dp, top = 8.dp),
        )
        Button(
            onClick = {},
            modifier = Modifier
                .width(200.dp)
                .height(100.dp)
                .padding(top = 40.dp)
        ) {
            Text(text = "Login")
        }

    }
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    LoginScreen()
}