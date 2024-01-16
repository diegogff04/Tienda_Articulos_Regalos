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
fun ropa() {
    LazyColumn() {
        item {
            Row (
                modifier = Modifier
                .padding()
                .fillMaxSize()
                .fillMaxWidth()
                .background(color = Color.Black),
                horizontalArrangement = Arrangement.Center)                  //CON ESTO MODIFICO EL TITULO PARA QUE ESTE EN EL CENTRO
            {
                Text(       //AQUI LE ESTOY DANDO UNA FUENTE, UN TAMAÑO Y UN ESTILO AL TITULO
                    text = "ROPA",  //AQUI LE ESTOY DANDO ESTILOS AL TITULO
                    fontFamily = FontFamily.Serif,
                    color = Color.White,
                    fontWeight = FontWeight.Light,
                    fontSize = 40.sp,
                )
            }
            Row (               //CON ESTO MODIFICO EL TITULO DEL PRODUCTO
                modifier = Modifier
                    .padding()
                    .fillMaxSize()
                    .fillMaxWidth()
                    .background(color = Color.Black),
                horizontalArrangement = Arrangement.Center)
            {//AQUI LE DOY UNA FUENTE Y UN ESTILO AL TITULO
                Text(text = "Chaleco Con Calefaccion",
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.Black,
                    color = Color.White
                )

            }
            Row (
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .padding()
                    .fillMaxSize()
                    .fillMaxWidth()
                    .background(color = Color.White)
            ){
                Image(painter = painterResource(id = R.drawable.chaleco_calefaccion), contentDescription = null,
                    Modifier.size(130.dp))      //AQUI LE DOY TAMAÑO A LA IMAGEN, ESTE ES EL MISMO EN TODAS PARA QUE OCUPEN LO MISMO TODAS
                Text(                           //CON LO SIGUIENTE PONGO LA DESCRIPCION DEL PRODUCTO
                    // Y A ESTA LE DOY UN TAMAÑO, UNA FUENTE Y UN RELLENO
                    //PARA QUE EL TEXTO ESTE LO MAS IGUALADO POSIBLE CON LA IMAGEN
                    text = "Rrtizan Chaleco con Calefacción Eléctrica USB, Chaleco Calefactable para Hombres y Mujeres, 3 Niveles de Temperatura con 9 Hojas de Calefacción, Lavable Chalecos de Invierno Cálidos (Batería Opcional) ",
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
                    .background(color = Color.Black),
                horizontalArrangement = Arrangement.Center
            ){//AQUI LE DOY UNA FUENTE Y UN ESTILO AL TITULO
                Text(text = "PANTALÓN ESTRUCTURA CONFORT",
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.Black,
                    color = Color.White
                )
            }
            Row (
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .padding()
                    .fillMaxSize()
                    .fillMaxWidth()
                    .background(color = Color.White)

            ){
                Image(painter = painterResource(id = R.drawable.pantalon), contentDescription = null,
                    Modifier.size(130.dp))      //AQUI LE DOY TAMAÑO A LA IMAGEN, ESTE ES EL MISMO EN TODAS PARA QUE OCUPEN LO MISMO TODAS
                Text(                           //CON LO SIGUIENTE PONGO LA DESCRIPCION DEL PRODUCTO
                    // Y A ESTA LE DOY UN TAMAÑO, UNA FUENTE Y UN RELLENO
                    //PARA QUE EL TEXTO ESTE LO MAS IGUALADO POSIBLE CON LA IMAGEN
                    text = "Pantalón confeccionado en tejido elástico con estructura diagonal. Cintura ajustable con cordón. Bolsillos frontales y detalle de bolsillos traseros de vivo.",
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
                    .background(color = Color.Black),
                horizontalArrangement = Arrangement.Center )
            {//AQUI LE DOY UNA FUENTE Y UN ESTILO AL TITULO
                Text(text = "BOTA SERRAJE BORREGUILLO",
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.Black,
                    color = Color.White
                )
            }
            Row (
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .padding()
                    .fillMaxSize()
                    .fillMaxWidth()
                    .background(color = Color.White)){
                Image(painter = painterResource(id = R.drawable.bota), contentDescription = null,
                    Modifier.size(130.dp))      //AQUI LE DOY TAMAÑO A LA IMAGEN, ESTE ES EL MISMO EN TODAS PARA QUE OCUPEN LO MISMO TODAS
                Text(                           //CON LO SIGUIENTE PONGO LA DESCRIPCION DEL PRODUCTO
                    // Y A ESTA LE DOY UN TAMAÑO, UNA FUENTE Y UN RELLENO
                    //PARA QUE EL TEXTO ESTE LO MAS IGUALADO POSIBLE CON LA IMAGEN
                    text = "Zapato tipo botín. Fabricado en piel acabado serraje. Detalle lateral e interior de borreguillo. Horma redonda. Cerco alrededor del corte. Tirador trasero. Piso con volumen y suela dentada.",
                    fontSize = 12.sp,
                    fontFamily = FontFamily.Serif,
                    modifier = Modifier.padding(15.dp, 15.dp))
            }
            Row (               //CON ESTO MODIFICO EL TITULO DEL PRODUCTO
                modifier = Modifier
                    .padding()
                    .fillMaxSize()
                    .fillMaxWidth()
                    .background(color = Color.Black),
                horizontalArrangement = Arrangement.Center ){
                Text(//AQUI LE DOY UNA FUENTE Y UN ESTILO AL TITULO
                    text = "CAZADORA DOBLE FAZ",
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.Black,
                    color = Color.White)
            }

            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .padding()
                    .fillMaxSize()
                    .fillMaxWidth()
                    .background(color = Color.White)){
                Image(painter = painterResource(id = R.drawable.cazadora), contentDescription = null,
                    Modifier.size(130.dp))      //AQUI LE DOY TAMAÑO A LA IMAGEN, ESTE ES EL MISMO EN TODAS PARA QUE OCUPEN LO MISMO TODAS
                Text(                           //CON LO SIGUIENTE PONGO LA DESCRIPCION DEL PRODUCTO
                    // Y A ESTA LE DOY UN TAMAÑO, UNA FUENTE Y UN RELLENO
                    //PARA QUE EL TEXTO ESTE LO MAS IGUALADO POSIBLE CON LA IMAGEN
                    text = "Cazadora confeccionada en tejido con el interior acabado en borreguillo. Cuello solapa con detalle de trabilla. Manga larga. Bolsillos frontales con cierre de cremallera. Cierre frontal asimétrico con cremallera.",
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
                    .background(color = Color.Black),
                horizontalArrangement = Arrangement.Center ){
                Text(//AQUI LE DOY UNA FUENTE Y UN ESTILO AL TITULO
                    text = "JEANS CARGO FLARED FIT",
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.Black,
                    color = Color.White)

            }

            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .padding()
                    .fillMaxSize()
                    .fillMaxWidth()
                    .background(color = Color.White)
            ) {
                Image(painter = painterResource(id = R.drawable.pantalones), contentDescription = null,
                    modifier = Modifier.size(130.dp))      //AQUI LE DOY TAMAÑO A LA IMAGEN, ESTE ES EL MISMO EN TODAS PARA QUE OCUPEN LO MISMO TODAS
                Text(                           //CON LO SIGUIENTE PONGO LA DESCRIPCION DEL PRODUCTO
                    // Y A ESTA LE DOY UN TAMAÑO, UNA FUENTE Y UN RELLENO
                    //PARA QUE EL TEXTO ESTE LO MAS IGUALADO POSIBLE CON LA IMAGEN
                    text = "Jeans flared fit. Bolsillos de plastrón con solapa en cadera. Aplicación de bolsillos plastrón en perneras. Efecto lavado. Bajo ajustable con cremalleras. Cierre frontal con cremallera y botón cruzado.",
                    fontSize = 12.sp,
                    fontFamily = FontFamily.Serif,
                    modifier = Modifier.padding(15.dp,15.dp))
            }
        }
    }
}



