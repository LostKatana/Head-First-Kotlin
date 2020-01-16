package chapter3.solutions

import kotlin.test.assertEquals

/**
 * Original solutions can be found on page 74 in the book.
 * This is a showcase for the max value problem mentioned in the book
 * We compare them as long values
 */
fun timesThree(x: Int): Int {
    val y = x * 3
    return y
}

fun main() {
    val actual = timesThree(Int.MAX_VALUE / 2)
    //val expected: Int = 6442450941  // Uncomment to see the error message
    val expected = 6442450941
    assertEquals(expected, actual.toLong())
}