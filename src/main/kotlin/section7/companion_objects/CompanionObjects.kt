package section7.companion_objects

class BasicCompanionObject {
    companion object {
        @JvmStatic
        fun actStatic() {
            println("Act Static!")
        }
    }
}

class ClassWithNamedCompanion {

    companion object NamedCompanion {
        fun actStatic() {
            println("Act Static")
        }
    }
}

interface compInterface {
    fun actStatic()
}

class ClassWithInterfaceCompanion {
    companion object: compInterface {
        override fun actStatic() {
            println("act static")
        }

    }
}

fun main(args: Array<String>) {
    BasicCompanionObject.actStatic()

    val x = BasicCompanionObject.Companion
    x.actStatic()

    ClassWithNamedCompanion.actStatic()
    val y = ClassWithNamedCompanion.NamedCompanion

    val z = BasicCompanionObject

    z.actStatic()
}
