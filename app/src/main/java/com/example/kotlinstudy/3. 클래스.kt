package com.example.kotlinstudy

fun main() {
    val user = User("조경석", 23)
    user.name //(1)
}

//kotlin 에서 클래스 선언은 class 로 하며, 클래스명 뒤에 괄호()는 주생성자가 된다
//아래 class 에서 private 이 없기 때문에 변수에서 접근 가능(1)
class User(val name : String, var age : Int)


//kotlin 은 class 상속을 권장하지 않음 그러나 꼭 필요한 상황이라면 아래와 같이 open 을 추가해 사용해야 함
open class Example(open val name : String, open var age: Int)

class ExampleKid(override val name: String, override var age: Int) : Example(name, age){
    //또한 생성자는 부생성자 - constructor / init 블럭 - init {} 이 있는데
    //부생성자는 init 블럭 즉, 초기화가 된 후 부생성자가 실행된다.
}