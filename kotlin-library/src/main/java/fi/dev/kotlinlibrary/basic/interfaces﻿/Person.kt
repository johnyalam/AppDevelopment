package fi.dev.kotlinlibrary.basic.interfaces


interface Person : Named {
    val firstName: String
    val lastName: String

    override val name: String
        get() = "$firstName $lastName"
}