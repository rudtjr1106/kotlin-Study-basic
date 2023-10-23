package com.example.kotlinstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // SAM
        // Single Abstract Method -> 단일 추상 메소드
        val view = View(this)

        //자바에서 인터페이스형 인자로 받아야 하나, 코틀린에서는 람다로 받아 아래와 같이 간단하게 표현 가능하다.
        view.setOnClickListener {  }
    }
}