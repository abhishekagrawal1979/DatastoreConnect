package com.abhi.datastoreconnect.datastore

import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Test

class DatastoreRepositoryTests() {
    @Test
    fun `this is a getNamespace test`() {

        val mockDatastoreRepository = mockk<DatastoreRepository>()
//        val mockNamespace = mockk<Namespace>()
        every { mockDatastoreRepository.getMetadataList("__namespace__", "", "") } returns arrayListOf(
            "Abhinamespace",
            "Satishnamespace"
        )
        val objNamespace = Namespace()

        every { objNamespace.getAll() } returns Unit
        mockDatastoreRepository.getMetadataList("__namespace__", "", "")
        objNamespace.getAll()

        verify { mockDatastoreRepository.getMetadataList("__namespace__", "", "") }

    }
}