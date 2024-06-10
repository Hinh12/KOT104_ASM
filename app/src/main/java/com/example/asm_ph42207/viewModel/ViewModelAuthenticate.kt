package com.example.asm_ph42207.viewModel

import android.util.Log
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.asm_ph42207.API_Service.RetrofitInstance
import com.example.asm_ph42207.request.LoginRequest
import com.example.asm_ph42207.request.RegisterRequest
import com.example.asm_ph42207.response.Response
import kotlinx.coroutines.launch

class ViewModelAuthenticate:ViewModel() {

    private val _register = mutableStateOf<Response?>(null)
    val register: State<Response?> = _register

    fun registerViewModel(registerReq: RegisterRequest) {
        viewModelScope.launch {
            try {
                _register.value = RetrofitInstance.apiService.register(registerReq)
                Log.d("TAG", "Thành công: ${_register.value}")
            } catch (e: Exception) {
                Log.d("TAG", "Thất bại: ${e.message}")
            }
        }
    }

    private val _login = mutableStateOf<Response?>(null)
    val login: State<Response?> = _login

    fun loginViewModel(loginReq: LoginRequest) {
        viewModelScope.launch {
            try {
                _login.value = RetrofitInstance.apiService.login(loginReq)
                Log.d("TAG", "Thành công: ${_login.value}")
            } catch (e: Exception) {
                Log.d("TAG", "Thất bại: ${e.message}")
            }
        }
    }
}