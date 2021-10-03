package com.suyash.diceroller

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView



lateinit var imageView: ImageView

lateinit var button: Button
lateinit var textView: TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button = findViewById(R.id.button)
        button.setOnClickListener {
            rollDice()

        }

    }

    fun rollDice() {
        imageView=findViewById(R.id.imageView)
        textView=findViewById(R.id.textView2)
        val res= (1..6).random()
        textView.text=res.toString()
       val draw=when(res){
           1->R.drawable.dice_1
           2->R.drawable.dice_2
           3->R.drawable.dice_3
           4->R.drawable.dice_4
           5->R.drawable.dice_5
           else->R.drawable.dice_6
       }
        imageView.setImageResource(draw)
    }
}

