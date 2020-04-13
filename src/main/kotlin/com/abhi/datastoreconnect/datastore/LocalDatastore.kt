package com.abhi.datastoreconnect.datastore

import com.google.cloud.datastore.Datastore
import com.google.cloud.datastore.DatastoreOptions
import com.google.cloud.datastore.Key
import com.google.cloud.datastore.Query
import java.util.ArrayList

class LocalDatastore {

    fun getDatastoreData(kind:String,namespace:String,entity:String):ArrayList<String> {
        val dataStore = DatastoreOptions.newBuilder()
            .build().service
        val query: Query<Key> = Query.newKeyQueryBuilder()
            .setKind("__namespace__")
            .build()
        val namespaces = ArrayList<String>()
        val results = dataStore.run(query)
        while (results.hasNext()) {
            namespaces.add(results.next().name)
        }
        return namespaces
    }

    fun getDatastoreData2(ds:Datastore,qr:Query<Key>,kind:String,namespace:String,entity:String):ArrayList<String> {


        val namespaces = ArrayList<String>()
        val results = ds.run(qr)
        while (results.hasNext()) {
            namespaces.add(results.next().name)
        }
        return namespaces
    }
}