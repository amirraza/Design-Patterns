package com.example.designpatterns.composite.example3

class Circle(val colorName: String): Shape() {

    override fun getShapeName(): String {
        return Circle::class.java.simpleName
    }
    override fun draw() {
        println("Drawing ${getShapeName()} with $colorName color")
    }
}