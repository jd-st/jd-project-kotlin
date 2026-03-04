// File generated from our OpenAPI spec by Stainless.

package com.jd_project.api.services.blocking

import com.jd_project.api.core.ClientOptions
import com.jd_project.api.core.RequestOptions
import com.jd_project.api.core.handlers.errorBodyHandler
import com.jd_project.api.core.handlers.errorHandler
import com.jd_project.api.core.handlers.jsonHandler
import com.jd_project.api.core.http.HttpMethod
import com.jd_project.api.core.http.HttpRequest
import com.jd_project.api.core.http.HttpResponse
import com.jd_project.api.core.http.HttpResponse.Handler
import com.jd_project.api.core.http.HttpResponseFor
import com.jd_project.api.core.http.parseable
import com.jd_project.api.core.prepare
import com.jd_project.api.models.st00000re.St00000reListInventoryParams
import com.jd_project.api.models.st00000re.St00000reListInventoryResponse
import com.jd_project.api.services.blocking.st00000re.OrderService
import com.jd_project.api.services.blocking.st00000re.OrderServiceImpl

/** Access to Petstore orders */
class St00000reServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    St00000reService {

    private val withRawResponse: St00000reService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val orders: OrderService by lazy { OrderServiceImpl(clientOptions) }

    override fun withRawResponse(): St00000reService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): St00000reService =
        St00000reServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    /** Access to Petstore orders */
    override fun orders(): OrderService = orders

    override fun listInventory(
        params: St00000reListInventoryParams,
        requestOptions: RequestOptions,
    ): St00000reListInventoryResponse =
        // get /st00000re/inventory
        withRawResponse().listInventory(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        St00000reService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val orders: OrderService.WithRawResponse by lazy {
            OrderServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): St00000reService.WithRawResponse =
            St00000reServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        /** Access to Petstore orders */
        override fun orders(): OrderService.WithRawResponse = orders

        private val listInventoryHandler: Handler<St00000reListInventoryResponse> =
            jsonHandler<St00000reListInventoryResponse>(clientOptions.jsonMapper)

        override fun listInventory(
            params: St00000reListInventoryParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<St00000reListInventoryResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("st00000re", "inventory")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listInventoryHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
