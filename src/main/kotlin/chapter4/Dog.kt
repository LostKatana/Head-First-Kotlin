package chapter4

// the bark() function has been slightly changed to also print the name in front
// also the order in which the properties are is mor or less chronologically ordered
class Dog(val name: String, weight_param: Int, breed_param: String) {
    init {
        println("Dog $name has been created.")
    }

    var activities = arrayOf("Walks")
    val breed: String = breed_param.toUpperCase()

    init {
        println("The breed is $breed")
    }

    var weight = weight_param
        set(value) {
            if (value > 0) field = value
        }

    val weightInKg: Double
        get() = weight / 2.2

    fun bark() {
        println("$name:\t" + if (weight > 20) "Yip!" else "woof!")
    }
}

fun main(args: Array<String>) {
    var myDog = Dog("Fido", 70, "Mixed")
    myDog.bark()
    myDog.weight = 75
    println("Weight in Kgs is ${myDog.weightInKg}")
    myDog.weight = -2
    println("Weight is ${myDog.weight}")
    myDog.activities = arrayOf("Walks", "Fetching balls", "Frisbee")
    for (item in myDog.activities) {
        println("My dog enjoys $item")
    }

    var dogs = arrayOf(Dog("Kelpie", 20, "Westie"), Dog("Ripper", 10, "Poodle"))
    dogs[1].bark()
    dogs[1].weight = 15
    println("Weight for ${dogs[1].name} is ${dogs[1].weight}")
}

// --------------------------------------------------------------------------------------------------------------------
// Under here are the various versions you came along in the book.
// To make it more easy we only have the final version ready to run
/*

// version 1
class Dog(val name: String, var weight: Int, val breed: String) {

    fun bark() {
        println(if (weight > 20) "Yip!" else "woof!")
    }
}

// version 2
class Dog(name_param: String, weight_param: Int, breed_param: String) {
    val name: String = name_param
    var weight: Int = weight_param
    val breed: String = breed_param.toUpperCase()
    var activities = arrayOf("Walks")

    fun bark() {
        println(if (weight > 20) "Yip!" else "woof!")
    }
}

// version 3/4
class Dog(val name: String, var weight: Int, breed_param: String) {
    var activities = arrayOf("Walks")
    val breed: String = breed_param.toUpperCase()

    init {
        println("Dog $name has been created.")
    }

    fun bark() {
        println(if (weight > 20) "Yip!" else "woof!")
    }
}

*/
