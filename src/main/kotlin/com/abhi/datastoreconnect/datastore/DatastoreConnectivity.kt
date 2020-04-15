package com.abhi.datastoreconnect.datastore

import com.google.cloud.datastore.Datastore
import com.google.cloud.datastore.DatastoreException

class DatastoreConnectivity (val datastore:Datastore){

    fun checkConnectivity() {
        try {
            val lds = DatastoreRepository(datastore)
            val namespaces= lds.getMetadataList("__namespace__","","")
            println("Your connectivity to the datastore has been checked and you are connected to ${System.getenv("DATASTORE_EMMULATOR_HOST")}")
        } catch (e: DatastoreException) {
            println(e)
        }

    }

}