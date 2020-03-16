package chapter5

open class Animal {

    open val image: String = ""
    open val food: String = ""
    open val habitat: String = ""
    var hunger: Int = 10

    open fun makeNoise(): Unit {
        println("The Animal is making a noise")
    }

    open fun eat(): Unit {
        println("The Animal is eating")
    }

    open fun roam(): Unit {
        println("The Animal is roaming")
    }

    fun sleep(): Unit {
        println("The Animal is sleeping")
    }
}