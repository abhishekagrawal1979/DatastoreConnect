package com.abhi.datastoreconnect.datastore

import com.google.cloud.datastore.*
import java.util.ArrayList

class DatastoreRepository {

    fun getMetadataList(kind:String,namespace:String,entity:String):ArrayList<String> {
       val dataStore = DatastoreOptions.newBuilder()
            .build().service
        val query: Query<Key> = Query.newKeyQueryBuilder()
            .setKind(kind)
            .build()
        val metadatalist = ArrayList<String>()
        val results = dataStore.run(query)
        while (results.hasNext()) {
            metadatalist.add(results.next().name)
        }
        return metadatalist
    }
}