package com.example.currymonsters

import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface ApiService {
    @POST("users")
    fun postTest(
        @Field("users") users: String
    ): Call<TestInfo>
}