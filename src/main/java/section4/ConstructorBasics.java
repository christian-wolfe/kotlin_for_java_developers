package section4;

public class ConstructorBasics {

    private int foo;
    private String bar;

    /*
     * A simple no-arg constructor that sets our fields to default values.
     */
    public ConstructorBasics() {
        foo = 10;
        bar = "bar";
    }

    /*
     * A constructor that expects values for both of our fields.
     */
    public ConstructorBasics(int foo, String bar) {
        this.foo = foo;
        this.bar = bar;
    }

    /*
     * A telescoping constructor that delegates to the previous constructor to
     * do the heavy lifting.
     */
    public ConstructorBasics(int foo) {
        this(foo, "bar");
    }

    public static void main (String [] args) {

        ConstructorBasics object1 = new ConstructorBasics();
        ConstructorBasics object2 = new ConstructorBasics(1);
        ConstructorBasics object3 = new ConstructorBasics(1, "bar");
    }
}
