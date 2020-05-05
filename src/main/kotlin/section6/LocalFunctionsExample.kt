package section6

class LocalFunctionsExample {

    fun parentFunction(x: Int, y: String): String {
        fun childFunction(z: String): String {
           return z + "and" + x
        }

        val new = y + "!"
        return childFunction(y)
    }
}