package com.example.kotlinlesson01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val arrayTest = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12)
        testCycle(arrayTest)

        val car1 = Car("bmw", "auto")
        val car2 = car1.copy(name = "mers", speed = 150)

        val button = findViewById<Button>(R.id.bTest)
        button.setOnClickListener {
            findViewById<TextView>(R.id.tvTest).text = "$car1 \n $car2"
        }

    }

    data class Car(val name: String, val type: String, val speed: Int = 100)

    private fun testCycle(array: List<Int>) {
        for (i in array) {
            if (i < 6) Log.d("myLogs", "$i") else Log.d("myLogs", "$i >= 6")
        }

        for (i in array.indices) {
            when(i) {
                2 -> Log.d("myLogs", "$i")
                5 -> Log.d("myLogs", "$i")

            }
        }

        for (i in 1..3) {
            Log.d("myLogs", "$i")
        }

        repeat(3) {
            Log.d("myLogs", "Boo")
        }
    }
}