package com.example.designpatterns.composite.example1

interface Employee {
    fun getName(): String
    fun getSalary(): Int
    fun getDesignation(): String
    fun addEmployee(employee: Employee) {}
    fun removeEmployee(employee: Employee) {}
}