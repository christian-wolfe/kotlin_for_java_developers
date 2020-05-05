package section7.sealed_classes

import section7.sealed_classes.Yarn.*

class Merino : Yarn.Wool()

fun knit(y: Yarn): String {
    return when(y) {
        is Wool -> "Knitting Wool"
        is Cotton -> "Knitting Cotton"
    }
}

fun main(args: Array<String>) {
    val spool = Merino()
    println(knit(spool))
}