package com.example.navigationdrawer

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.navigationdrawer.ui.theme.Purple40
import com.example.navigationdrawer.ui.theme.Purple80

@Preview
@Composable
fun electronica() {
    LazyColumn() {
        item {
            Row (horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .padding()
                    .fillMaxSize()
                    .fillMaxWidth()
                    .background(color = Color.Gray))                  //CON ESTO MODIFICO EL TITULO PARA QUE ESTE EN EL CENTRO
                    {
                        Text(       //AQUI LE ESTOY DANDO UNA FUENTE, UN TAMAÑO Y UN ESTILO AL TITULO
                            text = "ELECTRONICA",  //AQUI LE ESTOY DANDO ESTILOS AL TITULO
                            fontFamily = FontFamily.Serif,
                            color = Color.Black,
                            fontWeight = FontWeight.Light,
                            fontSize = 40.sp
                        )
                    }
            Row (               //CON ESTO MODIFICO EL TITULO DEL PRODUCTO
                modifier = Modifier
                    .padding()
                    .fillMaxSize()
                    .fillMaxWidth()
                    .background(color = Color.Gray),
                horizontalArrangement = Arrangement.Center)
            {//AQUI LE DOY UNA FUENTE Y UN ESTILO AL TITULO
                Text(text = "TUGAU Tableta Escritura",
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.Black
                )

            }
            Row (
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .padding()
                    .fillMaxSize()
                    .fillMaxWidth()
                    .background(color = Color.LightGray)
            ){
                Image(painter = painterResource(id = R.drawable.tablet), contentDescription = null,
                    Modifier.size(130.dp))      //AQUI LE DOY TAMAÑO A LA IMAGEN, ESTE ES EL MISMO EN TODAS PARA QUE OCUPEN LO MISMO TODAS
                Text(                           //CON LO SIGUIENTE PONGO LA DESCRIPCION DEL PRODUCTO
                    // Y A ESTA LE DOY UN TAMAÑO, UNA FUENTE Y UN RELLENO
                    //PARA QUE EL TEXTO ESTE LO MAS IGUALADO POSIBLE CON LA IMAGEN
                    text = "TUGAU Tableta Escritura LCD Adulto 15 Pulgadas Electrónica Tableta De Dibujo Borrable Tableta Grafica Niños Juguetes, Para Oficina, Dibujo y Memo (Gray) ",
                    fontSize = 12.sp,
                    fontFamily = FontFamily.Serif,
                    modifier = Modifier.padding(25.dp, 25.dp)
                )
            }
            Row (               //CON ESTO MODIFICO EL TITULO DEL PRODUCTO
                modifier = Modifier
                    .padding()
                    .fillMaxSize()
                    .fillMaxWidth()
                    .background(color = Color.Gray),
                horizontalArrangement = Arrangement.Center
            ){//AQUI LE DOY UNA FUENTE Y UN ESTILO AL TITULO
                Text(text = "Coche Robot Kit",
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.Black
                )
            }
            Row (
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .padding()
                    .fillMaxSize()
                    .fillMaxWidth()
                    .background(color = Color.LightGray)

            ){
                Image(painter = painterResource(id = R.drawable.coche), contentDescription = null,
                    Modifier.size(130.dp))      //AQUI LE DOY TAMAÑO A LA IMAGEN, ESTE ES EL MISMO EN TODAS PARA QUE OCUPEN LO MISMO TODAS
                Text(                           //CON LO SIGUIENTE PONGO LA DESCRIPCION DEL PRODUCTO
                    // Y A ESTA LE DOY UN TAMAÑO, UNA FUENTE Y UN RELLENO
                    //PARA QUE EL TEXTO ESTE LO MAS IGUALADO POSIBLE CON LA IMAGEN
                    text = "Adeept 4WD Omni-Directional Mecanum Wheels Robotic Car Kit for Raspberry Pi Pico DIY STEM Remote Controlled Educational Robot Kit con pantalla LCD1602 y tutoriales, a partir de 14 años, negro ",
                    fontSize = 12.sp,
                    fontFamily = FontFamily.Serif,
                    modifier = Modifier.padding(25.dp, 25.dp)
                )
            }
            Row(               //CON ESTO MODIFICO EL TITULO DEL PRODUCTO
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .padding()
                    .fillMaxSize()
                    .fillMaxWidth()
                    .background(color = Color.Gray) )
            {//AQUI LE DOY UNA FUENTE Y UN ESTILO AL TITULO
                Text(text = "Organizador Cables Viaje",
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.Black
                )
            }
            Row (
                modifier = Modifier
                    .padding()
                    .fillMaxSize()
                    .fillMaxWidth()
                    .background(color = Color.LightGray)){
                Image(painter = painterResource(id = R.drawable.organizador), contentDescription = null,
                    Modifier.size(130.dp))      //AQUI LE DOY TAMAÑO A LA IMAGEN, ESTE ES EL MISMO EN TODAS PARA QUE OCUPEN LO MISMO TODAS
                Text(                           //CON LO SIGUIENTE PONGO LA DESCRIPCION DEL PRODUCTO
                    // Y A ESTA LE DOY UN TAMAÑO, UNA FUENTE Y UN RELLENO
                    //PARA QUE EL TEXTO ESTE LO MAS IGUALADO POSIBLE CON LA IMAGEN
                    text = "UGREEN Organizador Cables Viaje, Bolsa Cables Organizador para Llevar, Bolsa de Accesorios Electrónico Impermeable con Mosquetón y Asa de Llevar para Cable, Auricular, Cargador, Batería Externa",
                    fontSize = 12.sp,
                    fontFamily = FontFamily.Serif,
                    modifier = Modifier.padding(15.dp, 15.dp))
            }
            Row (               //CON ESTO MODIFICO EL TITULO DEL PRODUCTO
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .padding()
                    .fillMaxSize()
                    .fillMaxWidth()
                    .background(color = Color.Gray) ){
                Text(//AQUI LE DOY UNA FUENTE Y UN ESTILO AL TITULO
                    text = "Lector dni USB",
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.Black)
            }

            Row(modifier = Modifier
                .padding()
                .fillMaxSize()
                .fillMaxWidth()
                .background(color = Color.LightGray)){
                Image(painter = painterResource(id = R.drawable.lector_dni), contentDescription = null,
                    Modifier.size(130.dp))      //AQUI LE DOY TAMAÑO A LA IMAGEN, ESTE ES EL MISMO EN TODAS PARA QUE OCUPEN LO MISMO TODAS
                Text(                           //CON LO SIGUIENTE PONGO LA DESCRIPCION DEL PRODUCTO
                    // Y A ESTA LE DOY UN TAMAÑO, UNA FUENTE Y UN RELLENO
                    //PARA QUE EL TEXTO ESTE LO MAS IGUALADO POSIBLE CON LA IMAGEN
                    text = "Lector dnie con conexión USB,No te preocupes por la distancia, el lector de DNI electrónico cuenta con un cable de 1.55 metros para que puedas utilizarlo cómodamente, incluso si el enchufe está lejos.",
                    fontSize = 12.sp,
                    fontFamily = FontFamily.Serif,
                    modifier = Modifier.padding(15.dp,15.dp)
                )
            }
            Row (               //CON ESTO MODIFICO EL TITULO DEL PRODUCTO
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .padding()
                    .fillMaxSize()
                    .fillMaxWidth()
                    .background(color = Color.Gray) ){
                Text(//AQUI LE DOY UNA FUENTE Y UN ESTILO AL TITULO
                    text = "Diana Electronica Digital",
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.Black)
            }

            Row(modifier = Modifier
                .padding()
                .fillMaxSize()
                .fillMaxWidth()
                .background(color = Color.LightGray)) {
                Image(painter = painterResource(id = R.drawable.diana_digital), contentDescription = null,
                    modifier = Modifier.size(130.dp))      //AQUI LE DOY TAMAÑO A LA IMAGEN, ESTE ES EL MISMO EN TODAS PARA QUE OCUPEN LO MISMO TODAS
                Text(                           //CON LO SIGUIENTE PONGO LA DESCRIPCION DEL PRODUCTO
                    // Y A ESTA LE DOY UN TAMAÑO, UNA FUENTE Y UN RELLENO
                    //PARA QUE EL TEXTO ESTE LO MAS IGUALADO POSIBLE CON LA IMAGEN
                    text = "HOMCOM Diana Electrónica Digital hasta 8 Jugadores con 12 Dardos y 30 Puntas con Pantalla LED Puertas 27 Juegos Distintos 51x6,5x57 cm Negro ",
                    fontSize = 12.sp,
                    fontFamily = FontFamily.Serif,
                    modifier = Modifier.padding(25.dp,25.dp))
            }
        }
    }
}



