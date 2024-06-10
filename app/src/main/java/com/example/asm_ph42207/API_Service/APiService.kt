package com.example.asm_ph42207.API_Service

import com.example.asm_ph42207.request.LoginRequest
import com.example.asm_ph42207.request.RegisterRequest
import com.example.asm_ph42207.response.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {
    @POST("register")
    suspend fun register(@Body registerReq: RegisterRequest): Response?

    @POST("login")
    suspend fun login(@Body loginRequest: LoginRequest): Response?



}