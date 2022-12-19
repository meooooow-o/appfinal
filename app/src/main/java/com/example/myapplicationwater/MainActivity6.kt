package com.example.myapplicationwater

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)

        findViewById<Button>(R.id.btn_back4).setOnClickListener{
            val intent = Intent(this, MainActivity2::class.java)
            startActivityForResult(intent, 14)
        }

    }
}