package com.example.asm_ph42207.screen

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.asm_ph42207.R

//class Splash : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//    }
//}

@Composable
fun SplashScreen(navControl: NavHostController){
    Box(modifier = Modifier.fillMaxSize()) {

        Image(painter = painterResource(id = R.drawable.nen_splash), contentDescription ="nen" ,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.FillBounds)
        Column(modifier = Modifier
            .padding(bottom = 60.dp)
            .align(Alignment.Center)
            .padding(start = 30.dp)) {
            Text(
                text = "MAKE YOUR",
                fontSize = 27.sp,
                fontFamily = FontFamily.Serif,
                color = Color(0xFF606060),
                modifier = Modifier.align(Alignment.Start)
            )
            Text(
                text = "HOME BEAUTIFUL",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Serif,
                color = Color(0xFF303030),
                modifier = Modifier.align(Alignment.Start).padding(top = 10.dp)

            )

            Text(
                modifier = Modifier
                    .padding(start = 20.dp,end = 27.dp, top = 30.dp)
                    .align(Alignment.Start),
                fontFamily = FontFamily.Serif,
                style = TextStyle(letterSpacing = 0.2 .em, lineHeight = 24.sp),

                text = "The best simple place where you discover most wonderful furnitures and make your home beautiful",
                color = Color(0xFF808080),


                )
        }
        Button(

            onClick = {navControl.navigate("login")  },

            modifier = Modifier.align(Alignment.BottomCenter).padding(bottom = 150.dp),
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.White,
                containerColor = Color(0xFF242424)
            ),
            shape = RoundedCornerShape(8.dp)
        ) {
            Text(text = "Get Started", modifier = Modifier.padding(10.dp), fontSize = 20.sp, fontFamily = FontFamily.Serif)

        }




    }
}