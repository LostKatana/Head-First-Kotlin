package chapter3.solutions

import java.util.function.BiFunction

/**
 * Run the main function and see the results
 */
private fun executeWithCandidate(xTerm: String, xCandidate: BiFunction<Int, Int, Int>, yTerm: String, yCandidate: BiFunction<Int, Int, Int>) {
    var x = 0
    var y = 20
    for (outer in 1..3) {
        for (inner in 4 downTo 2) {
            x = xCandidate.apply(x, y)
            y = yCandidate.apply(x, y)
            y++
            x += 3
        }
        y -= 2
    }

    printResults(xTerm, yTerm, x, y)
}

/**
 * Ignore this stuff in main
 */
fun main() {
    executeWithCandidate("x += 6", BiFunction { x, _ -> x + 6 }, "", BiFunction { _, y -> y })
    executeWithCandidate("x--", BiFunction { x, _ -> x - 1 }, "", BiFunction { _, y -> y })
    executeWithCandidate("", BiFunction { x, _ -> x }, "y = x + y", BiFunction { x, y -> x + y })
    executeWithCandidate("", BiFunction { x, _ -> x }, "y = 7", BiFunction { _, _ -> 7 })
    executeWithCandidate("x = x + y", BiFunction { x, y -> x + y }, "y = x - 7", BiFunction { x, y -> x - 7 })
    executeWithCandidate("x = y", BiFunction { _, y -> y }, "y++", BiFunction { _, y -> y + 1 })
}

private fun printResults(xTerm: String, yTerm: String, x: Int, y: Int) {
    println(if (xTerm.isNotEmpty() && yTerm.isNotEmpty()) {
        "$xTerm\n$yTerm"
    } else {
        "$xTerm$yTerm"
    })
    println("\t $x $y")
}