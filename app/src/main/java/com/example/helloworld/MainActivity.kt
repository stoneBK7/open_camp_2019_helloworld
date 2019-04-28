package com.example.helloworld

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 「Hello World」を「こんにちは世界」に変更する
        val textView = findViewById<TextView>(R.id.text_view)
        textView.text = "こんにちは世界"
    }
}
