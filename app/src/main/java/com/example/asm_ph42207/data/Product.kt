package com.example.asm_ph42207.data

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.painter.Painter

data class Product (val id: Int, val name: String, val price: Double, val image: String, var isSelected: Boolean = false) {
}
data class Products (val id: Int, val name: String, val price: Double,@DrawableRes val image: Int, var isSelected: Boolean = false) {
}
data class ProductModel(val name: String, val image: Int, val price: Float)