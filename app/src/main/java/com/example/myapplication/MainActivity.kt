package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var dImage:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollB: Button = findViewById(R.id.roll_me)
        dImage = findViewById(R.id.diceO)
        rollB.setOnClickListener{
            roll()
        }
    }

    private fun roll() {
        val randInt  = java.util.Random().nextInt(6)+1
        val dResource = when (randInt){
            1 ->R.drawable.dice_1;
            2 ->R.drawable.dice_2
            3 ->R.drawable.dice_3
            4 ->R.drawable.dice_4
            5 ->R.drawable.dice_5
            else ->R.drawable.dice_6

        }

//        val dImage: ImageView = findViewById(R.id.diceO)
        dImage.setImageResource(dResource)

    }
}