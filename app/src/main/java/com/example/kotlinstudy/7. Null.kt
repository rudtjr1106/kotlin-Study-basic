package com.example.kotlinstudy

fun main() {
    // 코틀린은 Null 이 될 수 있는 값과 없는 값을 분류해서 안정성을 가져감
    var name : String = "경석"
    var number : Int = 10

    var name1 : String? = null
    var number1 : Int? = null
    // 위처럼 타입명 뒤에 ?를 붙여준다면 Null 이 될 수 있다는 걸로 인지함
    // 또한 null 확인을 코틀린에서는 엘비스 연산자를 사용 ?:
    val result = name1?: "값이 없음" // name1 이 null 이라면 "값이 없음" 출력, 아니라면 name1 값 출력

    // 함수를 사용할때도 ? 표시로 null 임을 확인 가능함
    val size = name1?.length // ?를 붙임으로써 만약 name1이 null 이라면 size 의 값은 null 이 되며 length 가 실행되기 않음
    val size1 = name1!!.length // !! 오퍼레이터는 반드시 null 이 아니라는 뜻으로 사용 
                               // 그러나 !! 표시를 사용하기보다 아예 nullable 이 아닌 타입으로 지정하는 것을 추천
    println(result)
}