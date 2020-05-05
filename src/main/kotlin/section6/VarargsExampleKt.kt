package section6

class VarargsExampleKt {

    fun varargsExample(str: String, vararg listOfInts: Int) {

        println(str)

        println("Number of arguments is: " + listOfInts.size)

        for (i in listOfInts) {
            print("$i ")
        }
    }
}

class VarargsInTheMiddle {

    fun varArgsInTheMiddle(x: Int, vararg y: Int, z: Int) {

        println(x)

        println("Number of arguments is: " + y.size)

        for (i in y) {
            print("$i ")
        }

        println(z)
    }
}

fun main(args: Array<String>) {
    VarargsExampleKt().varargsExample("one", 1, 2)
    VarargsExampleKt().varargsExample("two", 1, 2, 3, 4, 5)
    VarargsExampleKt().varargsExample("three")

    VarargsInTheMiddle().varArgsInTheMiddle(1, 1,2,3,4,5,6, z=2)
}
