package section7.data_class

data class BasicDataClass(val x: Int, val y: String)

data class Person(val name: String) {
    var age: Int = 0
}

fun main(args: Array<String>) {

    var myObject = BasicDataClass(5, "test")

    println(myObject.toString())
    println(myObject.hashCode())

    var myPerson = Person("Jon Doe")
    myPerson.age = 33

    var myOtherPerson = myPerson.copy(name="Jane Doe")
}

