package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var btnRoll: Button
    private lateinit var dice_image: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnRoll = findViewById(R.id.btnRoll)
        dice_image = findViewById(R.id.dice_image)
//        tvNumber = findViewById(R.id.tvNumber)

        btnRoll.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val randomInt = java.util.Random().nextInt(6) + 1
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
//        tvNumber.text = randomInt.toString()
        dice_image.setImageResource(drawableResource)
    }
}