package com.example.asm_ph42207.viewModel

import android.util.Log
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.asm_ph42207.API_Service.RetrofitInstance
import com.example.asm_ph42207.response.ProductResponse
import kotlinx.coroutines.launch

class ViewModelProduct: ViewModel() {

    private val _listProduct = mutableStateOf<List<ProductResponse>>(emptyList())
    val listProduct: State<List<ProductResponse>> = _listProduct

    fun listProductViewModel(cateID: String?) {
        viewModelScope.launch {
            try {
                _listProduct.value = RetrofitInstance.apiService.getProducts(cateID)
                Log.d("TAG", "Thành công: ${_listProduct.value}")
            } catch (e: Exception) {
                Log.d("TAG", "Thất bại: ${e.message}")
            }
        }
    }

    private val _detailProduct = mutableStateOf<ProductResponse?>(null)
    val detailProduct: State<ProductResponse?> = _detailProduct

    fun detailProductViewModel(productId: String?) {
        viewModelScope.launch {
            try {
                _detailProduct.value = RetrofitInstance.apiService.getProductByID(productId)
                Log.d("TAG", "Thành công: ${_detailProduct.value}")
            } catch (e: Exception) {
                Log.d("TAG", "Thất bại: ${e.message}")
            }
        }
    }
}