package chapter5.solutions

import java.lang.IllegalArgumentException

class `Be the Compiler Checker` {
    fun check(question: Int, option: String): Result {
        return when (question) {
            1 -> if (option.equals("Y")) Result(1, "right!") else Result(1, "wrong.")
            2 -> if (option.equals("X")) Result(2, "right!") else Result(2, "wrong.")
            3 -> if (option.equals("N")) Result(3, "right!") else Result(3, "wrong.")
            else -> throw IllegalArgumentException("Question $question is not known.")
        }
    }
}

data class Result(val question: Int, val result: String)