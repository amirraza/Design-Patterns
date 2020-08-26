package com.example.designpatterns.composite.example2

class HtmlElement(
    var mStartTag: String,
    var mEndTag: String,
    var mText: String = "",
    var mSpace: String = ""
) : Tag {
    override fun getStartTag(): String {
        return mStartTag
    }

    override fun getEndTag(): String {
        return mEndTag
    }

    override fun getInnerHtmlText(): String {
        return mText
    }

    override fun getIndentSpace(): String {
        return mSpace
    }

    override fun setIndentSpace(space: String) {
        mSpace += space
    }

    override fun generateHtmlCode() {
        println("${getIndentSpace()}${getStartTag()}${getInnerHtmlText()}${getEndTag()}")
    }
}