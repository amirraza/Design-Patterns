package com.example.designpatterns.composite.example2

interface Tag {
    fun getStartTag(): String           //getting the start tag
    fun getEndTag(): String             //getting the end tag
    fun getInnerHtmlText(): String      //getting the inner html text
    fun getIndentSpace(): String        //getting the indented space

    fun setIndentSpace(space: String)   //setting the indented space
    fun generateHtmlCode()              //this will generate html code
}