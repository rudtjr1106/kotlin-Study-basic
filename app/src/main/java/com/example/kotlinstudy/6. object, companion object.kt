package com.example.kotlinstudy

// object, companion object
// object
// 정의 : 클래스를 정의함과 동시에 객체를 생성
// 특징 - 싱글톤을 쉽게 만들 수 있는 키워드
//     - 생성자 사용 부락
//     - 프로퍼티, 메서드, 초기화 블록은 사용 가능
//     - 다른 클래스나 인터페이스 상속받을 수 있음
//
// companion object
// java의 static과 동일한 역할
// 클래스 내에 하나만 생성할 수 있

fun main(){

    Counter.countUp() // 여기서 단 한 번만 생성이 된다 (싱글톤)
    println(Counter.counter)
}

object Counter {
    init {
        println("카운터 초기화")
    }
    var counter = 0
    fun countUp(){
        counter++
    }
}

class Book() {
    companion object{
        const val NAME = "네임" // 자바에서 static 역할
    }
}