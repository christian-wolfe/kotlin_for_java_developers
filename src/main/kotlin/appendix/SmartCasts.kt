package appendix

fun smartCastsWithIsExpression(x: Any) {
    if (x is Int) {
        println(x + 2)
    }
    else if (x is String) {
        println(x.length)
    }
}

fun negativeCheckExample(x: Any) {
    if (x !is String) return

    print(x.length)
}

fun ands_Ors(x: Any) {
    if (x is String && x.length > 0) {
        print(x.length)
    }

    if (x !is String || x.length == 0) return
}

fun main(args: Array<String>) {
    smartCastsWithIsExpression("I'm a String!")
    smartCastsWithIsExpression(2)

    negativeCheckExample("String")
}