package com.arsoftltd.kotlinbasics.basics

fun main(){
    // This line will print "Hello My Friends" message
    println("Hello My Friends")

    /*
    *  fun main: define the entry point of the program
    *
    * println("Hello My Friends"): is used to print
    * the text "Hello My Friends" to the
    * Console
    *
    * */

    /*
    *
    *  A variable is a named storage location in which
    * you can store and manipulate data.
    *
    * Steps to Create Variables:
    *       - Variable Declaration
    *       - Type Inference
    *       - Assigning Values
    *
    *       var: keyword used to declare a mutable variable
    *       val: keyword used to declare a immutable variable
    * */

    // Mutable Variable
    var myAge = 25

    // Immutable Variable
    val pi: Double = 3.14159

    println("My age is: "+myAge)


    /*
    * Kotlin Provides several integer data types with
    * varying sizes.
    */

    // Byte: -128 to 127
    val myByte : Byte = 127

    // Short: -32786 to 32767
    val myShort: Short = 5473

    // Int: approx. -2,147,483,648 to 2,147,483,647 (32 Bit)
    val myInt: Int = 47895

    // Long: -9223372036854775807 to 9223372036854775807 (64 Bit)
    val myLong: Long = 822572036854758

    // Float: store values with fractional parts
    val myFloat: Float = 3.14159f

    // Double: store values with greater precision
    val myDouble: Double = 2.754456456

    // Boolean: True or False?
    val isRaining: Boolean = true

    if (isRaining){
        println("It's raining outside")
    }

    // Characters: represent single character
    // (Letter, Digit, Symbol or Special Characters..)
    var myChar: Char = '#'







}