package com.example.asm_ph42207

sealed class Screens(val screens: String) {
    data object Home : Screens("home")
    data object BookMark : Screens("bookmark")
    data object Notification : Screens("notification")
    data object Profile : Screens("profile")
    data object Thongbaott : Screens("thongbaott")
    data object MyBottomAppBar : Screens("MyBottombar")
    data object Favorite : Screens("favorite")
    data object Cart : Screens("cart")
    data object CheckOut : Screens("thanhtoan")
    data object ProductDetail : Screens("productDetail")
}