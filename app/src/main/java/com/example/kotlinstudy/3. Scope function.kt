package com.example.kotlinstudy

//Scope Function은 범위 지정함수로 코틀린 표준 라이브러리에서 제공하는 확장함수이다.
//목적 : 간결성, 명료성, 유지보수 용이
//정의 : 객체의 컨텍스트 내에서 실행 가능한 코드 블럭을 만드는 함수
//    -> 호출 시, 임시 범위가 생성되며 이 범위 안에서는 이름 없이 객체에 접근가능
//
//수신 객체 확장함수가 호출되는 대상이 되는 값(객체)
//수신 객체 지정 람다 : 수신 객체를 명시하지 않고 람다의 본문 안에서 해당 객체의 메서드를 호출할 수 있게 하는 것
//차이점 - 수신 객체 접근 방법 : this, it
//     - return 값 : 수신 객체, 마지막 행(ramda result)



fun main(){
    // let, run, apply, also, with
    // 1. let
    // 수신객체.let {
    //
    // 마지막 줄 // return
    // }
    // 보통 null safe 체크할 때 많이 사용 -> 수신객체?.let { return 값 }
    // 지역 변수를 명시적으로 표현 해야 때
    val a = 3
    a.let {  }
    val user = User(name = "조경석", age = 23, gender = false)
    val age = user.let { it.age }
    println(age)

    //2. run
    // 수신객체.run {
    //
    // 마지막 줄  // return
    // }
    // run은 객체를 초기화 할 때 많이 사용함
    // return 값이 있을 때

    val kid = User("아이", 4, false)
    val kidAge = kid.run { age }
    println(kidAge)

    // 3. apply
    // 수신객체.apply {
    //
    // }
    // return값이 수신객체 자신
    // 객체 초기화에 사용
    val kidName = kid.apply {
        hasGlasses = false
    }
    println(kidName.hasGlasses)

    // 4. also
    // 수신객체.also { it -> // local variable
    //
    // } // return 수신객체 자기 자신
    // also는 log를 찍을 때 많이 사용
    // 수신객체를 명시적으로 사용하고 싶을 때


    val maleName = kid.also {
        it.hasGlasses = false
    }
    println(maleName.hasGlasses)

    // 5. with
    // with(수신객체) {
    //
    // 마지막 줄 // return
    // }
    // 객체 초기화, 람다 리턴값이 필요 없을 때
}

class User(
    val name : String,
    val age : Int,
    val gender : Boolean,
    var hasGlasses : Boolean = true
)