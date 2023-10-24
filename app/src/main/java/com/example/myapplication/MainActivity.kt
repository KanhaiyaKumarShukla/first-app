package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val textview: TextView=TextView(this)
        textview.setText("Kanhaiya is a good boy. So be gentel with him")
        textview.setTextSize(30.0f)
        textview.setMaxLines(2)
        setContentView(textview)
    }
}