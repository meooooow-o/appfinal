package com.example.myapplicationwater

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        findViewById<Button>(R.id.btn_calculate).setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivityForResult(intent, 3)
        }

        findViewById<Button>(R.id.btn_remind).setOnClickListener {
            val intent = Intent(this, MainActivity6::class.java)
            startActivityForResult(intent, 4)
        }

        findViewById<Button>(R.id.btn_know).setOnClickListener {
            val intent = Intent(this, MainActivity5::class.java)
            startActivityForResult(intent, 5)
        }

    }
}