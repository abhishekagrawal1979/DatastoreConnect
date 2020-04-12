package com.abhi.datastoreconnect

import com.abhi.datastoreconnect.datastore.checkConnectivity
import java.lang.Exception

fun main(){
    checkConnectivity()
    println("Please select what you want to deal with!!")
    println("1. Namespace")
    println("2. Kind")
    println("3. Entity")

    val a= print("Please enter the numerical choice here: ")
    val i:Int=0
    while (i == 0) {
        try {
            val choice = readLine()
            val selectedChice = choice!!.toInt()
            println("selected choice is $selectedChice")
            break
        } catch (e: Exception) {
            println("Please enter numeric")
            continue
        }
    }
    println(a)
    val b= readLine()
    println(b)
}