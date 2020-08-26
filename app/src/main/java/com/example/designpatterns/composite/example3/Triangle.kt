package com.example.designpatterns.composite.example3

class Triangle(val colorName: String): Shape() {

    override fun getShapeName(): String {
        return Triangle::class.java.simpleName
    }
    override fun draw() {
        println("Drawing ${getShapeName()} with $colorName color")
    }
}