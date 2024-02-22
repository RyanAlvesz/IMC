package br.senai.sp.jandira.imc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.imc.ui.theme.IMCTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IMCTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {

    Surface (
        modifier = Modifier
            .fillMaxSize()
    ) {

        Column (
            modifier = Modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ){

            Column (

                modifier = Modifier
                    .background(Color(0xffeb1450))
                    .fillMaxWidth()
                    .height(160.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceEvenly

            ){

                Card (
                    shape = CircleShape,
                    modifier = Modifier
                        .width(80.dp)
                        .height(80.dp)
                ) {

                    Image(
                        painter = painterResource(id = R.drawable.imc),
                        contentDescription = "Balança",

                        )

                }

                Text(
                    text = "Calculadora IMC",
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 32.sp
                )

            }

            ElevatedCard (
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 2.dp
                ),
                modifier = Modifier
                    .size(width = 300.dp, height = 450.dp)
                    .padding(bottom = 18.dp),
                colors = CardDefaults.cardColors(
                    Color(0xfff7f3f2)
                )

            ) {

                Column (
                    modifier = Modifier

                ) {

                    Text(text = "Seus dados")

                    Column {
                        Text(text = "Seu peso:")
                        OutlinedTextField(
                            value = "",
                            onValueChange = {},
                            placeholder = {
                                Text(text = "Seu peso em kg")
                            }
                        )
                    }

                    Column {
                        Text(text = "Seua altura:")
                        OutlinedTextField(
                            value = "",
                            onValueChange = {},
                            placeholder = {
                                Text(text = "Sua altura em cm")
                            }
                        )
                    }

                    Button(
                        onClick = {}
                    ) {
                        Text(text = "CALCULAR")
                    }

                }

            }

            Card (
                shape = RoundedCornerShape(12.dp),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 2.dp
                ),
                colors = CardDefaults.cardColors(
                    Color(0xff2c9660)
                ),
                modifier = Modifier
                    .size(width = 300.dp, height = 100.dp)
                    .border(BorderStroke(width = 1.dp, Color(0xffe71753))),

            ) {

                Row (
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxSize()
                ) {

                    Column (
                        modifier = Modifier
                            .fillMaxHeight(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {

                        Text(
                            text = "Resultado",
                            color = Color.White,
                            modifier = Modifier
                                .padding(bottom = 6.dp)
                        )
                        Text(
                            text = "Peso Ideal",
                            color = Color.White,
                            fontSize = 24.sp
                        )

                    }

                    Text(
                        text = "21.3",
                        color = Color.White,
                        fontSize = 34.sp,
                        fontWeight = FontWeight.Bold
                    )

                }

            }


        }

    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    IMCTheme {
        Greeting()
    }
}