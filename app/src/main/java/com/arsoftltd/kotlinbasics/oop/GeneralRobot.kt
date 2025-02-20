package com.arsoftltd.kotlinbasics.oop

open class GeneralRobot() {

    var name:String
    var modelYear:String
    // init block: used to execute code when
    // an instance of class is created
    init {
        name = ""
        modelYear = ""
        println("A new robot is created")
    }



    // Secondary Constructors:
    // Initialize objects
    // Provide different sets of parameters
    constructor(name:String, modelYear:String):this(){
        this.name = name
        this.modelYear = modelYear
    }

    // secondary constructor
    constructor(name:String):this(){
        this.name = name
        this.modelYear = "Unknown Model Year"
    }

    fun walk(){
        println("The Robot is Walking now...")
    }
    fun speak(message: String){
        println("$name says: $message")
    }
}