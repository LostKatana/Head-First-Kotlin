package chapter4.solutions

class TapeDeck() {
    var hasRecorder = false

    fun playTape() {
        println("Tape playing")
    }

    fun recordTape() {
        if (hasRecorder) {
            println("Tape recording")
        }
    }
}

fun main(args: Array<String>) {
    val t = TapeDeck()
    t.hasRecorder = true
    t.playTape()
    t.recordTape()
}