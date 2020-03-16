package chapter3.solutions

/**
 * Original solutions can be found on page 74 in the book.
 * Compiles fine but has some unnecessary stuff. So this is modified
 */
fun doSomething(msg: String, i: Int) {
    if (i > 0) {
        for (x in 0 until i) {
            println(msg)
        }
    }
}