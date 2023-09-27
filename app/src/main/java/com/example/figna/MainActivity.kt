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
        if (input_text.text.toString().length > 1){
            input_text.setText("Введён не символ")
        }
        else when(input_text.text.toString()[0]){
            'L', 'M', 'K', 'D' -> input_text.setText("Это согласные буквы")
            in 'A'..'Z' -> input_text.setText("Возможно, это гласные буквы")
            else -> input_text.setText("Введён не символ")
        }
    }
}