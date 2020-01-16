package chapter2.solutions

/**
 * Original solutions can be found on page 55 in the book.
 * This is the shortest answer I could think of producing the same outcome without any other variable
 */
fun main(args: Array<String>) {

    arrayOf("Pugh", "Pugh", "Barney McGrew", "Cuthbert", "Dibble", "Grub")
            .forEachIndexed { index, it -> println("Firemen number $index is $it") }
}