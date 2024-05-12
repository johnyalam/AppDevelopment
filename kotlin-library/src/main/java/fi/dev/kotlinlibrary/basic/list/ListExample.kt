package fi.dev.kotlinlibrary.basic.list

class ListExample {
    //    String
    val readOnlyShapes = listOf("triangle", "square", "circle")

    val  name: String = "Jane Alam"

    // Plate type list
    val plate1 = Plate("Medium","White")
    val plate2 = Plate("Medium","White")
    val plate3 = Plate("Medium","White")

    val plateList: List<Plate> = listOf(plate1, plate2, plate3)


    // List item changing
    private val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")

    fun  shapeAdd(){
        shapes.add("pentagon")
        println(shapes)
        shapes.remove("pentagon")
    }

    fun whenCondition() {
        val obj = "Hello"

        when (obj) {
            // Checks whether obj equals to "1"
            "1" -> println("One")
            // Checks whether obj equals to "Hello"
            "Hello" -> println("Greeting")
            // Default statement
            else -> println("Unknown")
        }


        if(obj == "1"){
            println("One")
        } else if (obj == "Hello") {
            println("Greeting")
        } else {
            println("Unknown")
        }
    }

    fun forLoop(){
        val cakeItems = listOf("carrot", "cheese", "chocolate")

        for (cake in cakeItems) {
            println("Yummy, it's a $cake cake!")
        }

        sumFoodAndMobileBill(20.0,20.2)
    }

    fun sumFoodAndMobileBill(food: Double, mobile: Double) : Double {
        val sum = food + mobile
        return sum
    }

    fun main() {
        println(sumFoodAndMobileBill(0.0, 20.0))
        // 3
    }
}

data class Plate(val name: String,val color: String)