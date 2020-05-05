package appendix

fun forLoopsExamples() {

    var numberList = arrayOf(1, 2, 3, 4)

    for(item in numberList) println(item) // One-liner

    // Multi-line version. Notice we can declare the type of 'item'
    for(item:Int in numberList) {
        println(item)
    }

    for (i in 1..3) {
        println(i)
    }

    for (i in 6 downTo 0 step 2) {
        println(i)
    }

    for (i in numberList.indices) {
        println(numberList[i])
    }

    for ((index, value) in numberList.withIndex()) {
        println("the element at $index is $value")
    }
}

