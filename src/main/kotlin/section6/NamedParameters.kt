package section6

// A function in which a default value preceded an argument with no default
fun defaultValuePrecedingNamedParameter(x: Int = 4, y: Int): Int {
    return x + y
}

// A function in which a default value comes after an argument with no default
fun defaultValueAfterNamedParameter(x: Int, y: Int=5): Int {
    return x + y
}

fun mixingPositionalAndNamedArgs(x: Int, y: Int, z: String): String {
    return "hello X: $x, Y: $y, Z: $z"
}

fun main(args: Array<String>) {

    // We have to use a named parameter to call this function with a single arg
    println(defaultValuePrecedingNamedParameter(y = 0))

    // ... We do not have to use a named parameter to call this function
    println(defaultValueAfterNamedParameter(0))

    // You can call this function by using a positional argument(s) first,
    // and then later switching to named args, but you can't switch back,
    // and you can't START with named args so this is fine ...
    println(mixingPositionalAndNamedArgs(2, y=1, z="Zeee"))
    // ... but this is not:
    // println(mixingPositionalAndNamedArgs(x=2, 1, "Zeee"))
    // nor is this:
    // println(mixingPositionalAndNamedArgs(2, y=1, "Zeee"))
}