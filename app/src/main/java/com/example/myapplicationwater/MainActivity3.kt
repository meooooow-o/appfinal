package com.example.myapplicationwater

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        findViewById<Button>(R.id.btn_back1).setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivityForResult(intent, 11)
        }

        val ed_name = findViewById<EditText>(R.id.ed_name)
        val ed_height = findViewById<EditText>(R.id.ed_height)
        val ed_weight = findViewById<EditText>(R.id.ed_weight)
        val btn_enter = findViewById<Button>(R.id.btn_enter)
        var tv_amount = findViewById<TextView>(R.id.tv_amount)
        btn_enter.setOnClickListener {
            var waterAmount = ed_weight.text.toString().toInt() * 30
            ed_name.text = null
            ed_height.text = null
            ed_weight.text = null
            tv_amount.text = waterAmount.toString() + " ml / 天"
        }
    }
}