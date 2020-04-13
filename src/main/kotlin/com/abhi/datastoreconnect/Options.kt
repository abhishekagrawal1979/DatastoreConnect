package com.abhi.datastoreconnect

enum class Options (val options: Map< Int,Int>, val description: String){
    PleaseSelect(mapOf(1 to 1),"Please select what you want to deal with!!"),
    Namespace(mapOf(2 to 1),"Namespace"),
    Kind(mapOf(3 to 2),"Kind"),
    Entity(mapOf(4 to 3),"Entity"),

    NamespaceChoices(mapOf(5 to 1),"Please "),
    CreateNamespaceChoices(mapOf(6 to 1),"Create namespace ")

}