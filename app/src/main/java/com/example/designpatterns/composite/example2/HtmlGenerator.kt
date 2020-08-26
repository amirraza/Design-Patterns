package com.example.designpatterns.composite.example2

fun main() {
    val html = HtmlParentElement("<html>", "</html>")
    val head = HtmlParentElement("<head>", "</head>")
    val body = HtmlParentElement("<body>", "</body>")

    val title = HtmlElement("<title>", "</title>", "Auto Generated Html")
    head.addElement(title)

    val firstHeding = HtmlElement("<h1>", "</h1>", "this is first heading")
    val firstPara = HtmlElement("<p>", "</p>", "this is first paragraph")

    val firstdiv = HtmlParentElement("<div>", "</div>")
    val firstParaInsideDiv = HtmlElement("<p>", "</p>", "this is first paragraph inside Div")
    firstdiv.addElement(firstParaInsideDiv)

    val secondDiv = HtmlParentElement("<div>", "</div>", "THis is Div content")
    val paraInsideSecondDiv = HtmlElement("<p>", "</p>", "this is first paragraph inside Div")
    secondDiv.addElement(paraInsideSecondDiv)

    firstdiv.addElement(secondDiv)

    body.addElement(firstHeding)
    body.addElement(firstPara)
    body.addElement(firstdiv)

    html.addElement(head)
    html.addElement(body)

    html.generateHtmlCode()
}