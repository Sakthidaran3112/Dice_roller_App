package com.example.dice_roller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*
import kotlin.collections.RandomAccess
import kotlin.random.nextInt
import kotlin.random.Random as Random

class MainActivity : AppCompatActivity() {
    lateinit var diceimage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollbutton: Button = findViewById(R.id.roll_buttton)
        rollbutton.setOnClickListener {
            rollDice()

        }
        diceimage = findViewById(R.id.Dice_image)
    }

    private fun rollDice() {
        val randomInt = java.util.Random().nextInt(6)+1
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceimage.setImageResource(drawableResource)
    }
}