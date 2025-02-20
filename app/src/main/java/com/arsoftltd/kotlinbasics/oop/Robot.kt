package com.arsoftltd.kotlinbasics.oop

fun main(){
    // Creating Objects from Robot Class
    val ordinaryRobot = OrdinaryRobot("Max")
    ordinaryRobot.walk()

    val superRobot = SuperRobot("Buddy")
    superRobot.cleanHouse()

    val firingRobot = FiringRobot("Hero")
    firingRobot.fire()

}