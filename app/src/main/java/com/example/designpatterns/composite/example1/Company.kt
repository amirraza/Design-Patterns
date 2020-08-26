package com.example.designpatterns.composite.example1

fun main() {
    val hr = HR("Demo HR", "Human Resource", 40000)

    val developer1 = Developer("Amir 1", "Android Developer", 100000)
    val developer2 = Developer("Amir 2", "Android Developer", 55000)
    hr.addEmployee(developer1)
    hr.addEmployee(developer2)

    val manager = Manager("Test Manager", "Project Manager", 450000)
    hr.addEmployee(manager)

    hr.getAllEmployees()
}