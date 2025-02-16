package com.arsoftltd.kotlinbasics.oop

fun main(){
    // Functions: are blocks of code that encapsulate a specific
    //            task or functionality

    // Fun Declaration:
//    fun functionName(perameter1: Type, parameter2: Type): ReturnType{
//        // Function Body
//        // perform some operations
//        // Optionally return a value
//    }

    sayHello("Tuba")
    var result = sumTwoNumbers(5,3)

    println(result)




}

fun sayHello(name: String, age: String = "Not Specified" ):Unit{
    println("Hello $name, your age is $age")
}

fun sumTwoNumbers(x:Int, y: Int):Int{
    var z = x+y
    return z
}


