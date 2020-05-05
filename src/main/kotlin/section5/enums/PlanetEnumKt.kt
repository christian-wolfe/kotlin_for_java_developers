package section5.enums

enum class PlanetEnumKt (var mass:Double, var radius:Double){

    MERCURY(3.303e+23, 2.4397e6) {
        override fun surfaceGravity(): Double {
            return super.surfaceGravity()
        }
    },
    VENUS(4.869e+24, 6.0518e6),
    EARTH(5.976e+24, 6.37814e6),
    MARS(6.421e+23, 3.3972e6),
    JUPITER(1.9e+27, 7.1492e7),
    SATURN(5.688e+26, 6.0268e7),
    URANUS(8.686e+25, 2.5559e7),
    NEPTUNE(1.024e+26, 2.4746e7)

    ;

    private fun mass(): Double {
        return mass
    }

    private fun radius(): Double {
        return radius
    }

    fun mutate() {
       mass = mass * 2
    }
    open fun surfaceGravity(): Double {
        return 6.67300E-11 * mass / (radius * radius)
    }

    fun surfaceWeight(otherMass:Double): Double{
        return otherMass * surfaceGravity()
    }
}

fun main(args: Array<String>) {
    var p1: PlanetEnumKt = PlanetEnumKt.EARTH
    println(p1.mass)
    p1.mutate()
    println(p1.mass)

    var p2: PlanetEnumKt = PlanetEnumKt.JUPITER
    println(p2.mass)
}