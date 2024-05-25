package com.example.asm_ph42207.screen

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddShoppingCart
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.outlined.Bookmark
import androidx.compose.material.icons.outlined.BookmarkBorder
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.asm_ph42207.R
import com.example.asm_ph42207.Screens

//class BottomNavigation : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//    }
//}

@Composable
fun BottomNavigation(navControl: NavHostController){
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        MyBottomAppBar(navControl)
    }
}

@Composable
fun MyBottomAppBar(navControl: NavHostController) {
    val context = LocalContext.current.applicationContext
    val navigationController = rememberNavController()
    val selected = remember {
        mutableStateOf(Icons.Default.Home)
    }

    Scaffold (
        bottomBar = {
            BottomAppBar(
                modifier = Modifier.shadow(8.dp, shape = RoundedCornerShape(10.dp)),
                containerColor = Color(0xFFFFFFFF)
            ) {
                IconButton(
                    onClick = {
                        selected.value = Icons.Default.Home
                        navigationController.navigate(Screens.Home.screens){
                            popUpTo(0)

                        }
                    },
                    modifier = Modifier.weight(1f)
                )
                {
                    Icon( if (selected.value == Icons.Default.Home)  Icons.Default.Home  else  Icons.Outlined.Home,
                        contentDescription = "",
                        modifier = Modifier.size(24.dp),
                    )

                }

                IconButton(
                    onClick = {
                        selected.value = Icons.Default.Bookmark
                        navigationController.navigate(Screens.Favorite.screens){
                            popUpTo(0)
                        }
                    },
                    modifier = Modifier.weight(1f)
                )
                {
                    Icon(if (selected.value == Icons.Default.Bookmark) Icons.Default.Bookmark else Icons.Outlined.BookmarkBorder,
                        contentDescription = "",
                        modifier = Modifier.size(24.dp),
                    )

                }




                IconButton(
                    onClick = {
                        selected.value = Icons.Default.Notifications
                        navigationController.navigate(Screens.Thongbaott.screens){
                            popUpTo(0)
                        }
                    },
                    modifier = Modifier.weight(1f)
                )
                {
                    Icon(if (selected.value == Icons.Default.Notifications) Icons.Default.Notifications else Icons.Outlined.Notifications,
                        contentDescription = "",
                        modifier = Modifier.size(24.dp),
                    )

                }



                IconButton(
                    onClick = {
                        selected.value = Icons.Default.Person
                        navigationController.navigate(Screens.Profile.screens){
                            popUpTo(0)
                        }
                    },
                    modifier = Modifier.weight(1f)
                )
                {
                    Icon(if (selected.value == Icons.Default.Person) Icons.Default.Person else Icons.Outlined.Person,
                        contentDescription = "",
                        modifier = Modifier.size(24.dp),
                    )

                }







            }
        }
    )
    {paddingValues ->
        NavHost(navController = navigationController,
            startDestination = Screens.Home.screens,
            modifier = Modifier.padding(paddingValues)
        ) {
            composable(Screens.Home.screens){ Home(navControl)}
            composable(Screens.Notification.screens){ Notification() }
            composable(Screens.Profile.screens){ Profile() }
            composable(Screens.Cart.screens){ Cart() }
            composable(Screens.ProductDetail.screens){ ProductDetail() }
            composable(Screens.Thongbaott.screens){ Thongbaott() }
            composable(Screens.CheckOut.screens){ CheckOut() }
            composable(Screens.Favorite.screens){ Favorite() }



        }

    }

}