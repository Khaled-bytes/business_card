package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BusinessCard(

                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun BusinessCard( modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.android_logo)


    Column(
            modifier = modifier
                .fillMaxSize()
                .background(Color(0xFFD2E8D4))
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally

        ) {

        Column(
            modifier = Modifier
                .size(120.dp)
                .background(Color(0xFF073042)),
            horizontalAlignment = Alignment.CenterHorizontally
        )  {
            Image(

                painter = image,
                contentDescription = null,
                contentScale = ContentScale.Fit


            )

        }

        Spacer(modifier = Modifier.height(10.dp))


        Text(
            text = "Jennifer Doe",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )

        Text(
            text = "Android Developer Extraordinaire",
            fontSize = 18.sp,
            color = Color(0xFF3DDC84)
        )

        Spacer(modifier = Modifier.height(200.dp))


        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(imageVector = Icons.Filled.Phone, contentDescription = null ,tint=Color(0xFF3DDC84))
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "+11 (123) 444 555 666")
        }

        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(imageVector = Icons.Filled.Share, contentDescription = null ,tint=Color(0xFF3DDC84))
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "@AndroidDev")
        }

        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(imageVector = Icons.Filled.Email, contentDescription = null, tint=Color(0xFF3DDC84))
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "jen.doe@android.com")

        }





    }





}