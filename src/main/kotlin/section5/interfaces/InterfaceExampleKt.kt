package section5.interfaces

interface InterfaceExampleKt<T> {

    // We can define a property, but not initialize it.
    var SOME_CONSTANT: Int

    // A method declaration
    fun abstractMethod(x: Int, y: Int): Int

    // Method declaration with a generic type
    fun abstractMethodUsingGenericType(array: Array<T>, i: Int): T

    // Concrete method implementation
    fun defaultMethod(x: Int, y: Int): Int {
        return 1
    }

    // Nested class
    class MyTestClass {

    }

    // Nested interface
    interface TestInterface

    // Nested enum
    enum class Test {
        A, B, C
    }

    // Annotation
    annotation class NestedAnnotation
}