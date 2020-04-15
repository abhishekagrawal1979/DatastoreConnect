package com.abhi.datastoreconnect.datastore

import com.abhi.datastoreconnect.Options
import com.google.cloud.datastore.Datastore

class Namespace(val datastore:Datastore) :INamespace {

    override fun showOptions(){
        println("${Options.Namespace.options.get(1)}. ${Options.Namespace.description}")
        println("${Options.Kind.options.get(1)}. ${Options.Kind.description}")
        println("${Options.Entity.options.get(1)}. ${Options.Entity.description}")
    }

    override fun getAll() {
        val lds = DatastoreRepository(datastore)

        val namespaces= lds.getMetadataList("__namespace__","","")
        println(namespaces)
    }
     fun getAll2() {
        val lds = DatastoreRepository(datastore)

        val namespaces= lds.getMetadataList("","","")
        println(namespaces)
    }
}