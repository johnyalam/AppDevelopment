package fi.dev.kotlinlibrary.basic.inheritance

class Square() : Rectangle(), Polygon {
    override fun draw() {
        super<Rectangle>.draw()
    }
}