package com.example.currymonsters

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("name")
    fun getTest(
        @Query("name") name: String
    ): Call<TestInfo>
}