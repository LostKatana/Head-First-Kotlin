package chapter6.solutions

// 1
open class Click {}

class Clack : Click() {}

// 2
abstract class Top {}

class Tip : Top() {}

// 3
abstract class Alpha {}

abstract class Omega : Alpha() {}

// 4
interface Foo {}

open class Bar : Foo {}
class Baz : Bar() {}

// 5
interface Fee {}

interface Fi {}

open class Fo : Fi {}
class Fum : Fee, Fo() {}