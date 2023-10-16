package com.example.kotlinstudy

fun main() {
    test()
    println(intReturnFun(a = 1, b = 3)) //강의에서는 result 라는 변수를 사용했지만 다음 내용에 다루기로.
    /* 함수 파라미터를 넣을 때 변수만 넣는 것이 아닌 이름까지 넣는 것을 습관으로 해볼것 */
    println(defaultIntReturnFun(1))
}

// kotlin 에서 모든 함수는 return 이 있다.
// 아래 함수에서는 아무것도 없어 보이지만 void 가 포함된 것 kotlin 에서는 Unit 으로 사용. (Unit 은 생략 가능)
// 즉 fun test() : Unit {  <-- 이렇게 쓰여진 것
fun test() {
    println("test")
}

// Int 반환형 함수
fun intReturnFun(a : Int, b : Int) : Int {
    println(a + b)
    return a+b
}

// 오버로딩이 필요없는 함수
fun defaultIntReturnFun(a : Int, b : Int = 3) : Int{
    println(a + b)
    return a+b
}

//Single Expression
//코드를 간결화 시킬 수 있는 장점 / 아래는 Int 반환형 함수 예시
fun singleExpressionIntReturnFun(a : Int, b : Int) = a+b
//똑같은 결과