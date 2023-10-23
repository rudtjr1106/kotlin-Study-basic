package com.example.kotlinstudy

fun main(){
    // 1. 람다는 익명함수이다.
    // 2. 람다는 하나의 변수처럼 사용된다.
    // 3. 익명함수 즉 람다는 한 번 사용되고 재사용되지 않는 함수

    val a = fun(){ println("헬로") }
    val b : (Int) -> Int = { it * 10 }
    val d = { i : Int, j : Int -> i * j }
    val f : (Int, String, Boolean) -> String = {_, b, _ -> b} // 만약 안 쓰는 변수같은 경우에는 _ 를 사용하여 생략이 가능함.

    println( b(10) )
    println( d(10, 6) )
}

// 아래와 같이 람다식으로 함수의 argument 와 return 값이 될 수 있다.
fun test(a : Int, b : (Int) -> Int){
    println(a)
    println(b(10))
}