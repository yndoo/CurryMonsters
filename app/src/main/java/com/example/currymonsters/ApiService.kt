package com.example.currymonsters

import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface ApiService {
    @FormUrlEncoded
    @POST("testapi/first")
    fun postTest(
        @Field("age") age: String,
        @Field("name") name: String
    ): Call<TestInfo>
}