package com.arsoftltd.kotlinbasics.basics

fun main(){
    // Array: is a collection of elements of the same data type
    //        organized in a specific order and accessed by
    //        an index.

    // Array Declaration
    val osName = arrayOf("Windows","Android","MacOS","Linux")

    // Accessing Elements
    val firstElement = osName[0]
    println(firstElement)

    // Modifying Elements
    osName[1] = "iOS"
    println(osName[1])

    // Array Size
    val size = osName.size
    println("The size of this array: $size")

    // Iteration through an array
    for (name in osName){
        println(name)
    }
    osName.forEach { name -> println(name) }







}