package com.abhi.datastoreconnect

import java.lang.Exception

fun main(){

    println("Please select what you want to deal with!!")
    println("1. Namespace")
    println("2. Kind")
    println("3. Entity")

    val a= print("Please enter the choice here: ")
    val choice = readLine()
    try {
        val selectedChice = choice!!.toInt()
        println("selected choice is $selectedChice")
    }
    catch (e : Exception){
        println("Please enter numeric")

    }

    println(a)
    val b= readLine()
    println(b)
}