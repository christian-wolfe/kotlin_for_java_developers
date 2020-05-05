package section6

// A very simple function definition
fun aBasicFunction() {}

// A function with some parameters. Notice that the name is placed before
// the type
fun aFunctionWithSomeParams(x: Int, y: Boolean) {}

// A function that returns a value
fun aFunctionThatReturnsAValue(x: Int): Int {
    return 1
}

// A function with a default value for its argument(s)
fun aFunctionWithDefaultValues(x: Int = 1) {}

// A one-liner function. Notice that it uses the '=' sign instead of braces
fun aOneLinerFunction(x: Int): Int = x + 2

// A function in which the return type is inferred from the compiler
fun aFunctionWithInferredReturnType(x:Int) = x + 2