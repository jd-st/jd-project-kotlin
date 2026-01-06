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
import com.jd_project.api.models.st0re.St0reListInventoryParams
import com.jd_project.api.models.st0re.St0reListInventoryResponse
import com.jd_project.api.services.blocking.st0re.OrderService
import com.jd_project.api.services.blocking.st0re.OrderServiceImpl

class St0reServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    St0reService {

    private val withRawResponse: St0reService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val orders: OrderService by lazy { OrderServiceImpl(clientOptions) }

    override fun withRawResponse(): St0reService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): St0reService =
        St0reServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun orders(): OrderService = orders

    override fun listInventory(
        params: St0reListInventoryParams,
        requestOptions: RequestOptions,
    ): St0reListInventoryResponse =
        // get /st0re/inventory
        withRawResponse().listInventory(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        St0reService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val orders: OrderService.WithRawResponse by lazy {
            OrderServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): St0reService.WithRawResponse =
            St0reServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        override fun orders(): OrderService.WithRawResponse = orders

        private val listInventoryHandler: Handler<St0reListInventoryResponse> =
            jsonHandler<St0reListInventoryResponse>(clientOptions.jsonMapper)

        override fun listInventory(
            params: St0reListInventoryParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<St0reListInventoryResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("st0re", "inventory")
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
