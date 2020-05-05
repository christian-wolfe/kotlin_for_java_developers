package appendix

fun ifStatements() {

    // One-liner if statement
    var max: Int = 1
    if (1 < 2) max = 2

    // "Traditional" if-else block
    if (max > 2) {
       println("greater")
    }
    else if (max < 2) {
        println("smaller")
    }
    else {
       println("same")
    }

    // Assignment examples

    val x: Int = if(1 > 2) 3 else 1  // One-liner version

    // Multi-line version
    val y: Int = if(1 > 2) {
        println("three")
        3
    }
    else {
        println("one")
        1
    }
}
