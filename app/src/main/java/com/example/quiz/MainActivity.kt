package com.example.quiz

import android.content.res.Resources
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken


class MainActivity : AppCompatActivity() {

    lateinit var leftChoice: Button
    lateinit var rightChoice: Button
    lateinit var color: Button
    lateinit var colorChoice: TextView
    lateinit var quiz: Quiz
    val TAG = "MainActivity"

    private fun wire() {
        leftChoice = findViewById(R.id.button_main_left)
        rightChoice = findViewById(R.id.button_main_right)
        color = findViewById(R.id.button_main_color)
        colorChoice = findViewById(R.id.text_main_colorChoice)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        wire()
        val inputStream = resources.openRawResource(R.raw.questions)
        val jsonText = inputStream.bufferedReader().use {
            it.readText()
        }
        Log.d(TAG, "onCreate: $jsonText")
        val gson = Gson()
        val type = object : TypeToken<List<Questions>>() {}.type
        val questions = gson.fromJson<List<Questions>>(jsonText, type)
        Log.d(TAG, "onCreate: \n${questions.toString()}")

        color.setBackgroundColor(Color.rgb(200, 200, 200))
        quiz = Quiz(questions)

        leftChoice.setOnClickListener {

        }
        rightChoice.setOnClickListener {

        }
    }
}

data class Questions(
    var question: String,
    var correctAnswer: String,
    var incorrectAnswer: String,
    var red: Int,
    var green: Int,
    var Blue: Int,
) {}




