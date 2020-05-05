package section7.sealed_classes

sealed class Yarn() {
    class Cotton : Yarn()
    open class Wool : Yarn()
}