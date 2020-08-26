package com.example.designpatterns.composite.example1

data class HR(
    val mName: String,
    val mDesignation: String,
    val mSalary: Int,
    val listOfEmployee: ArrayList<Employee> = arrayListOf()
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
        listOfEmployee.add(employee)
    }

    override fun removeEmployee(employee: Employee) {
        listOfEmployee.remove(employee)
    }

    fun getAllEmployees() {
        listOfEmployee.forEach {
            println(it)
        }
    }
}