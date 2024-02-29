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
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
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

    Column (
            modifier = Modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
    ){

        Column (
            modifier = Modifier
                .background(Color(0xffeb1450))
                .fillMaxWidth()
                .height(220.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ){

            Card (
                shape = CircleShape,
                modifier = Modifier
                    .width(80.dp)
                    .height(80.dp)
                    .offset(y = -16.dp)
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
                fontSize = 28.sp,
                modifier = Modifier
                    .offset(y= -32.dp)
            )

        }

        Card (
                elevation = CardDefaults.cardElevation(
                defaultElevation = 2.dp
            ),
            modifier = Modifier
                .size(width = 300.dp, height = 400.dp)
                .padding(bottom = 18.dp)
                .offset(y = -32.dp),
            colors = CardDefaults.cardColors(
                Color(0xfff7f3f2)
            )

        ) {

            Column (
                modifier = Modifier
                    .padding(horizontal = 32.dp, vertical = 12.dp)
                    .fillMaxHeight(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceEvenly

            ) {

                Text(
                    text = "Seus dados",
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xffed145b)
                )

                Column {
                    Text(
                        text = "Seu peso:",
                        color = Color(0xffed145b),
                        modifier = Modifier
                            .padding(bottom = 8.dp)
                    )
                    OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        placeholder = {
                            Text(
                                text = "Seu peso em kg",
                                fontSize = 14.sp
                            )
                        },
                        colors = OutlinedTextFieldDefaults
                            .colors(
                                focusedBorderColor = Color(0xffed145b),
                                unfocusedBorderColor = Color(0xffed145b)
                            ),
                        shape = RoundedCornerShape(12.dp),
                        modifier = Modifier
                            .height(50.dp)
                    )
                }

                Column {
                    Text(
                        text = "Sua altura:",
                        color = Color(0xffed145b),
                        modifier = Modifier
                            .padding(bottom = 8.dp)
                    )
                    OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        placeholder = {
                            Text(
                                text = "Sua altura em cm",
                                fontSize = 14.sp
                            )
                        },
                        colors = OutlinedTextFieldDefaults
                            .colors(
                                focusedBorderColor = Color(0xffed145b),
                                unfocusedBorderColor = Color(0xffed145b)
                            ),
                        shape = RoundedCornerShape(12.dp),
                        modifier = Modifier
                            .height(50.dp)
                    )
                }

                Button(
                    onClick = {},
                    shape = RoundedCornerShape(12.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp),
                    colors = ButtonDefaults
                        .buttonColors(
                            containerColor = Color(0xffed145b)
                    ),
                ) {
                    Text(
                        text = "CALCULAR",
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp
                    )
                }

            }

        }

        Card (
            elevation = CardDefaults.cardElevation(
                defaultElevation = 2.dp
            ),
            colors = CardDefaults.cardColors(
                Color(0xff2c9660)
            ),
            modifier = Modifier
                .size(width = 300.dp, height = 120.dp)
                .offset(y = -28.dp),
            shape = RoundedCornerShape(12.dp),
            border = BorderStroke(1.dp, Color(0xffed145b))
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
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Medium
                    )

                }

                Text(
                    text = "21.3",
                    color = Color.White,
                    fontSize = 40.sp,
                    fontWeight = FontWeight.Bold
                )

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