package com.example.asm_ph42207


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.asm_ph42207.screen.BottomNavigation
import com.example.asm_ph42207.screen.Cart
import com.example.asm_ph42207.screen.CheckOut
import com.example.asm_ph42207.screen.Login
import com.example.asm_ph42207.screen.ProductDetail
import com.example.asm_ph42207.screen.SignUp
import com.example.asm_ph42207.screen.SplashScreen
import com.example.asm_ph42207.screen.Thongbaott
import com.example.asm_ph42207.ui.theme.ASM_PH42207Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ASM_PH42207Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navControl = rememberNavController()

                    NavHost(
                        navController = navControl,
                        startDestination = "splash"
                    ) {
                        composable("splash") {
                            SplashScreen(navControl)
                        }
                        composable("login") {
                            Login(navControl)
                        }
                        composable("sign") {
                            SignUp(navControl)
                        }
                        composable("cart") {
                            Cart(navControl)
                        }
                        composable("thanhtoan") {
                            CheckOut(navControl)
                        }
                        composable("thongbaott") {
                            Thongbaott(navControl)
                        }

                        composable("home") {
                            BottomNavigation(navControl)
                        }
                        composable(Screens.ProductDetail.screens) {
                            ProductDetail(navControl)
                        }



                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ASM_PH42207Theme {
        Greeting("Android")
    }
}