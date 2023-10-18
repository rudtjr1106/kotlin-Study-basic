package com.example.kotlinstudy

fun main(){
    //list
    //코틀린과 자바에서 List 의 가장 큰 차이점은 mutable 과 inMutable 이다.
    //컬렉션 안에 확장함수를 반드시 학습해야함. 현업에서 정말 많이 쓰임
    val mutableList = mutableListOf(1, 2, 3, 4)
    mutableList.add(5)
    mutableList.addAll(listOf(6,7,8,9)) // 이처럼 mutable 은 변경 가능함

    val inMutableList = listOf(1, 2, 3, 4)
//  inMutableList.add(5) 이렇게 사용 불가능 -> mutable 이 아니기 때문

    //코틀린에서는 list 내부의 값을 다양하게 넣을 수 있다는 장점이 있음 아래는 예시
    val diverseList = listOf(1, "하이", 1.56, true)

    println(mutableList.joinToString(",")) // joinToString 이 리스트의 값을 출력해주는지 이제 알았다.
                                                    // 추가로 joinToString 에서 separator 값으로 구분자를 넣을 수 있음.

    //map
    val map = mapOf((1 to "안녕"), (2 to "hello"))
//  map.put    역시 mutable 이 아니기 떄문에 사용 불가능

    val mutableMap = mutableMapOf((1 to "안녕"), (2 to "hello"))
    mutableMap[3] = "응" // == mutableMap.put(3, "응")

}