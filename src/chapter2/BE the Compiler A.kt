package chapter2

fun main(args: Array<String>) {

    val hobbits = arrayOf("Frodo", "Sam", "Merry", "Pippin")
    var x = 0;

    while (x < 5) {
        println("${hobbits[x]} is a good Hobbit name") //We want to print a line for each name in the hobbits array.
        x = x + 1
    }
}