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
import androidx.compose.ui.res.colorResource
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
fun juguetes() {
    LazyColumn() {
        item {
            Row (
                modifier = Modifier
                    .padding()
                    .fillMaxSize()
                    .fillMaxWidth()
                    .background(color = colorResource(id = R.color.rojito_claro)),
                horizontalArrangement = Arrangement.Center)                  //CON ESTO MODIFICO EL TITULO PARA QUE ESTE EN EL CENTRO
            {
                Text(       //AQUI LE ESTOY DANDO UNA FUENTE, UN TAMAÑO Y UN ESTILO AL TITULO
                    text = "JUGUETES",  //AQUI LE ESTOY DANDO ESTILOS AL TITULO
                    fontFamily = FontFamily.Serif,
                    color = Color.Black,
                    fontWeight = FontWeight.Light,
                    fontSize = 40.sp,
                )
            }
            Row (               //CON ESTO MODIFICO EL TITULO DEL PRODUCTO
                modifier = Modifier
                    .padding()
                    .fillMaxSize()
                    .fillMaxWidth()
                    .background(color = colorResource(id = R.color.degradao)),
                horizontalArrangement = Arrangement.Center)
            {//AQUI LE DOY UNA FUENTE Y UN ESTILO AL TITULO
                Text(text = "LEGO Marvel Persecución en Moto",
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.Black,
                    color = Color.Black
                )

            }
            Row (
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .padding()
                    .fillMaxSize()
                    .fillMaxWidth()
                    .background(color = colorResource(id = R.color.rojito_claro))
            ){
                Image(painter = painterResource(id = R.drawable.sipderman), contentDescription = null,
                    Modifier.size(130.dp))      //AQUI LE DOY TAMAÑO A LA IMAGEN, ESTE ES EL MISMO EN TODAS PARA QUE OCUPEN LO MISMO TODAS
                Text(                           //CON LO SIGUIENTE PONGO LA DESCRIPCION DEL PRODUCTO
                    // Y A ESTA LE DOY UN TAMAÑO, UNA FUENTE Y UN RELLENO
                    //PARA QUE EL TEXTO ESTE LO MAS IGUALADO POSIBLE CON LA IMAGEN
                    text = "LEGO Marvel Persecución en Moto: Spider-Man vs. Doc Ock, Juguete de Construcción con Cañones y Aracnoblásteres, Moto de Spidey, Regalo para Niños, Niñas y Fans de Superhéroes de 6 Años o Más 76275 ",
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
                    .background(color = colorResource(id = R.color.degradao)),
                horizontalArrangement = Arrangement.Center
            ){//AQUI LE DOY UNA FUENTE Y UN ESTILO AL TITULO
                Text(text = "LEGO Technic Buggy de Carreras Todoterreno",
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.Black,
                    color = Color.Black
                )
            }
            Row (
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .padding()
                    .fillMaxSize()
                    .fillMaxWidth()
                    .background(color = colorResource(id = R.color.rojito_claro)

                    )){
                Image(painter = painterResource(id = R.drawable.coche1), contentDescription = null,
                    Modifier.size(130.dp))      //AQUI LE DOY TAMAÑO A LA IMAGEN, ESTE ES EL MISMO EN TODAS PARA QUE OCUPEN LO MISMO TODAS
                Text(                           //CON LO SIGUIENTE PONGO LA DESCRIPCION DEL PRODUCTO
                    // Y A ESTA LE DOY UN TAMAÑO, UNA FUENTE Y UN RELLENO
                    //PARA QUE EL TEXTO ESTE LO MAS IGUALADO POSIBLE CON LA IMAGEN
                    text = "LEGO Technic Buggy de Carreras Todoterreno, Vehículo de Rally, Set para Construir un Coche de Carreras de Juguete, Regalo para Niños y Niñas de 8 Años o Más 42164 ",
                    fontSize = 12.sp,
                    fontFamily = FontFamily.Serif,
                    modifier = Modifier.padding(25.dp, 25.dp)
                )
            }
            Row(               //CON ESTO MODIFICO EL TITULO DEL PRODUCTO
                modifier = Modifier
                    .padding()
                    .fillMaxSize()
                    .fillMaxWidth()
                    .background(color = colorResource(id = R.color.degradao)),
                horizontalArrangement = Arrangement.Center )
            {//AQUI LE DOY UNA FUENTE Y UN ESTILO AL TITULO
                Text(text = "Maxesla Coche Teledirigido Transformers ",
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.Black,
                    color = Color.Black
                )
            }
            Row (
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .padding()
                    .fillMaxSize()
                    .fillMaxWidth()
                    .background(color = colorResource(id = R.color.rojito_claro))){
                Image(painter = painterResource(id = R.drawable.transformer), contentDescription = null,
                    Modifier.size(130.dp))      //AQUI LE DOY TAMAÑO A LA IMAGEN, ESTE ES EL MISMO EN TODAS PARA QUE OCUPEN LO MISMO TODAS
                Text(                           //CON LO SIGUIENTE PONGO LA DESCRIPCION DEL PRODUCTO
                    // Y A ESTA LE DOY UN TAMAÑO, UNA FUENTE Y UN RELLENO
                    //PARA QUE EL TEXTO ESTE LO MAS IGUALADO POSIBLE CON LA IMAGEN
                    text = "Maxesla Coche Teledirigido Transformers para Niños, 2 in 1 Robot RC Car, 2.4GHz Coche Radiocontrol with LED, Batería Recargable, Transforming Toys Juguetes Regalo para niños de 3 4 5 6 7 años,Azul ",
                    fontSize = 12.sp,
                    fontFamily = FontFamily.Serif,
                    modifier = Modifier.padding(15.dp, 15.dp))
            }
            Row (               //CON ESTO MODIFICO EL TITULO DEL PRODUCTO
                modifier = Modifier
                    .padding()
                    .fillMaxSize()
                    .fillMaxWidth()
                    .background(color = colorResource(id = R.color.degradao)),
                horizontalArrangement = Arrangement.Center ){
                Text(//AQUI LE DOY UNA FUENTE Y UN ESTILO AL TITULO
                    text = "Dobby el Elfo Doméstico",
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.Black,
                    color = Color.Black)
            }

            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .padding()
                    .fillMaxSize()
                    .fillMaxWidth()
                    .background(color = colorResource(id = R.color.rojito_claro))){
                Image(painter = painterResource(id = R.drawable.dobby), contentDescription = null,
                    Modifier.size(130.dp))      //AQUI LE DOY TAMAÑO A LA IMAGEN, ESTE ES EL MISMO EN TODAS PARA QUE OCUPEN LO MISMO TODAS
                Text(                           //CON LO SIGUIENTE PONGO LA DESCRIPCION DEL PRODUCTO
                    // Y A ESTA LE DOY UN TAMAÑO, UNA FUENTE Y UN RELLENO
                    //PARA QUE EL TEXTO ESTE LO MAS IGUALADO POSIBLE CON LA IMAGEN
                    text = "LEGO 76421 Harry Potter Dobby el Elfo Doméstico, Regalo de Reyes para Niñas, Niños, Adolescentes y Fans de 8+ Años, Juguete y Decoración para la Habitación, Colección de Figura Icónica de Personaje ",
                    fontSize = 12.sp,
                    fontFamily = FontFamily.Serif,
                    modifier = Modifier.padding(15.dp,15.dp)
                )
            }
            Row (               //CON ESTO MODIFICO EL TITULO DEL PRODUCTO
                modifier = Modifier
                    .padding()
                    .fillMaxSize()
                    .fillMaxWidth()
                    .background(color = colorResource(id = R.color.degradao)),
                horizontalArrangement = Arrangement.Center ){
                Text(//AQUI LE DOY UNA FUENTE Y UN ESTILO AL TITULO
                    text = "LEGO Marvel Armadura Robótica de Venom ",
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.Black,
                    color = Color.Black)

            }

            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .padding()
                    .fillMaxSize()
                    .fillMaxWidth()
                    .background(color = colorResource(id = R.color.rojito_claro))
            ) {
                Image(painter = painterResource(id = R.drawable.venom), contentDescription = null,
                    modifier = Modifier.size(130.dp))      //AQUI LE DOY TAMAÑO A LA IMAGEN, ESTE ES EL MISMO EN TODAS PARA QUE OCUPEN LO MISMO TODAS
                Text(                           //CON LO SIGUIENTE PONGO LA DESCRIPCION DEL PRODUCTO
                    // Y A ESTA LE DOY UN TAMAÑO, UNA FUENTE Y UN RELLENO
                    //PARA QUE EL TEXTO ESTE LO MAS IGUALADO POSIBLE CON LA IMAGEN
                    text = "LEGO Marvel Armadura Robótica de Venom vs. Miles Morales, Lucha Entre Superhéroes Articulados, Juguete de Construcción con Minifigura de Spider-Man, Regalo para Niños y Niñas de 6 Años o Más 76276 ",
                    fontSize = 12.sp,
                    fontFamily = FontFamily.Serif,
                    modifier = Modifier.padding(15.dp,15.dp))
            }
        }
    }
}



