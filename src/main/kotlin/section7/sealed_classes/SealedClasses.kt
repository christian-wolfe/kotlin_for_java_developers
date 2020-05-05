package section7.sealed_classes

sealed class Crayon {
    class YellowCrayon: Crayon()
    class BlueCrayon: Crayon()
    class RedCrayon: Crayon()
}

fun whatColorIsThis(c: Crayon): String = when(c) {
    is Crayon.YellowCrayon -> "yellow"
    is Crayon.BlueCrayon -> "Blue"
    is Crayon.RedCrayon -> "Red"
}

fun main(args: Array<String>) {
    val c = Crayon.YellowCrayon()

    println(whatColorIsThis(c))
}