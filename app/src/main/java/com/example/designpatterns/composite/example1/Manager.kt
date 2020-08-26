package com.example.designpatterns.composite.example1

data class Manager(
    val mName: String,
    val mDesignation: String,
    val mSalary: Int
) : Employee {
    override fun getName(): String {
        return mName
    }

    override fun getSalary(): Int {
        return mSalary
    }

    override fun getDesignation(): String {
        return mDesignation
    }

    override fun addEmployee(employee: Employee) {
        println("${getName()}::(${getDesignation()}) is not authorized to add ${employee.getDesignation()} in the company")
    }

    override fun removeEmployee(employee: Employee) {
        println("${getName()}::(${getDesignation()}) is not authorized to remove ${employee.getDesignation()} from the company")
    }
}