package com.arsoftltd.kotlinbasics.oop

fun main(){
    // Creating objects from Robot class
    val robot1 : Robot = Robot("Buddy")
    robot1.walk()
    robot1.speak("Hello My Friends")

    val robot2 = Robot("Max")
    robot2.walk()
    robot2.speak("Hello from Robot2")


}
class Robot(val name: String){
    fun walk(){
        println("The Robot is Walking now...")
    }
    fun speak(message: String){
        println("$name says: $message")
    }
}