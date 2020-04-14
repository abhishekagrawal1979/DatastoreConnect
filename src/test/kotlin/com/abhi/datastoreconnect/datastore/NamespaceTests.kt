package com.abhi.datastoreconnect.datastore

import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Test


class NamespaceTests {

    @Test
    fun `this is a getNamespace test`() {

        val mockDatastoreRepository = mockk<DatastoreRepository>()

        every { mockDatastoreRepository.getMetadataList("__namespace__", "", "") } returns arrayListOf(
            "Abhinamespace",
            "Satishnamespace"
        )
        val objNamespace = Namespace()

        objNamespace.getAll()
        verify { mockDatastoreRepository.getMetadataList("__namespace__", "", "") }

    }

}