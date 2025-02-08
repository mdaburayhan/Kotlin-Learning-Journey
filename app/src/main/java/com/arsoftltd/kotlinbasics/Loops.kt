package com.arsoftltd.kotlinbasics

fun main(){
    // Loops: used to repeat a block of code multiple times

    // for Loop: defined starting and ending points
    for (i in 1..5){
        println(i)
    }

    // while Loop: repeats a block of code as long as a specified condition is 'true'
    var count = 1;
    while (count<=5){
        println("Count: $count")
        count++
    }

    // do-while Loop: it guarantees that the loop body is
    // executed at least once because the condition is checked
    // after the loop body

    var x = 6
    do {
        println("This will be printed at least once..")
        x++
    }while (x < 5)


}