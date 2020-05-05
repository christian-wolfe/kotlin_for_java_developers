package appendix

fun simplePrint() {
    val x: Int = 5

    when(x) {
        1 -> println("one")
        2 -> println("two")
        3 -> println("three")
        4 -> println("four")
        5 -> println("five")
        else -> println("BIG!")
    }
}

fun assignmentExpression() {

    val x = 5
    var s = when (x) {
        1 -> {
            println("five")
            "five"
        }
        2 -> {
            println("two")
            "two"
        }
        else -> {
            println("Done")
            "None"
        }
    }

    var p = when (x) {
        1 -> "five"
        2 -> "two"
        else -> "None"
    }

    println(s)
    println(p)
}

fun multipleCases() {

    val x = 1
    when(x) {
        1, 2 -> println("one or two")
        3 -> println("three")
        else -> println("None")
    }
}

fun main(args: Array<String>) {
    simplePrint()
    assignmentExpression()
    multipleCases()
}