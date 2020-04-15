package com.abhi.datastoreconnect.datastore

import com.google.cloud.datastore.Datastore
import com.google.cloud.datastore.DatastoreOptions
import com.google.cloud.datastore.Entity
import io.mockk.every
import io.mockk.mockk
import io.mockk.spyk
import io.mockk.verify
import org.junit.jupiter.api.Test


class NamespaceTests {

    @Test
    fun `this is a getNamespace test`() {
        val mockDatastore = mockk<Datastore>()
        val objNamespace = Namespace(mockDatastore)
        val mockDatastoreRepository = mockk<DatastoreRepository>()

//
//        every { mockDatastoreRepository.getMetadataList("__namespace__", "", "") } returns arrayListOf(
//            "Abhinamespace",
//            "Satishnamespace"
//        )

        every { mockDatastoreRepository.getMetadataList("", "", "") } returns arrayListOf(
            "Abhinamespace",
            "Satishnamespace"
        )

//        mockDatastoreRepository.getMetadataList("__namespace__", "", "")
        every { DatastoreRepository(mockDatastore).getMetadataList("__namespace__", "", "") } returns arrayListOf(
            "Abhinamespace",
            "Satishnamespace"
        )

//        println(DatastoreRepository(mockDatastore).getMetadataList("__namespace__", "", ""))

        objNamespace.getAll2()
        verify { mockDatastoreRepository.getMetadataList("", "", "") }

    }
}
