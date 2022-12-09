package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Dice(val side: Int){
    fun roll(): Int {
        var random = (1..side).random()
        return random
    }
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById(R.id.button)
        val image: ImageView = findViewById(R.id.imageView)
        val dice1 = Dice(6)
        button.setOnClickListener{
            val imageSrc = when(dice1.roll()){
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }
            image.setImageResource(imageSrc)
        }
    }
}