package com.example.kotlinstudy

fun main(){
    // for 문 기본적인 예시
    for(i in 1..10){ // 여기서 1..10은 IntRange 이다. 즉 아래와 같이 변경 가능
        print(i)
        print(", ")
    }

    for(i in IntRange(1, 10)){
        print(i)
        print(", ")
    }

    for(i in 1 until 10){ // 여기서 until 은 미만. 즉, 10을 포함하지 않음 1부터 9까지
        print(i)
        print(", ")
    }

    for(i in 1..10 step(2)){ // 1부터 2씩 커짐 1, 3, 5, 7, 9
        print(i)
        print(", ")
    }

    for(i in 10 downTo 1){ // downTo 는 내려가는거 10부터 1까지 감소
        print(i)
        print(", ")
    }

    for(i in 10 downTo 1 step(2)){ // downTo 는 내려가는거 10부터 1까지 감소하나, 2씩 감소 10, 8, 6
        print(i)
        print(", ")
    }


    //while 은 자바와 똑같음
    var c = 1
    while (c < 11){
        print(c)
        print(", ")
        c++
    }

    //for 문은 리스트같은 컬렉션을 이터레이팅하는 경우 사용한다 그러나
    //코틀린에서는 컬렉션에서 이터레이팅하는 확장함수가 많기 때문에 for 문을 사용하는 경우는 적음

}