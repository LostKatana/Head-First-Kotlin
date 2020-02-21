package chapter3

import chapter3.Option.Companion.from
import kotlin.random.Random

/**
 * This is a modified version of the Game class adding <br/>
 *  - retry option <br/>
 *  - choises
 */
fun main(args: Array<String>) {
    GameModified().also {
        do {
            val options = Option.values()
            val gameChoice = it.getGameChoice(options)
            val userChoice = it.getUserChoice(options)
            val result = it.calculateResult(gameChoice, userChoice)

            it.printResult(result)
        } while (it.anotherRound())
    }
}

class GameModified {

    fun getGameChoice(optionsParam: Array<Option>) = optionsParam[(Random.Default.nextDouble() * optionsParam.size).toInt()]

    fun getUserChoice(optionsParam: Array<Option>): Option {
        var userChoice: Option? = null

        while (userChoice == null) {
            `print enter choise dialog`(optionsParam)
            val userInput = readLine()
            if (userInput != null && userInput.isValidInput()) {
                userChoice = from(userInput)
            }
            if (userChoice == null) {
                println("You must enter a valid choice.")
            }
        }

        return userChoice
    }

    fun printResult(result: Result) =
            println("You chose ${result.userChoice.value}. I chose ${result.gameChoice.value}. ${when (result) {
                is Tie -> "Tie!"
                is Win -> "You win!"
                is Loss -> "You lose!"
            }}")

    private fun String.isValidInput() = from(this) != null

    private fun `print enter choise dialog`(optionsParam: Array<Option>) =
            println("Please enter one of the following: ${optionsParam.joinToString()}.")

    fun calculateResult(gameChoice: Option, userChoice: Option): Result =
            when {
                gameChoice.isTieCondition(userChoice) -> Tie(gameChoice, userChoice)
                gameChoice.isWinCondition(userChoice) -> Win(gameChoice, userChoice)
                else -> Loss(gameChoice, userChoice)
            }

    fun anotherRound(): Boolean {
        println("Again? (y/n)")
        val answer = readLine()
        if (answer == "Y" || answer == "y")
            return true
        println("Bye!")
        return false
    }
}

enum class Option(val value: String, val shortcut: String) {
    ROCK("Rock", "r"),
    PAPER("Paper", "p"),
    SCISSORS("Scissors", "s");

    fun isTieCondition(choice: Option) = this == choice

    fun isWinCondition(choice: Option) =
            (this == ROCK && choice == SCISSORS) ||
                    (this == PAPER && choice == ROCK) ||
                    (this == SCISSORS && choice == PAPER)

    companion object {

        fun from(value: String): Option? {
            for (option in values()) {
                if (option.name.equals(value.toUpperCase()) || option.shortcut.equals(value.toLowerCase()))
                    return option
            }
            return null
        }
    }
}

sealed class Result(open val gameChoice: Option, open val userChoice: Option)

class Win(gameChoice: Option, userChoice: Option) : Result(gameChoice, userChoice)
class Tie(gameChoice: Option, userChoice: Option) : Result(gameChoice, userChoice)
class Loss(gameChoice: Option, userChoice: Option) : Result(gameChoice, userChoice)
