package com.arsoftltd.kotlinbasics

fun main(){
    // Range: interval between 2 values
    /*
    * .. vs. until: Remember that .. creates a closed range (inclusive of both ends),
    *  while until creates a half-open range (excluding the end).
    * Iteration: Ranges are commonly used with for loops to iterate over a sequence of numbers.
    * Flexibility: Ranges are not limited to integers. You can create ranges of characters,
    *  or any other type that implements the Comparable interface.
    * Progression: Ranges are used to create progressions.
    **/

    // Closed Range:    startValue..endValue
    val range = 1..5

    // Half-Open Range:     startValue until endValue
    val range2 = 1 until 5

    // Iterating through a specific range
    for (i in range2){
        println(i)
    }



}