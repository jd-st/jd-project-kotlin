// File generated from our OpenAPI spec by Stainless.

package com.jd_project.api.services.async

import com.jd_project.api.client.okhttp.JdProjectOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class St00000reServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun listInventory() {
        val client = JdProjectOkHttpClientAsync.builder().apiKey("My API Key").build()
        val st00000reServiceAsync = client.st00000re()

        val response = st00000reServiceAsync.listInventory()

        response.validate()
    }
}
