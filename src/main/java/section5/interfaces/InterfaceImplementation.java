package section5.interfaces;

public class InterfaceImplementation implements InterfaceExample {

    // Implements the abstractMethod declaration
    public int abstractMethod(int x, int y) {
        return SOME_CONSTANT;
    }

    // Implements the abstractMethodUsingGenericType declaration
    public Object abstractMethodUsingGenericType(Object[] array, int i) {

        // Calls this default method from the interface
        defaultMethod(0, 1);
        return null;
    }

    @NestedAnnotation(attrib1 = "test") // Uses the nested annotation
                                        // from the interface
    public void doStuff() {
        System.out.println(NestedEnum.OBJECT1); // Uses the nested enum from
                                                // the interface

        NestedClass obj = new NestedClass();    // Uses the nested class from the
                                                // interface
    }

    // Implements the nested interface from within the original interface
    class AnotherNestedClass implements NestedInterface {
    }
}
