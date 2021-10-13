package com.example.quiz

import android.os.Handler

class Quiz(var questions : List<MainActivity.Questions>) {
    var question = -1
    var waiting = false
    var qc = 0
    var score = 0

//    fun checkAnswer(answer:Boolean){
//        if()
//    }
    /*
    fun score(x : Int){
        if(waiting){return}
        waiting = true
        if(x == qc){ score++ }
        Handler().postDelayed({
            nextQuestion()
        }, 1000)
    }

    fun nextQuestion(){
        question++
        if(question == 10){
            main.end()
            return
        }
        var q : Question = questions[question]
        qc = q.correct
        main.setTexts(q)
        waiting = false
    }*/
}
