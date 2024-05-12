package fi.dev.kotlinlibrary.basic.enumclass

class MainEnum {
    fun main (){
        for (color in Color.entries) println(color.toString()) // prints RED, GREEN, BLUE
        println("The first color is: ${Color.valueOf("RED")}")
    }

}