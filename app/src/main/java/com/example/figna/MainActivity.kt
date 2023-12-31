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
        val output_text = findViewById<TextView>(R.id.textResult)
        button.setOnClickListener {
            if (input_text.text.toString().length > 1){
                output_text.text = "Введён не символ"
            }
            else when(input_text.text.toString()[0]){
                'L', 'M', 'K', 'D' -> output_text.text = "Это согласные буквы"
                in 'A'..'Z' -> output_text.text ="Возможно, это гласные буквы"
                else -> output_text.text = "Введён не символ"
            }
        }
    }
}