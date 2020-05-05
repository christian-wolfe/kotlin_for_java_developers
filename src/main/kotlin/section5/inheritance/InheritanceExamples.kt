package section5.inheritance

// Simple class with no content
open class BareClass

// A subclass of BareClass. Notice that we still have to call its default
// primary constructor in order for this definition to be valid
class ChildOfBareClass: BareClass()

open class ParentWithPrimary(x: Int, y: Int)

class ChildWithPrimaryConstructor(x: Int, y: Int): ParentWithPrimary(x, y) {
}

class ChildWithExtraFields(x: Int, y: Int, z: String): ParentWithPrimary(x, y)

open class ParentWithPrimaryAndSecondary(var x: Int) {
    constructor(y: String): this(0) {
        x = y.length
    }
}

class ChildWithPrimaryAndSecondary(var z: Int): ParentWithPrimaryAndSecondary(z) {

}
fun main(args: Array<String>) {

    var my = ParentWithPrimaryAndSecondary("test")
    var myObject = ChildWithPrimaryAndSecondary(1)
}

open class OnlySecondaries {
    constructor(x: Int)
    constructor(y: String)
}

class ChildWithSecondaries: OnlySecondaries {

    constructor(x: Int): super(x)
    constructor(y: String): super(1)
}

open class ClassWithFunctions {

    open fun doStuff() {
        println("Do Stuff")
    }
}

class ChildWithFunctions: ClassWithFunctions() {

    override fun doStuff() {
       println("Don't do Stuff")
    }
}

open class OpenProperty(open val x: Int = 2)

class OverrideOpenProperty(override val x: Int = 3): OpenProperty(x)

abstract class MyAbstractClass {
    abstract fun doStuff()
}

open class NotAbstractClass: MyAbstractClass() {
    override fun doStuff() {
    }
}

abstract class NowItIsAbstract: NotAbstractClass() {
    abstract override fun doStuff()
}