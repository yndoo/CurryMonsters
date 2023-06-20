package com.example.currymonsters

import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface ApiService {
    @FormUrlEncoded
    @POST("users")
    fun postTest(
        @Field("users") users: String
    ): Call<TestInfo>
}