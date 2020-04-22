package section4

class MixingConstructorTypes(val name: String) {

    var isLong: Boolean = false

    constructor(name: String, _isLong: Boolean): this(name) {
        isLong = _isLong
    }
}