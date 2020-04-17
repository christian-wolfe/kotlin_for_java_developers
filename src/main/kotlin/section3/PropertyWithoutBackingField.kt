package hello.section3

class PropertyWithoutBackingField {
    var myString: String = "This is a String"

    val lengthOfMyString: Int
        get() {
            if(myString == null) {
                return 0
            }
            return myString.length
        }
}

fun main(args: Array<String>) {

    var ourObject = PropertyWithoutBackingField()

    println("Length of myString: " + ourObject.lengthOfMyString)

    ourObject.myString= ""

    println("Length of myString: " + ourObject.lengthOfMyString)
}
