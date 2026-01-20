// File generated from our OpenAPI spec by Stainless.

package com.jd_project.api.services.async

import com.jd_project.api.TestServerExtension
import com.jd_project.api.client.okhttp.JdProjectOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class St000reServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun listInventory() {
        val client =
            JdProjectOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val st000reServiceAsync = client.st000re()

        val response = st000reServiceAsync.listInventory()

        response.validate()
    }
}
