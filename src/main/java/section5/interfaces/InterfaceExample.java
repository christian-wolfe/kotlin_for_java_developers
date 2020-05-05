package section5.interfaces;

public interface InterfaceExample<T> {

    // A constant
    int SOME_CONSTANT = 35;

    // A method declaration
    int abstractMethod(int x, int y);

    // Method declaration with Generic type
    T abstractMethodUsingGenericType(T[] array, int i);

    // Default method implementation
    default int defaultMethod(int x, int y) {
        return 1;
    }

    // Static method implementation
    static void main(String[] args) {
    }

    // nested class
    class NestedClass {
    }

    // nested interface
    interface NestedInterface {
    }

    // nested enum
    enum NestedEnum {
        OBJECT1,
        OBJECT2,
        ;
    }

    // nested annotation
    @interface NestedAnnotation {
        String attrib1();
    }
}