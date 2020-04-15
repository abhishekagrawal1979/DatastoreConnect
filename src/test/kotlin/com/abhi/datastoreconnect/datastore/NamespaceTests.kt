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
        val mocknamespace=mockk<Namespace>()
        val mockDatastoreRepository = mockk<DatastoreRepository>()


        every { mockDatastoreRepository.getMetadataList("__namespace__", "", "") } returns arrayListOf(
            "Abhinamespace",
            "Satishnamespace"
        )

        every { mockDatastoreRepository.getMetadataList("", "", "") } returns arrayListOf(
            "Abhinamespace",
            "Satishnamespace"
        )

        every { mocknamespace.getAll2("Abhishek") } returns "Satish"

      mockDatastoreRepository.getMetadataList("__namespace__", "", "")
        every { mockDatastoreRepository.getMetadataList("__namespace__", "", "") } returns arrayListOf(
            "Abhinamespace",
            "Satishnamespace"
        )

//        every { mockDatastore.run(query) } returns mockQueryResults


//        println(DatastoreRepository(mockDatastore).getMetadataList("__namespace__", "", ""))

//        objNamespace.getAll()
        val b =objNamespace.getAll2("Abhishek")
        println(b)
        verify { mockDatastoreRepository.getMetadataList("__namespace__", "", "") }

    }
}
