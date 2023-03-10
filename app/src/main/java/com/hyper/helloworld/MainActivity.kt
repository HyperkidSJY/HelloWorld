package com.hyper.helloworld

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.helloBtn)
        button.setOnClickListener{
            Log.v("hello world","button clicked")
            Toast.makeText(this,"hello to you too!", Toast.LENGTH_SHORT).show()
            val textView = findViewById<TextView>(R.id.introTextView)
            textView.setTextColor(Color.parseColor("#FF0000"))
        }

    }
}