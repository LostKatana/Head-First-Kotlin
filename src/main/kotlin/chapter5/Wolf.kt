package chapter5

class Wolf : Canine() {

    override val image: String = "wolf.jpg"
    override val food: String = "meat"
    override val habitat: String = "forests"

    override fun makeNoise() {
        println("Hooooowl!")
    }

    override fun eat() {
        println("The Wolf is eating $food")
    }
}