package com.example.designpatterns.composite.example3

fun main() {
    val shapeDrawing = ShapeDrawing()

    val tri = Triangle("Red")
    val circle = Circle("Blue")
    val tri1 = Triangle("White")
    val square = Square()

    shapeDrawing.addShape(tri)
    shapeDrawing.addShape(circle)
    shapeDrawing.addShape(tri1)
    shapeDrawing.addShape(square)

    shapeDrawing.draw()
}