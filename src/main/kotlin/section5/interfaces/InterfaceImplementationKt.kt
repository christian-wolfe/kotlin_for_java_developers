package section5.interfaces

class InterfaceImplementationKt: InterfaceExampleKt<String> {
    // Initializes the constant
    override var SOME_CONSTANT: Int = 3

    // Implements the method declaration
    override fun abstractMethod(x: Int, y: Int): Int {
        return SOME_CONSTANT
    }

    // Implements the OTHER method declaration
    override fun abstractMethodUsingGenericType(array: Array<String>, i: Int): String {
        // Calls the default method implementation from the interface
        defaultMethod(1, 2)
        return ""
    }

    // Uses the annotation
    @InterfaceExampleKt.NestedAnnotation
    fun myFunction() {
        // Uses the enum
        println(InterfaceExampleKt.Test.A)

        // Uses the nested class
        val nestedClass = InterfaceExampleKt.MyTestClass()

    }
}

// Implements the nested interface
class ImplementsTestInterface: InterfaceExampleKt.TestInterface