package com.example.kotlinstudy

fun main(){
    // 확장함수 Extension function
    // 기존에 정의되어 있는 클래스에 함수를 추가하는 기능
    val test = Test()
    test.hello()

    //그러면 마치 Test 클래스에 추가된 함수처럼 아래와 같이 사용가능하다
    test.hi()
}

// 만약 정해진 라이브러리에서 함수를 추가해야 한다면
// 아래와 같이 사용하면 된다. 엄청남.
fun Test.hi() = println("하이")

class Test() {
    fun hello() = println("안녕")
    fun bye() = println("잘가")
}