package com.example.coverallsample

import Model
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val model = Model()
        val tv = findViewById<TextView>(R.id.tv_hello)
        tv.text = model.data
    }

}