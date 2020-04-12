package com.abhi.datastoreconnect.datastore

import com.google.cloud.datastore.*
import java.util.ArrayList


fun checkConnectivity(){
        try {
            val dataStore = DatastoreOptions.newBuilder()
                    .build().service
            val query: Query<Key> = Query.newKeyQueryBuilder()
                    .setKind("__namespace__")
                    .build()

            val namespaces = ArrayList<String>();
            val results = dataStore.run(query);
            while (results.hasNext()) {
                namespaces.add(results.next().getName());
            }
            print(namespaces)
        } catch (e: DatastoreException) {
            println(e)
        }

    }

