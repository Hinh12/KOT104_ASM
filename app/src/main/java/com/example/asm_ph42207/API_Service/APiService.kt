package com.example.asm_ph42207.API_Service

import com.example.asm_ph42207.request.LoginRequest
import com.example.asm_ph42207.request.RegisterRequest
import com.example.asm_ph42207.response.CategoryResponse
import com.example.asm_ph42207.response.ProductResponse
import com.example.asm_ph42207.response.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {
    @POST("register")
    suspend fun register(@Body registerReq: RegisterRequest): Response?

    @POST("login")
    suspend fun login(@Body loginRequest: LoginRequest): Response?

    @GET("categories")
    suspend fun getCategories(): List<CategoryResponse>

    @GET("products")
    suspend fun getProducts(@Query("cateID") cateID: String?): List<ProductResponse>

    @GET("get-product-by-id/{productID}")
    suspend fun getProductByID(@Path("productID") productID: String?): ProductResponse?




}