package chapter5.solutions

/**
    How to use the test:
        - Select your choices with either Y, N or X on the three constants (solution1, solution2, solution3)
            - X - If it will not compile
            - Y - Compiles with correct result
            - N - Compiles with wrong result
        - Hit run on the main function
**/

const val solution1 = ""
const val solution2 = ""
const val solution3 = ""
val checker = `Be the Compiler Checker`()

fun main(args: Array<String>) {

    val result1 = checker.check(1, solution1)
    val result2 = checker.check(2, solution2)
    val result3 = checker.check(3, solution3)
    
    for (result in arrayOf(result1, result2, result3)) {
        println("Question ${result.question}: You were ${result.result}")
    }
}

