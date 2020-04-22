package section4

class PrimaryConstructors constructor (name: String) {
    val myVal = "My val: $name"
    var count: Int

    init {
       if(myVal.length > 3) {
           count = myVal.length
       }
       else {
           count = 0
       }
    }
}

// Notice that the constructor keyword was omitted
// Also using a default value
class PrimaryConstructors2 (val name: String, var status: Int = 1) {

    fun doStuff() {
        println(name)
    }
}

class PrimaryConstructors3(val name: String, var status: Int) {

    init {
        status = 0
    }

    fun doStuff() {
        status = 5
        println(status)
    }

    init {
        status = 2
    }
}

fun main(args: Array<String>) {

    // Calling a primary constructor looks the same as always.
    var myObject = PrimaryConstructors("My Name")

    var myObject2 = PrimaryConstructors2("My name")
    myObject2.doStuff()

    var myObject3 = PrimaryConstructors3("My Name", 1)
    myObject3.doStuff()
}
