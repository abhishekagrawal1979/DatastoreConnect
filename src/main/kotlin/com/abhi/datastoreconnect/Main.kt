package com.abhi.datastoreconnect
import com.abhi.datastoreconnect.datastore.DatastoreConnectivity
import com.abhi.datastoreconnect.datastore.Namespace
import com.google.cloud.datastore.DatastoreOptions
import java.lang.Exception

fun main(){

    val dataStore = DatastoreOptions.newBuilder()
        .build().service

    val dc =  DatastoreConnectivity(dataStore)
    dc.checkConnectivity()

    println(Options.PleaseSelect.description)
    println("${Options.Namespace.options.get(2)}. ${Options.Namespace.description}")
    println("${Options.Kind.options.get(3)}. ${Options.Kind.description}")
    println("${Options.Entity.options.get(4)}. ${Options.Entity.description}")

   print("Please enter the numerical choice here: ..")

    val i:Int=0
    while (i == 0) {
        try {
            val choice = readLine()
            val selectedChice = choice!!.toInt()
            println("selected choice is $selectedChice")
            println(selectedChice)
            val ns=Namespace(dataStore)

            ns.getAll()
            break
        } catch (e: Exception) {
            println("Invalid choice!! Please enter numeric value.")
            continue
        }
    }
    val b= readLine()
    println(b)
}