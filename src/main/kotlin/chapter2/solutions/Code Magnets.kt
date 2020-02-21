package chapter2.solutions

/**
 * Original solutions can be found on page 56 in the book.
 * This solution here shows how to get away with only the two arrays and no help of any other variable
 */
fun main(args: Array<String>) {

    val fruit = arrayOf("Apple", "Banana", "Cherry", "Blueberry", "Pomegranate")
    val index = arrayOf(1, 3, 4, 2)

    index.forEach {
        println("Fruit = ${fruit[it]}")
    }
}