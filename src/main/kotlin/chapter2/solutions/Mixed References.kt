package chapter2.solutions

/**
 * This program is intended to help solving the exercise
 *
 * We mainly have the program and print the state after every step
 */
fun main() {
    val x = arrayOf(0, 1, 2, 3, 4)
    x.printCurrentState()

    x[3] = x[2]
    x.printCurrentState()

    x[4] = x[0]
    x.printCurrentState()

    x[2] = x[1]
    x.printCurrentState()

    x[1] = x[0]
    x.printCurrentState()

    x[0] = x[1]
    x.printCurrentState()

    x[4] = x[3]
    x.printCurrentState()

    x[3] = x[2]
    x.printCurrentState()

    x[2] = x[4]
    x.printCurrentState("Solution: ")
}

private fun <T> Array<T>.printCurrentState(prefix: String? = null) {
    if (prefix != null) {
        println(prefix)
    }
    this.forEachIndexed { index, value ->
        print("x[$index] = $value")
        if (index < this.size - 1) {
            print(" | ")
        }
    }
    println()
}