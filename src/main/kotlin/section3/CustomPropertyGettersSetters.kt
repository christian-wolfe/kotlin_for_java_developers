package hello.section3

import java.lang.AssertionError

class CustomPropertyGettersSetters {

    var variableProperty: String = "This is a String"
        get() {
            if(field == null) {
                throw AssertionError("This value was set to null")
            }
            return field
        }
        set(value) {
            if(value != null && value != "") {
                field = value
            }
        }

    val valueProperty: String = "This is also a string"
        get() = field.toUpperCase()
}

fun main(args: Array<String>) {

    var ourObject = CustomPropertyGettersSetters()

    println("Value but with capitalized: " +
            ourObject.valueProperty)

    println("Should equal our original value: " + ourObject.variableProperty)

    ourObject.variableProperty = "change!"

    println("Should equal 'change!': " + ourObject.variableProperty)

    ourObject.variableProperty = ""

    println("Should still equal 'change!': " + ourObject.variableProperty)
}
