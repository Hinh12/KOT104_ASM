package com.example.asm_ph42207.API_Service


object RetrofitInstance {
    //private const val BASE_URL = "http://10.24.47.215:3000/api/"
    //private const val BASE_URL = "http://10.0.2.2:3000/api/"
    private const val BASE_URL = "http://192.168.1.13:3000/api/"

    val apiService: ApiService by lazy {
        retrofit2.Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(retrofit2.converter.gson.GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)
    }
}


