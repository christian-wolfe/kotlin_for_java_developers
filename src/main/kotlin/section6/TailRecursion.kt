package section6

/**
 * An Example of Tail Recursion. This is an example taken from geeksforgeeks.org,
 * https://www.geeksforgeeks.org/tail-recursion/
 *
 * And translated into Kotlin
 */
class TailRecursion {
    tailrec fun print(n: Int) {
        if (n < 0)  return
        println(" " + n)

        // The last executed statement is recursive call
        print(n-1);
    }
}

fun main(args: Array<String>) {
    TailRecursion().print(5)
}