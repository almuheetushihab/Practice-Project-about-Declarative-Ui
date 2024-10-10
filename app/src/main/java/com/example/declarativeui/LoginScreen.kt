package com.example.declarativeui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun LoginScreen(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp),
        contentAlignment = Alignment.TopStart

    ){
       Column(
           horizontalAlignment = Alignment.CenterHorizontally,
           modifier = Modifier.verticalScroll(rememberScrollState())
       ){
           Text(
               text = "Welcome to the Login Screen",
               color = Color.Black,
               modifier = Modifier
                   .padding(16.dp)
                   .height(25.dp)
                   .align(Alignment.CenterHorizontally)
           )
           Image(
               painter = painterResource(id = R.drawable.product_1),
               contentDescription = "Product Image",
               modifier = Modifier
                   .size(150.dp)
                   .padding(top = 16.dp)
           )
           TextField(
               value = "",
               onValueChange = {},
               placeholder = { Text(text = "Username")},
               modifier = Modifier
                   .fillMaxSize()
                   .height(100.dp)
                   .padding(top = 40.dp),
               singleLine = true
           )
           TextField(
               value = "",
               onValueChange = {},
               placeholder = { Text(text = "Password")},
               modifier = Modifier
                   .fillMaxSize()
                   .height(100.dp)
                   .padding(top = 40.dp),
               singleLine = true
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
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview(){
    LoginScreen()
}