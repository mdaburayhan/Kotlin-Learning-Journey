package com.arsoftltd.kotlinbasics.oop

class FiringRobot: GeneralRobot {
    constructor(name:String, modelYear:String):super(name,modelYear)
    constructor(name: String):super(name)
    fun fire(){
        println("Firing....")
    }
}