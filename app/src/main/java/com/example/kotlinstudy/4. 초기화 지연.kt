package com.example.kotlinstudy


// 4. 초기화 지연
// 정의 : 변수를 선언할 때 값을 지정하지 않고, 나중에 지정할 수 있는 방법
// 목적 : 메모리를 효율적으로 사용하기 위해서, null safe한 value를 사용하기 위해서

lateinit var text : String // 반드시 타입을 지정하거나, 값을 지정해줘야 함 또한 primitive 타입은 안됨
                           // ex) Int 안되고 Integer 가능
val test : Int by lazy {
    println("초기화 완료")
    100
} // 람다식 이므로 마지막 줄이 리턴값이다.

// 추가 내용 lateinit 과 by lazy의 차이점은 무엇인가?
// 둘 다 늦은 초기화를 사용하지만 lateinit은 var을, by lazy는 val을 사용해야 한다.

fun main(){
    text = "아무거나"

    println(text)

    println("메인 함수 실행")
    println("첫 번째 실행 : $test")
    println("두 번째 실행 : $test") // 초기화는 호출하는 시점에 1번만 진행 즉, 첫 번째 실행에서만 test값이 초기화 된다.
}