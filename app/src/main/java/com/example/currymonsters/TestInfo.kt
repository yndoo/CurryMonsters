package com.example.currymonsters

data class TestInfo (
    //@SerializedName("result")
    val result: String,
    val username: String,
    val age: String
    // @SerializedName으로 일치시켜 주지않을 경우엔 클래스 변수명이 일치해야함
    // @SerializedName()로 변수명을 입치시켜주면 클래스 변수명이 달라도 알아서 매핑
)