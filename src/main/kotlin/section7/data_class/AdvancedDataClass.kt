package section7.data_class

data class AdvancedDataClass(val x: Int, val y: String) {

    fun calculateLength(): Int {
        return y.length
    }
}

fun main(args: Array<String>) {

    var myObject = AdvancedDataClass(1, "String")
    println(myObject.calculateLength())
}





interface SpecialInterface {

    var specialValue: Int

    fun processData()

    fun debugOutput() {
        println(specialValue)
    }
}

data class SpecialDataClass(override var specialValue: Int) : SpecialInterface {
    override fun processData() {
    }
}

data class SpecialDataClass2(var aString: String ) : SpecialInterface {
    override var specialValue: Int = 2

    override fun processData() {
        val x: Int = if(1 > 2) {
           println("three")
           3
        }
        else {
           println("one")
           1
        }
    }
}




// A class with no Properties
open class ParentClassWithNoProps

// Our Data Class needs SOMETHING in its constructor, so it has to
// provide at least one property of its own
data class DataClass(var myInt: Int): ParentClassWithNoProps()

// This parent class DOES have Properties. Note the use of 'open'
open class ParentClassWithProps(open var x: Int)

// This Data class only needs to override its Parent's Property
data class DataClass2(override var x: Int): ParentClassWithProps(x)
