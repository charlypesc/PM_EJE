package com.example.ejercicio

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.example.ejercicio.ui.theme.EjercicioTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
         PantallaInicio()
        }
    }
}
@Preview
@Composable
fun PantallaInicio() {
    val contexto = LocalContext.current
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ){
            Button(onClick = {
            val intento = Intent(contexto, Pantalla1Activity2::class.java)
            contexto.startActivity(intento)
        }){
            Text("Pantalla 1")
        }
        Button(onClick = {

        }) {
            Text("Pantalla 2")
        }
    }
}