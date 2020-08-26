package com.example.designpatterns.composite.example2

class HtmlParentElement(
    var mStartTag: String,
    var mEndTag: String,
    var mText: String = "",
    var mSpace: String = "  ",
    var mChildren: ArrayList<Tag> = arrayListOf()
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

    fun addElement(tag: Tag) {
        tag.setIndentSpace(getIndentSpace())
        mChildren.add(tag)
    }

    override fun generateHtmlCode() {
        println("${getIndentSpace()}${getStartTag()}")
        mChildren.forEach {
            it.setIndentSpace(getIndentSpace())
            it.generateHtmlCode()
        }
        println("${getIndentSpace()}${getEndTag()}")
    }
}