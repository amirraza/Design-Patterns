package com.example.designpatterns.composite.example3

class Square : Shape() {
    override fun getShapeName(): String {
        return Square::class.java.simpleName
    }

    override fun draw() {
        println("Drawing ${getShapeName()} without color")
    }
}