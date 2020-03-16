package chapter4.solutions

class DVDPlayer(var hasRecorder: Boolean) {

    fun playDVD() {
        println("DVD playing")
    }

    fun recordDVD() {
        if (hasRecorder) {
            println("DVD recording")
        }
    }
}

fun main(args: Array<String>) {
    val d = DVDPlayer(true)
    d.playDVD()
    d.recordDVD()
}