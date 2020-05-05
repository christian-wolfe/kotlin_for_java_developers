package appendix

fun rangeExpression() {

    val x = 150

    when (x) {
        in 1..10 -> print("x is in the range")
        !in 10..20 -> print("x is outside the range")
        else -> print("none of the above")
    }
}

fun arbitraryExpressions() {

    fun processInt(p: Int): Int {
        return p * 2
    }

    val x = 5

    when(x) {
        processInt(x) -> println("5")
    }
}

fun checkingType() {
    val x: Any = 5

    when(x) {
        is String -> println(x)
        is Int -> println(x + 1)
        else -> println("Something else")
    }
}

fun makeshiftIf() {
    val x = 5
    val y = 2

    when {
        x > y -> println("Greater")
        y < x -> println("Less")

    }
}
fun main(args: Array<String>) {
    checkingType()
}