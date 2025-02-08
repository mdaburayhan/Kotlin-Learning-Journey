package com.arsoftltd.kotlinbasics

fun main(){

    // Strings are sequences of characters that are used
    // to represent text.

    // String Declaration
    val text1: String = "Hello My Friends"
    val text2 = " Welcome Back!"

    // String Concatenation
    val text3 = text1 + text2
    println("The full text: "+text3)

    // String Templates
    val name = "Jack"
    val age = 30
    val info = "My name is $name and I am $age years old"
    println(info)

    // String Interpolation
    val x = 5
    val y = 3
    val result = "The sum of $x and $y is ${x+y}"
    println(result)

    // String Functions and Properties
    val text = "Welcome to our class"
    val length = text.length
    val subText = text.substring(0, 7)
    println("The length of text is: "+length)
    println("The Substring "+subText)

    // String Comparison
    val str1 = "Hello"
    val str2 = "Hi"
    val comparisonResult = str1.equals(str2)
    println("string comparison result: "+comparisonResult)

    // String Literals
    val newLineText = "This is the first line \nThis is the second line"
    println(newLineText)

}