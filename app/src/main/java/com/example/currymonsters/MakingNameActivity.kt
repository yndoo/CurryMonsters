package com.example.currymonsters

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MakingNameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_making_name)
        val inputText: TextInputEditText = findViewById(R.id.testnameinput)
        //val inputText = findViewById<TextInputEditText>(R.id.testnameinput)
        val btn :Button = findViewById(R.id.btn_createtest)

        btn.setOnClickListener {
            if (inputText.text.toString().length!=0){ //공백이 아닐 때만
                val retrofit = Retrofit.Builder()
                    .baseUrl("https://jsonplaceholder.typicode.com/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()

                val myserver: ApiService = retrofit.create(ApiService::class.java)

                myserver.postTest("users").enqueue(object : Callback<TestInfo>{
                    override fun onFailure(call: Call<TestInfo>?, t: Throwable?) {
                        Log.e("retrofit T.T", t.toString())
                    }

                    override fun onResponse(call: Call<TestInfo>?, response: Response<TestInfo>?) {
                        Log.d("retrofit~!", response?.body().toString())
                        //name=11이라는 답변이 온다... 왜일까? 이게뭘까?
                    }
                })
            }
        }

    }
}