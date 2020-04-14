package com.abhi.datastoreconnect.datastore

import com.google.cloud.datastore.*
import io.mockk.every
import org.junit.jupiter.api.Test
import io.mockk.mockk
import io.mockk.mockkStatic
import io.mockk.verify
import java.util.ArrayList


class DatastoreRepositoryTests {

    @Test
    fun `this is a getNamespace test`(){
        val mockDatastoreRepository = mockk(Datas)
 //       val mockDatastoreRepository = mockk<DatastoreRepository>()
        val query: Query<Key> = Query.newKeyQueryBuilder()
            .setKind("__namespace__")
            .build()

        every { mockDatastoreRepository.getNamespaceData("__namespace__","","")} returns ArrayList<String>("Abhinamespace", "Satishnamespace")

        verify { mockDatastoreRepository.run(query)}

    }

}