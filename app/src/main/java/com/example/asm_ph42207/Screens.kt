package com.example.asm_ph42207

sealed class Screens(val screens: String) {
    data object Home : Screens("home")
    data object BookMark : Screens("bookmark")
    data object Notification : Screens("notification")
    data object Profile : Screens("profile")
    data object Thongbaott : Screens("thongbaott")
    data object MyBottombar : Screens("MyBottombar")
    data object Favorite : Screens("favorite")
    data object Cart : Screens("cart")
    data object Login : Screens("login")
    data object SignUp : Screens("sign")
    data object CheckOut : Screens("thanhtoan")
    data object ProductDetail : Screens("productDetail")
}