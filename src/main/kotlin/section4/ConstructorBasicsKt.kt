package section4

class ConstructorBasicsKt {
    var foo: Int = 1
    var bar: String = "Bar"

    constructor() {
        foo = 2
        bar = "BARRRR!!!!"
    }

    constructor(foo: Int, bar: String) {
        this.foo = foo
        this.bar = bar
    }

    constructor(foo: Int): this(foo, "bar")
}

fun main(args: Array<String>) {

    var object1 = ConstructorBasicsKt()
    var object2 = ConstructorBasicsKt(1)
    var object3 = ConstructorBasicsKt(1, "bar")
}