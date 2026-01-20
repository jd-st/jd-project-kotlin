// File generated from our OpenAPI spec by Stainless.

package com.jd_project.api.services.blocking

import com.jd_project.api.TestServerExtension
import com.jd_project.api.client.okhttp.JdProjectOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class St00000reServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun listInventory() {
        val client =
            JdProjectOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val st00000reService = client.st00000re()

        val response = st00000reService.listInventory()

        response.validate()
    }
}
