package com.example.currymonsters

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClass {
    private val retrofit = Retrofit.Builder()
        .baseUrl("서버ip")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

        var networkService :ApiService = retrofit.create(ApiService::class.java)
}