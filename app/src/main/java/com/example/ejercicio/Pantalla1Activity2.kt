package com.example.ejercicio

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.example.ejercicio.ui.theme.EjercicioTheme

class Pantalla1Activity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Pantalla1()
        }
    }
}


@Preview(showBackground = true)
@Composable
fun Pantalla1() {
    val contexto = LocalContext.current
    Column(
        modifier = Modifier.fillMaxSize().background(Color.Cyan)
    ){}
       Button(onClick = {
            val intento = Intent(contexto, MainActivity::class.java)
            contexto.startActivity(intento);
       }){
            Text(text = "Volver")
       }
}

