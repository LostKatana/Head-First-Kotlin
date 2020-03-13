package chapter6.multiple

class X : A, B {

    override fun myFunction() {
        super<A>.myFunction()
        super<B>.myFunction()
        // Extra code specific to class X
    }
}