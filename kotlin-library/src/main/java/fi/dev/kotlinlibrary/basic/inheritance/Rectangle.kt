package fi.dev.kotlinlibrary.basic.inheritance

open class Rectangle {
    open fun draw() { println("Drawing a rectangle") }
    val borderColor: String get() = "black"
}