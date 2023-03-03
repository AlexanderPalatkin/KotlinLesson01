package com.example.kotlinlesson01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val car1 = Car("bmw", "auto")
        val car2 = car1.copy(name = "mers", speed = 150)

        val button = findViewById<Button>(R.id.bTest)
        button.setOnClickListener {
            findViewById<TextView>(R.id.tvTest).text = "$car1 \n $car2"
        }
    }

    data class Car(val name: String, val type: String, val speed: Int = 100)
}