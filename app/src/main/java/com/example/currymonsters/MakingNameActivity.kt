package com.example.currymonsters

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class MakingNameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_making_name)
        val inputText: TextInputEditText = findViewById(R.id.testnameinput)
        //val inputText = findViewById<TextInputEditText>(R.id.testnameinput)


    }
}