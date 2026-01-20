// File generated from our OpenAPI spec by Stainless.

package com.jd_project.api.client

import com.jd_project.api.core.ClientOptions
import com.jd_project.api.core.getPackageVersion
import com.jd_project.api.services.blocking.PetService
import com.jd_project.api.services.blocking.PetServiceImpl
import com.jd_project.api.services.blocking.St00000reService
import com.jd_project.api.services.blocking.St00000reServiceImpl
import com.jd_project.api.services.blocking.UserService
import com.jd_project.api.services.blocking.UserServiceImpl

class JdProjectClientImpl(private val clientOptions: ClientOptions) : JdProjectClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Kotlin ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: JdProjectClientAsync by lazy { JdProjectClientAsyncImpl(clientOptions) }

    private val withRawResponse: JdProjectClient.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val pets: PetService by lazy { PetServiceImpl(clientOptionsWithUserAgent) }

    private val st00000re: St00000reService by lazy {
        St00000reServiceImpl(clientOptionsWithUserAgent)
    }

    private val users: UserService by lazy { UserServiceImpl(clientOptionsWithUserAgent) }

    override fun async(): JdProjectClientAsync = async

    override fun withRawResponse(): JdProjectClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): JdProjectClient =
        JdProjectClientImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun pets(): PetService = pets

    override fun st00000re(): St00000reService = st00000re

    override fun users(): UserService = users

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        JdProjectClient.WithRawResponse {

        private val pets: PetService.WithRawResponse by lazy {
            PetServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val st00000re: St00000reService.WithRawResponse by lazy {
            St00000reServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val users: UserService.WithRawResponse by lazy {
            UserServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): JdProjectClient.WithRawResponse =
            JdProjectClientImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun pets(): PetService.WithRawResponse = pets

        override fun st00000re(): St00000reService.WithRawResponse = st00000re

        override fun users(): UserService.WithRawResponse = users
    }
}
