package com.arsoftltd.kotlinbasics.oop

fun main(){
    // Creating Objects from Robot Class
    val ordinaryRobot = OrdinaryRobot("Max")
    ordinaryRobot.walk()

    val superRobot = SuperRobot("Buddy")
    superRobot.cleanHouse()

    val firingRobot = FiringRobot("Hero")
    val firingRobot2 = FiringRobot("Hero2", "2024")
    firingRobot.fire()
    println(firingRobot2.modelYear)

    val firingRobot3 = FiringRobot("Wax", "2025")


}