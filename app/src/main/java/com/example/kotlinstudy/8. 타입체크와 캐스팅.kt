package com.example.kotlinstudy

fun main(){
    // 코틀린에서 타입체크는 다음과 같다
    // name is Type
    // 아래 함수에서 이해 가능
    println( check("하이") )
    println( check(3) )
    println( check(true) )

    cast("안녕")
    cast(10)
}

fun check( a : Any) : String{
//    return if(a is String){
//        "문자열"
//    }
//    else if(a is Int){
//        "숫자"
//    }
//    else{
//        "몰라"
//    }
    //위 코드는 when 문으로 변경하는게 가독성이 훨씬 좋다
    return when (a) {
        is String -> {
            "문자열"
        }
        is Int -> {
            "숫자"
        }
        else -> {
            "몰라"
        }
    }
}

fun cast(a : Any){
    //여기서 as는 ~로서 즉 a는 string 으로 받겠다 라는 뜻이다.
    //만약 string 이 아닐 경우를 대비하여 as 뒤에 ? 를 붙여 자동으로 실행하지 않고 null 로 넣어줌.
    // 또 자주 사용하는 것은 엘비스 오퍼레이터를 사용하는 것 이다. null 으로 출력되는게 보기 좋지 못하니 예외를 만들어 주는 것.
    val result = (a as? String) ?: "실패"
    println(result)
}

fun smartCast(a : Any){
    // 코틀린의 또 다른 장점인 스마트캐스팅은 if, when 식에서 타입을 판별하면 바로 캐스팅해줌
    when (a) {
        is String -> {
            a.length
        }
        is Int -> {
            a.dec()
        }
        else -> {
            -1
        }
    }
}