package com.example.designpatterns.composite.example1

data class Developer(
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
}