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
fun hogar() {
    LazyColumn() {
        item {
            Row (horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .padding()
                    .fillMaxSize()
                    .fillMaxWidth()
                    .background(color = Purple40))                  //CON ESTO MODIFICO EL TITULO PARA QUE ESTE EN EL CENTRO
            {
                Text(       //AQUI LE ESTOY DANDO UNA FUENTE, UN TAMAÑO Y UN ESTILO AL TITULO
                    text = "HOGAR",  //AQUI LE ESTOY DANDO ESTILOS AL TITULO
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
                    .background(color = Purple40),
            horizontalArrangement = Arrangement.Center)
            {//AQUI LE DOY UNA FUENTE Y UN ESTILO AL TITULO
                Text(text = "Humidificador Ultrasonico",
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
                    .background(color = Purple80)
            ){
                Image(painter = painterResource(id = R.drawable.humidificador), contentDescription = null,
                    Modifier.size(130.dp))      //AQUI LE DOY TAMAÑO A LA IMAGEN, ESTE ES EL MISMO EN TODAS PARA QUE OCUPEN LO MISMO TODAS
                Text(                           //CON LO SIGUIENTE PONGO LA DESCRIPCION DEL PRODUCTO
                                                // Y A ESTA LE DOY UN TAMAÑO, UNA FUENTE Y UN RELLENO
                                                //PARA QUE EL TEXTO ESTE LO MAS IGUALADO POSIBLE CON LA IMAGEN
                    text = "Cecotec Humidificador Ultrasónico y Difusor de Aromas con Temporizador Pure Aroma 150 Yang. Capacidad 150 ml, Temporizador 3 Horas, 7 Colores led, Función aromaterapia, Ultra silencioso ",
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
                    .background(color = Purple40),
                horizontalArrangement = Arrangement.Center
            ){//AQUI LE DOY UNA FUENTE Y UN ESTILO AL TITULO
                Text(text = "Vela Aromatica",
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
                    .background(color = Purple80)

            ){
                Image(painter = painterResource(id = R.drawable.vela), contentDescription = null,
                    Modifier.size(130.dp))      //AQUI LE DOY TAMAÑO A LA IMAGEN, ESTE ES EL MISMO EN TODAS PARA QUE OCUPEN LO MISMO TODAS
                Text(                           //CON LO SIGUIENTE PONGO LA DESCRIPCION DEL PRODUCTO
                                                // Y A ESTA LE DOY UN TAMAÑO, UNA FUENTE Y UN RELLENO
                                                //PARA QUE EL TEXTO ESTE LO MAS IGUALADO POSIBLE CON LA IMAGEN
                    text = "LA JOLIE MUSE Vela Aromática de Abeto, Cera Natural, 80 Horas de Combustión Prolongada, Envase de Vidrio para Regalo y Decoración del Hogar, 350g ",
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
                    .background(color = Purple40) )
            {//AQUI LE DOY UNA FUENTE Y UN ESTILO AL TITULO
                Text(text = "Estatua Rafiki",
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.Black
                )
            }
            Row (
                modifier = Modifier
                    .padding()
                    .fillMaxSize()
                    .fillMaxWidth()
                    .background(color = Purple80)){
                Image(painter = painterResource(id = R.drawable.rafiki), contentDescription = null,
                    Modifier.size(130.dp))      //AQUI LE DOY TAMAÑO A LA IMAGEN, ESTE ES EL MISMO EN TODAS PARA QUE OCUPEN LO MISMO TODAS
                Text(                           //CON LO SIGUIENTE PONGO LA DESCRIPCION DEL PRODUCTO
                                                // Y A ESTA LE DOY UN TAMAÑO, UNA FUENTE Y UN RELLENO
                                                //PARA QUE EL TEXTO ESTE LO MAS IGUALADO POSIBLE CON LA IMAGEN
                    text = "Figurilla decorativa creada por el artista Jim Shore, producto adecuado para regalar, decorar o coleccionar nombre de la colección: Disney Traditions el producto es pintado a mano, material del producto: resina de piedra",
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
                    .background(color = Purple40) ){
                Text(//AQUI LE DOY UNA FUENTE Y UN ESTILO AL TITULO
                    text = "Llavero Marshall",
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.Black)
            }

            Row(modifier = Modifier
                .padding()
                .fillMaxSize()
                .fillMaxWidth()
                .background(color = Purple80)){
                Image(painter = painterResource(id = R.drawable.llavero), contentDescription = null,
                    Modifier.size(130.dp))      //AQUI LE DOY TAMAÑO A LA IMAGEN, ESTE ES EL MISMO EN TODAS PARA QUE OCUPEN LO MISMO TODAS
                Text(                           //CON LO SIGUIENTE PONGO LA DESCRIPCION DEL PRODUCTO
                                                // Y A ESTA LE DOY UN TAMAÑO, UNA FUENTE Y UN RELLENO
                                                //PARA QUE EL TEXTO ESTE LO MAS IGUALADO POSIBLE CON LA IMAGEN
                    text = "Shallyong Colgador Llaves Pared JCM800, Marshall key Holder, Cuelga Llaves Pared con 4 Llaveros de Enchufe, Moda Caja Llaves Pared Apto para salón, guardarropa, oficina ",
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
                    .background(color = Purple40) ){
                Text(//AQUI LE DOY UNA FUENTE Y UN ESTILO AL TITULO
                    text = "Incienso Nag",
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.Black)
            }

            Row(modifier = Modifier
                .padding()
                .fillMaxSize()
                .fillMaxWidth()
                .background(color = Purple80)) {
                Image(painter = painterResource(id = R.drawable.incienso), contentDescription = null,
                    modifier = Modifier.size(130.dp))      //AQUI LE DOY TAMAÑO A LA IMAGEN, ESTE ES EL MISMO EN TODAS PARA QUE OCUPEN LO MISMO TODAS
                Text(                           //CON LO SIGUIENTE PONGO LA DESCRIPCION DEL PRODUCTO
                                                // Y A ESTA LE DOY UN TAMAÑO, UNA FUENTE Y UN RELLENO
                                                //PARA QUE EL TEXTO ESTE LO MAS IGUALADO POSIBLE CON LA IMAGEN
                    text = "Incienso Nag Champa Pack 72 Sticks + Quemador Incienso – Aromaterapia - Limpieza Energética de Ambientes: Palo Santo – Lavanda – Sándalo – Agarbatti – Super Hit (Pack 6)",
                    fontSize = 12.sp,
                    fontFamily = FontFamily.Serif,
                    modifier = Modifier.padding(15.dp,15.dp))
            }
        }
    }
}



