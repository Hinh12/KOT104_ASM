package com.example.asm_ph42207.compose


import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
//
//class LoginViewModel : ViewModel() {
//    private val _loginState = MutableStateFlow<LoginState>(LoginState.Idle)
//    val loginState: StateFlow<LoginState> = _loginState
//
//    fun login(email: String, password: String) {
//        viewModelScope.launch {
//            _loginState.value = LoginState.Loading
//            try {
//                val response = RetrofitInstance.api.login(LoginRequest(email, password))
//                if (response.isSuccessful && response.body()?.success == true) {
//                    val loginResponse = response.body()
//                    _loginState.value = LoginState.Success(loginResponse?.token, loginResponse?.user)
//                } else {
//                    _loginState.value = LoginState.Error("Login failed")
//                }
//            } catch (e: Exception) {
//                _loginState.value = LoginState.Error("Network error")
//            }
//        }
//    }
//}
//
//sealed class LoginState {
//    object Idle : LoginState()
//    object Loading : LoginState()
//    data class Success(val token: String?, val user: User?) : LoginState()
//    data class Error(val message: String) : LoginState()
//}