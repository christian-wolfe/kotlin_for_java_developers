package hello.section3

class AddingModifiersToGetterSetter {
    var myString: String = "abc"
        protected set

    var deprecatedString: String = "abc"
        @Deprecated("Don't use this!") get
        @Deprecated("Don't use this either!") set

    val overridenGetterExample: String = "abc"
        @Deprecated("This is also old") get() = field + "!"
}