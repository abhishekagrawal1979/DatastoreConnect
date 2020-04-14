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
     val query: Query<Key> = Query.newKeyQueryBuilder()
            .setKind("__namespace__")
            .build()


        every { mockLocalDatastore.getDatastoreData2(query,"__namespace__","","")} returns ArrayList()

        verify { mockDatastore.run(query)}

    }

}