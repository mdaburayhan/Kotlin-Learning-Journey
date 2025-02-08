package com.arsoftltd.kotlinbasics

fun main(){
    // if statement
    val age = 17
    if (age >= 18){
        println("You are an adult")
    }

    // if else statement
    val score = 40
    if (score >= 60){
        println("Pass")
    }else{
        println("Fail")
    }

    // when Expression
    val day = 5
    when(day){
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        else -> println("Unknown day")
    }
    // Nested Conditionals
    val isRaining = true
    val isCold = false

    if (isRaining){
        if (isCold){
            println("Use Umbrella and Coat")
        }else{
            println("Use only Umbrella")
        }
    }else if(isCold){
        println("Use only Coat")
    }else{
        println("You can go normally")
    }




}