package com.example.currymonsters

import android.util.Log
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClass {
    private val retrofit = Retrofit.Builder()
        .baseUrl("서버URL")
        .addConverterFactory(GsonConverterFactory.create())
        .build()




}