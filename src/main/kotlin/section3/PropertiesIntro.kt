package hello.section3

class PropertiesOverview {

    var firstProperty: String = "This is a string"
}

fun main(args: Array<String>) {

    var ourObject = PropertiesOverview()
    println("Value of our first variable is: " +
            ourObject.firstProperty)

    ourObject.firstProperty = "This is a new String"
    println("Value of our first variable is: " +
            ourObject.firstProperty)
}


