package com.abhi.datastoreconnect.datastore

import com.abhi.datastoreconnect.Options

class Namespace :INamespace {

    override fun showOptions(){
        println("${Options.Namespace.options.get(1)}. ${Options.Namespace.description}")
        println("${Options.Kind.options.get(1)}. ${Options.Kind.description}")
        println("${Options.Entity.options.get(1)}. ${Options.Entity.description}")
    }

    override fun getAll() {
        val lds = LocalDatastore()
        val namespaces= lds.getDatastoreData("__namespace__","","")
        println(namespaces)
    }

}