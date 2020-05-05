package section6;

public class VarargsExample {

    static void varargsExample(String str, int ...listOfInts) {
        System.out.println(str);
        System.out.println("Number of arguments is: "+ listOfInts.length);

        for (int i: listOfInts)
            System.out.print(i + " ");
    }

    public static void main(String args[]) {
        varargsExample("one", 1, 2);
        varargsExample("two", 1, 2, 3, 4, 5);
        varargsExample("three");
    }
}
