package com.example.figna

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        val input_text = findViewById<EditText>(R.id.edit1)
        val output_text = findViewById<TextView>(R.id.text2)
        when(input_text.text){
            "L", "M", "K", "D" -> "Это согласные буквы"
            "A".."Z" -> "Возможно, это гласные буквы"
            else -> "Введён не символ,"
        }
    }
}