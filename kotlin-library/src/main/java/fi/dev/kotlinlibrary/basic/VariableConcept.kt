package fi.dev.kotlinlibrary.basic

class VariableConcept {
    val basicMessage = "This is a sample constant variable"

    var changingMessage = "This message can change later"

    fun testvariavle() {
        changingMessage = "dsds"
    }

    fun setMessage(message: String) {
        changingMessage = message
    }

    fun getMessage() : String {
        return changingMessage
    }
}