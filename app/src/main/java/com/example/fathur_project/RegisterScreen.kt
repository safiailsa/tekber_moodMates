package com.example.fathur_project

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp
import androidx.compose.ui.Alignment
import androidx.compose.foundation.shape.RoundedCornerShape

@Composable
fun RegisterScreen(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(horizontal = 30.dp, vertical = 0.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = null,
            modifier = Modifier.size(200.dp)
        )
        Spacer(modifier = modifier.height(20.dp))
        Text(
            text = "Create Your Account",
            fontWeight = FontWeight(600),
            color = Color.Black,
            fontSize = 32.sp
        )
        Spacer(modifier = modifier.height(30.dp))
        EmailInput()
        Spacer(modifier = modifier.height(20.dp))
        UsernameInput()
        Spacer(modifier = modifier.height(20.dp))
        PasswordInput()
        Spacer(modifier = modifier.height(20.dp))
        ConfirmPasswordInput()
        Spacer(modifier = modifier.height(50.dp))
        CustomButton(text = "Sign Up")
    }
}

@Composable
private fun EmailInput() {
    var email by remember { mutableStateOf("") }

    TextField(
        value = email,
        onValueChange = { email = it },
        placeholder = { Text("Email") },
        modifier = Modifier
            .fillMaxWidth()
            .shadow(
                elevation = 10.dp,
                shape = RoundedCornerShape(10.dp),
                clip = false
            )
            .background(Color.White, RoundedCornerShape(10.dp)),
        colors = TextFieldDefaults.textFieldColors(
            backgroundColor = Color.Transparent,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent
        ),
        textStyle = TextStyle(color = Color.Black, fontSize = 16.sp),
        keyboardOptions = KeyboardOptions.Default.copy(
            keyboardType = KeyboardType.Email,
            imeAction = ImeAction.Done
        ),
        keyboardActions = KeyboardActions(
            onDone = { /* belum ada */ }
        )
    )
}

@Composable
private fun UsernameInput() {
    var username by remember { mutableStateOf("") }

    TextField(
        value = username,
        onValueChange = { username = it },
        placeholder = { Text("Username") },
        modifier = Modifier
            .fillMaxWidth()
            .shadow(
                elevation = 10.dp,
                shape = RoundedCornerShape(10.dp),
                clip = false
            )
            .background(Color.White, RoundedCornerShape(10.dp)),
        colors = TextFieldDefaults.textFieldColors(
            backgroundColor = Color.Transparent,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent
        ),
        textStyle = TextStyle(color = Color.Black, fontSize = 16.sp),
        keyboardOptions = KeyboardOptions.Default.copy(
            keyboardType = KeyboardType.Email,
            imeAction = ImeAction.Done
        ),
        keyboardActions = KeyboardActions(
            onDone = { /* belum ada */ }
        )
    )
}

@Composable
private fun PasswordInput() {
    var password by remember { mutableStateOf("") }

    TextField(
        value = password,
        onValueChange = { password = it },
        placeholder = { Text("Password") },
        modifier = Modifier
            .fillMaxWidth()
            .shadow(
                elevation = 10.dp,
                shape = RoundedCornerShape(10.dp),
                clip = false
            )
            .background(Color.White, RoundedCornerShape(10.dp)),
        colors = TextFieldDefaults.textFieldColors(
            backgroundColor = Color.Transparent,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent
        ),
        textStyle = TextStyle(color = Color.Black, fontSize = 16.sp),
        keyboardOptions = KeyboardOptions.Default.copy(
            keyboardType = KeyboardType.Email,
            imeAction = ImeAction.Done
        ),
        keyboardActions = KeyboardActions(
            onDone = { /* belum ada */ }
        )
    )
}

@Composable
private fun ConfirmPasswordInput() {
    var confirmPassword by remember { mutableStateOf("")}

    TextField(
        value = confirmPassword,
        onValueChange = { confirmPassword = it },
        placeholder = { Text("Confirm Password") },
        modifier = Modifier
            .fillMaxWidth()
            .shadow(
                elevation = 10.dp,
                shape = RoundedCornerShape(10.dp),
                clip = false
            )
            .background(Color.White, RoundedCornerShape(10.dp)),
        colors = TextFieldDefaults.textFieldColors(
            backgroundColor = Color.Transparent,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent
        ),
        textStyle = TextStyle(color = Color.Black, fontSize = 16.sp),
        keyboardOptions = KeyboardOptions.Default.copy(
            keyboardType = KeyboardType.Email,
            imeAction = ImeAction.Done
        ),
        keyboardActions = KeyboardActions(
            onDone = { /* belum ada */ }
        )
    )
}