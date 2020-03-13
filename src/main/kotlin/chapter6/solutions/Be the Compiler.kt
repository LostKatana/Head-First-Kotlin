package chapter6.solutions


/**
 * Uncomment the method you want to test
 */
fun main(args: Array<String>) {
    val f = arrayOf(Bird(), Plane(), Superhero())
    var x = 0
    while (x in 0..2) {
        //x = one(f, x)
        //two(f, x)
        //three(f, x)
        //four(f, x)
        x++
    }
}

//private fun one(f: Array<Flyable>, x: Int): Int {
//    var x1 = x
//    when (f[x1]) {
//        is Bird -> {
//            x1++
//            f[x1].fly()
//        }
//        is Plane,
//        is Superhero -> f[x1].fly()
//    }
//
//    return x1
//}

//private fun two(f: Array<Flyable>, x: Int) {
//    if (x is Plane || x is Superhero) {
//        f[x].fly()
//    }
//}

//private fun three(f: Array<Flyable>, x: Int) {
//    when (f[x]) {
//        Plane, Superhero -> f[x].fly()
//    }
//}

//private fun four(f: Array<Flyable>, x: Int) {
//    val y = when (f[x]) {
//        is Bird -> false
//        else -> true
//    }
//    if (y) {
//        f[x].fly()
//    }
//}

interface Flyable {
    val x: String

    fun fly() {
        println("$x is flying")
    }
}

class Bird : Flyable {
    override val x: String = "Bird"
}

class Plane : Flyable {
    override val x: String = "Plane"
}

class Superhero : Flyable {
    override val x: String = "Superhero"
}
