package chapter6

abstract class Animal : Roamable {

    abstract val image: String
    abstract val food: String
    abstract val habitat: String
    var hunger: Int = 10

    abstract fun makeNoise(): Unit

    abstract fun eat(): Unit

    override fun roam(): Unit {
        println("The Animal is roaming")
    }

    fun sleep(): Unit {
        println("The Animal is sleeping")
    }
}