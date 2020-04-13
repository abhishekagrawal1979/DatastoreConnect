package com.abhi.datastoreconnect.datastore

import com.google.cloud.datastore.DatastoreException

class DatastoreConnectivity {

    fun checkConnectivity() {
        try {
            val lds = LocalDatastore()
            val namespaces= lds.getDatastoreData("__namespace__","","")
            println("Your connectivity to the datastore has been checked and you are connected to ${System.getenv("DATASTORE_EMMULATOR_HOST")}")
        } catch (e: DatastoreException) {
            println(e)
        }

    }

}