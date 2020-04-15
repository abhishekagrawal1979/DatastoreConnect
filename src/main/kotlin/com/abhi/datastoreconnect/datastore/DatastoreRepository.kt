package com.abhi.datastoreconnect.datastore

import com.google.cloud.datastore.*
import java.util.ArrayList

class DatastoreRepository(val datastore: Datastore) {

    fun getMetadataList(kind:String,namespace:String,entity:String):ArrayList<String> {

        val query: Query<Key> = Query.newKeyQueryBuilder()
            .setKind(kind)
            .build()
        val metadatalist = ArrayList<String>()
        val results = datastore.run(query)
        var i =0
        while (results.hasNext()) {
            metadatalist.add(results.next().name)
            i+=1
            if(i>10) break
        }
        print(metadatalist)
        return metadatalist
    }
}