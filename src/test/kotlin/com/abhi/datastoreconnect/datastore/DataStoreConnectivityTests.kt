package com.abhi.datastoreconnect.datastore

import com.google.cloud.datastore.Datastore
import com.google.cloud.datastore.Query
import io.mockk.every
import org.junit.jupiter.api.Test
import io.mockk.mockk
import com.abhi.datastoreconnect.datastore.checkConnectivity

class DataStoreConnectivityTests {

    @Test
    fun `this is a test test`(){
        val dataStore = mockk<Datastore>()
        val query=Query.newEntityQueryBuilder().setKind(mockk("test")).build()
        val results=dataStore.run(query)
        every { dataStore.run(query) } returns results
        checkConnectivity()
    }

}