package com.example.asm_ph42207.viewModel

import android.util.Log
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.asm_ph42207.API_Service.RetrofitInstance
import com.example.asm_ph42207.response.CategoryResponse
import kotlinx.coroutines.launch

class ViewModelCategory: ViewModel() {

    private val _categories = mutableStateOf<List<CategoryResponse>>(emptyList())
    val categories: State<List<CategoryResponse>> = _categories

    fun categoryViewModel() {
        viewModelScope.launch {
            try {
                _categories.value = RetrofitInstance.apiService.getCategories()
                Log.d("TAG", "Thành công: ${_categories.value}")
            } catch (e: Exception) {
                Log.d("TAG", "Thất bại: ${e.message}")
            }
        }
    }
}