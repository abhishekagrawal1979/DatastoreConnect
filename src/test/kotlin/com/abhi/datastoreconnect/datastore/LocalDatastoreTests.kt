package com.abhi.datastoreconnect.datastore

import com.google.cloud.datastore.*
import io.mockk.every
import org.junit.jupiter.api.Test
import io.mockk.mockk
import io.mockk.mockkStatic
import io.mockk.verify
import jdk.internal.dynalink.beans.StaticClass
import java.util.ArrayList


class LocalDatastoreTests {

    @Test
    fun `this is a test test`(){

        val mockLocalDatastore = mockk<LocalDatastore>()

        val mockDatastore = mockk<Datastore>()
//        val query: Query<Key> = Query.newKeyQueryBuilder()
//            .setKind("__namespace__")
//            .build()
//        val mockDatastoreOptions = mockk< DatastoreOptions>()
////        val mockDatastoreOptions2 =  mockDatastoreOptions.toBuilder().build().service
//
//
//        val mockKey = mockk<Key>()
        val mockQuery = mockk<Query<Key>>()
//        val keyQ = mockk<KeyQuery>()
//
//    val mockBuilder = mockkStatic(com.google.datastore.v1.client.DatastoreOptions.Builder()<>)
//
//    every { DatastoreOptions.newBuilder().build().service } returns mockDatastoreOptions.toBuilder().build().service
//
//        every { Query.newKeyQueryBuilder().setKind("__namespace__").build() } returns keyQ.toBuilder().setKind("__namespace__").build()
////
////
        val query: Query<Key> = Query.newKeyQueryBuilder()
            .setKind("__namespace__")
            .build()

        every { mockLocalDatastore.getDatastoreData2(mockDatastore,query,"__namespace__","","")  } returns arrayListOf("ssss")
        every { mockDatastore.run(query)} returns mockk()


        mockLocalDatastore.getDatastoreData2(mockDatastore,query,"__namespace__","","")
//
        verify { mockDatastore.run(query)}
//
    }

}