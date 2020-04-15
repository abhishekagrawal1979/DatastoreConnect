package com.abhi.datastoreconnect.datastore

import com.google.cloud.datastore.Datastore
import com.google.cloud.datastore.Key
import com.google.cloud.datastore.Query
import com.google.cloud.datastore.QueryResults
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Test

class DatastoreRepositoryTests() {
    @Test
    fun `this is a getNamespace test`() {

        val mockDatastore = mockk<Datastore>()
        val objDatastoreRepository =DatastoreRepository(mockDatastore)
        val query: Query<Key> = Query.newKeyQueryBuilder()
            .setKind("__namespace__")
            .build()

        val mockQueryResults = mockk<QueryResults<Key>>()
        every { mockDatastore.run(query) } returns mockQueryResults
        every { mockQueryResults.hasNext() } returns true
        every { mockQueryResults.next().name } returns "chintu"

        objDatastoreRepository.getMetadataList("__namespace__", "", "")
       verify { mockDatastore.run(query) }

    }
}