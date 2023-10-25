package com.example.kotlinstudy

// 5. data, sealed class
// Data class
// 정의 : 데이터를 담기 위한 클래스이다.
// 특징 - toString(), hashCode(), equals(), copy() 메소드를 자동 생성하며 override시 직접 구현하여 사용 가능
//     - 1개 이상의 프로퍼티가 있어야 한다
//     - 데이터 클래스는 abstract, open, sealed, inner 을 붙일 수 없다
//     - 상속이 불가능하다
//
// sealed class
// 정의 : 추상 클래스로 상속받은 자식 클래스의 종류를 제한
// 특징 - 컴파일러가 sealed 클래스의 자식 클래스가 어떤 것인지 암
//     - when 과 함께 쓰일 때 장점을 느낄 수 있음


fun main(){
    val person = Person("수지", 10)
    val dog = Dog("해피", 4)

    println(person.toString())
    println(dog.toString())
    println(dog.copy(name = "미정", age = 5).toString()) // 가장 많이, 유용하게 쓰이는 함수 copy()는 객체 내 데이터를 바꿔서 새로운 객체로 돌려줌

    val cat : Cat = Cat.BlueCat()
    val result = when(cat){
        is Cat.BlueCat -> TODO()
        is Cat.GreenCat -> TODO()
        is Cat.RedCat -> TODO()
    }
    // 위처럼 sealed 클래스를 사용했을 경우 컴파일러가 하위 클래스들을 모두 인식하여 자동으로 알려줌
}

class Person(
    val name : String,
    val age : Int
)

data class Dog(
    val name : String,
    val age : Int
)

sealed class Cat{
    class BlueCat : Cat()
    class RedCat : Cat()
    class GreenCat : Cat()
}