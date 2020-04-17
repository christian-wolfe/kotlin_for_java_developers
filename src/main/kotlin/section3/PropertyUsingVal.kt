package hello.section3

class PropertyUsingVal {

    val propertyDeclaredUsingVal: String = "This is a string"
}

fun main(args: Array<String>) {

    var ourObject = PropertyUsingVal()
    println("Value of our first variable is: " +
            ourObject.propertyDeclaredUsingVal)
}
