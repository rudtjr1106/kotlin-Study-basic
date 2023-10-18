package com.example.kotlinstudy

fun main(){
    max(a = 10, b = 5)
}

// 자바는 조건문이나, 코틀린은 조건식이다.(죽, 라턴값이 있음)
fun max(a : Int, b : Int){
//    if(a > b){
//        println(a)
//    }
//    else{
//        println(b)
//    }
//    위 코드를 코틀린 스럽게 바꾼다면 아래와 같다

    val result = if(a > b) a else b
    // 자바에는 3항 연산자가 있으나 코틀린에는 없음
    println(result)
}


// 자바에선 switch 코틀린에서는 when "식"
// 휴일을 판단하는 함수
fun isHoliday(dayOfWeek: String){
    val result = when(dayOfWeek){ // when 안에 변수값을 지정해서 또 쓸 수 있을듯 (실무에서 많이 사용)
        "토", "일" -> true         // ex) when(val day = dayOfWeek) 요런 느낌으로
        else -> false
    }
    println(result)
}