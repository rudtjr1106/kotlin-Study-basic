package com.example.kotlinstudy

fun main() {
    // 변수
    // val = value (값)
    // var = variable (변경가능한) 이라는 뜻
    val a : Int = 3
    var b : Int = 10
    //a = 20  val 은 변경 불가능
    b = 20 // var 은 변경 가능

    //kotlin 은 type 추론이 가능하기 때문에 따로 캐스팅을 안해도 된다.
    val name = "조경석" //이렇게 사용한다면 name 은 알아서 String 형식으로 캐스팅 된다.
}