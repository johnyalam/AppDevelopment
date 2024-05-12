package fi.dev.kotlinlibrary.basic.interfaces

data class Employee(
    override val firstName: String,
    override val lastName: String
) : Person
