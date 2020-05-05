package appendix

class DestructionClass(val x: String, val y: String, val z: Int) {
    operator fun component1(): String = x
    operator fun component2(): String = y
    operator fun component3(): Int = z
}

data class MySimpleDataClass(val status: Int, val message: String)
fun returnTwoValues(): MySimpleDataClass {
    return MySimpleDataClass(404, "Not Found")
}

fun main(args: Array<String>) {

    val (x, y, z) = DestructionClass("1", "2", 3)

    println(x)
    println(y)
    println(z)




    val (status, message) = returnTwoValues()
    println(status)
    println(message)




    var map: HashMap<Int, String> = HashMap()
    map.put(1, "a string")

    for((key, value) in map){
        println(key)
        println(value)
    }



    val (_, p, q) = DestructionClass("1", "2", 3)
    println(p)
    println(q)
}
