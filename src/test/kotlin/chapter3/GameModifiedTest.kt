package chapter3

import assertk.assertThat
import assertk.assertions.isInstanceOf
import assertk.tableOf
import chapter3.Option.*
import io.mockk.junit5.MockKExtension
import isSuccessAnd
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(MockKExtension::class)
class GameModifiedTest {

    val game = GameModified()

    @Test
    fun testTieCondition() {
        tableOf("gameChoice", "userChoice", "expectedOutcome")
                .row(ROCK, ROCK, Tie::class)
                .row(PAPER, PAPER, Tie::class)
                .row(SCISSORS, SCISSORS, Tie::class)
                .forAll { gameChoice, userChoice, result ->

                    assertThat {
                        game.calculateResult(userChoice, gameChoice)
                    }.isSuccessAnd {
                        assertThat(it).isInstanceOf(result)
                    }
                }
    }

    @Test
    fun testWinConditions() {
        tableOf("gameChoice", "userChoice", "expectedOutcome")
                .row(ROCK, PAPER, Win::class)
                .row(PAPER, SCISSORS, Win::class)
                .row(SCISSORS, ROCK, Win::class)
                .forAll { gameChoice, userChoice, result ->

                    assertThat {
                        game.calculateResult(userChoice, gameChoice)
                    }.isSuccessAnd {
                        assertThat(it).isInstanceOf(result)
                    }
                }
    }
}
