package section6

class InfixNotation(private val number: Int) {

    infix fun isDivisibleBy(num: Int): Boolean {
        return number % num == 0
    }
}

fun main(args: Array<String>) {
   val myNumber = InfixNotation(10)
   println(myNumber isDivisibleBy 5)
   println(myNumber isDivisibleBy 2)
   println(myNumber isDivisibleBy 3)
}
