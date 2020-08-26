package com.example.designpatterns.composite.example3

class ShapeDrawing: Shape() {
    val list : ArrayList<Shape> = arrayListOf()

    override fun getShapeName(): String {
        return ShapeDrawing::class.java.simpleName
    }

    fun addShape(shape: Shape) {
        list.add(shape)
    }

    override fun draw() {
        list.forEach {
            it.draw()
        }
    }
}