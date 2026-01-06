// File generated from our OpenAPI spec by Stainless.

package com.jd_project.api.client

import com.jd_project.api.core.ClientOptions
import com.jd_project.api.core.getPackageVersion
import com.jd_project.api.services.async.PetServiceAsync
import com.jd_project.api.services.async.PetServiceAsyncImpl
import com.jd_project.api.services.async.St0reServiceAsync
import com.jd_project.api.services.async.St0reServiceAsyncImpl
import com.jd_project.api.services.async.UserServiceAsync
import com.jd_project.api.services.async.UserServiceAsyncImpl

class JdProjectClientAsyncImpl(private val clientOptions: ClientOptions) : JdProjectClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Kotlin ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: JdProjectClient by lazy { JdProjectClientImpl(clientOptions) }

    private val withRawResponse: JdProjectClientAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val pets: PetServiceAsync by lazy { PetServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val st0re: St0reServiceAsync by lazy {
        St0reServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val users: UserServiceAsync by lazy { UserServiceAsyncImpl(clientOptionsWithUserAgent) }

    override fun sync(): JdProjectClient = sync

    override fun withRawResponse(): JdProjectClientAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): JdProjectClientAsync =
        JdProjectClientAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun pets(): PetServiceAsync = pets

    override fun st0re(): St0reServiceAsync = st0re

    override fun users(): UserServiceAsync = users

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        JdProjectClientAsync.WithRawResponse {

        private val pets: PetServiceAsync.WithRawResponse by lazy {
            PetServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val st0re: St0reServiceAsync.WithRawResponse by lazy {
            St0reServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val users: UserServiceAsync.WithRawResponse by lazy {
            UserServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): JdProjectClientAsync.WithRawResponse =
            JdProjectClientAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun pets(): PetServiceAsync.WithRawResponse = pets

        override fun st0re(): St0reServiceAsync.WithRawResponse = st0re

        override fun users(): UserServiceAsync.WithRawResponse = users
    }
}
