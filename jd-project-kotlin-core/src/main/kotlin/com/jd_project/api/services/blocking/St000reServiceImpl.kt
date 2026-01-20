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
import com.jd_project.api.models.st000re.St000reListInventoryParams
import com.jd_project.api.models.st000re.St000reListInventoryResponse
import com.jd_project.api.services.blocking.st000re.OrderService
import com.jd_project.api.services.blocking.st000re.OrderServiceImpl

class St000reServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    St000reService {

    private val withRawResponse: St000reService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val orders: OrderService by lazy { OrderServiceImpl(clientOptions) }

    override fun withRawResponse(): St000reService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): St000reService =
        St000reServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun orders(): OrderService = orders

    override fun listInventory(
        params: St000reListInventoryParams,
        requestOptions: RequestOptions,
    ): St000reListInventoryResponse =
        // get /st000re/inventory
        withRawResponse().listInventory(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        St000reService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val orders: OrderService.WithRawResponse by lazy {
            OrderServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): St000reService.WithRawResponse =
            St000reServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun orders(): OrderService.WithRawResponse = orders

        private val listInventoryHandler: Handler<St000reListInventoryResponse> =
            jsonHandler<St000reListInventoryResponse>(clientOptions.jsonMapper)

        override fun listInventory(
            params: St000reListInventoryParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<St000reListInventoryResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("st000re", "inventory")
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
