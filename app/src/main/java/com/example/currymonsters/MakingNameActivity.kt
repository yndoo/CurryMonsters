package com.example.currymonsters

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.currymonsters.RetrofitClass.networkService
import com.google.android.material.textfield.TextInputEditText
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MakingNameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_making_name)
        val inputText: TextInputEditText = findViewById(R.id.testnameinput)
        //val inputText = findViewById<TextInputEditText>(R.id.testnameinput)

        val callGetTestInfo = networkService.getTest(inputText.toString())

        callGetTestInfo.enqueue(object : Callback<TestInfo> {
            override fun onResponse(
                call: Call<TestInfo>,
                response: Response<TestInfo>
            ) {
                val info = response.body()

            }

            override fun onFailure(call: Call<TestInfo>, t: Throwable) {
                call.cancel()
            }
        })
    }
}