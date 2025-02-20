package com.arsoftltd.kotlinbasics.oop

open class GeneralRobot(val name: String) {
    fun walk(){
        println("The Robot is Walking now...")
    }
    fun speak(message: String){
        println("$name says: $message")
    }
}