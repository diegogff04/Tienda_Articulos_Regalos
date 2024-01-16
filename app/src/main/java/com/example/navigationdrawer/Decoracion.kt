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
fun decoracion() {
    LazyColumn() {
        item {
            Row (
                modifier = Modifier
                    .padding()
                    .fillMaxSize()
                    .fillMaxWidth()
                    .background(color = colorResource(id = R.color.verdecito)),
                horizontalArrangement = Arrangement.Center)                  //CON ESTO MODIFICO EL TITULO PARA QUE ESTE EN EL CENTRO
            {
                Text(       //AQUI LE ESTOY DANDO UNA FUENTE, UN TAMAÑO Y UN ESTILO AL TITULO
                    text = "DECORACION",  //AQUI LE ESTOY DANDO ESTILOS AL TITULO
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
                Text(text = "FEJKA",
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
                    .background(color = colorResource(id = R.color.verdecito))
            ){
                Image(painter = painterResource(id = R.drawable.planta), contentDescription = null,
                    Modifier.size(130.dp))      //AQUI LE DOY TAMAÑO A LA IMAGEN, ESTE ES EL MISMO EN TODAS PARA QUE OCUPEN LO MISMO TODAS
                Text(                           //CON LO SIGUIENTE PONGO LA DESCRIPCION DEL PRODUCTO
                    // Y A ESTA LE DOY UN TAMAÑO, UNA FUENTE Y UN RELLENO
                    //PARA QUE EL TEXTO ESTE LO MAS IGUALADO POSIBLE CON LA IMAGEN
                    text = "Las plantas artificiales FEJKA no necesitan que tengas mano para la jardinería. Son perfectas si no tienes tiempo de regar plantas y quitarles las hojas muertas. Como parecen tan reales, sorprenderás a todas tus visitas sin mover un dedo.",
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
                Text(text = "OLIVBLAD",
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
                    .background(
                        color = colorResource(id = R.color.verdecito)

                    )){
                Image(painter = painterResource(id = R.drawable.sujetaplanta), contentDescription = null,
                    Modifier.size(130.dp))      //AQUI LE DOY TAMAÑO A LA IMAGEN, ESTE ES EL MISMO EN TODAS PARA QUE OCUPEN LO MISMO TODAS
                Text(                           //CON LO SIGUIENTE PONGO LA DESCRIPCION DEL PRODUCTO
                    // Y A ESTA LE DOY UN TAMAÑO, UNA FUENTE Y UN RELLENO
                    //PARA QUE EL TEXTO ESTE LO MAS IGUALADO POSIBLE CON LA IMAGEN
                    text = "Lleva tus plantas a nuevas cotas con este soporte para macetas de varios niveles. Ideal para mostrar las plantas y dar un toque de dinamismo al espacio. Puedes ponerlo en el balcón o el patio, pero también en el salón.",
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
                Text(text = "SJÄLSLIGT",
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
                    .background(color = colorResource(id = R.color.verdecito))){
                Image(painter = painterResource(id = R.drawable.planta_sobremesa), contentDescription = null,
                    Modifier.size(130.dp))      //AQUI LE DOY TAMAÑO A LA IMAGEN, ESTE ES EL MISMO EN TODAS PARA QUE OCUPEN LO MISMO TODAS
                Text(                           //CON LO SIGUIENTE PONGO LA DESCRIPCION DEL PRODUCTO
                    // Y A ESTA LE DOY UN TAMAÑO, UNA FUENTE Y UN RELLENO
                    //PARA QUE EL TEXTO ESTE LO MAS IGUALADO POSIBLE CON LA IMAGEN
                    text = "Decora tu hogar con plantas verdes sin tener que regar porque los cactus son de cerámica.",
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
                    text = "KUPONG",
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
                    .background(color = colorResource(id = R.color.verdecito))){
                Image(painter = painterResource(id = R.drawable.reloj), contentDescription = null,
                    Modifier.size(130.dp))      //AQUI LE DOY TAMAÑO A LA IMAGEN, ESTE ES EL MISMO EN TODAS PARA QUE OCUPEN LO MISMO TODAS
                Text(                           //CON LO SIGUIENTE PONGO LA DESCRIPCION DEL PRODUCTO
                    // Y A ESTA LE DOY UN TAMAÑO, UNA FUENTE Y UN RELLENO
                    //PARA QUE EL TEXTO ESTE LO MAS IGUALADO POSIBLE CON LA IMAGEN
                    text = "El diseño es sencillo y discreto y el color verde grisáceo, muy elegante. Como el volumen sube en cuatro pasos a lo largo de 2 minutos si no te despiertas y lo apagas, es ideal para los más dormilones.",
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
                    text = "FRIDFULL",
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
                    .background(color = colorResource(id = R.color.verdecito))
            ) {
                Image(painter = painterResource(id = R.drawable.maceta), contentDescription = null,
                    modifier = Modifier.size(130.dp))      //AQUI LE DOY TAMAÑO A LA IMAGEN, ESTE ES EL MISMO EN TODAS PARA QUE OCUPEN LO MISMO TODAS
                Text(                           //CON LO SIGUIENTE PONGO LA DESCRIPCION DEL PRODUCTO
                    // Y A ESTA LE DOY UN TAMAÑO, UNA FUENTE Y UN RELLENO
                    //PARA QUE EL TEXTO ESTE LO MAS IGUALADO POSIBLE CON LA IMAGEN
                    text = "Decora tu hogar con bellos accesorios naturales. Este macetero está hecho a mano con jacinto de agua recolectado de los canales tropicales, lo cual ayuda a su conservación y garantiza que el agua fluya sin problemas.",
                    fontSize = 12.sp,
                    fontFamily = FontFamily.Serif,
                    modifier = Modifier.padding(15.dp,15.dp))
            }
        }
    }
}



