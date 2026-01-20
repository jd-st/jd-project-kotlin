// File generated from our OpenAPI spec by Stainless.

package com.jd_project.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.jd_project.api.core.ClientOptions
import com.jd_project.api.core.RequestOptions
import com.jd_project.api.core.http.HttpResponseFor
import com.jd_project.api.models.st000re.St000reListInventoryParams
import com.jd_project.api.models.st000re.St000reListInventoryResponse
import com.jd_project.api.services.async.st000re.OrderServiceAsync

interface St000reServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): St000reServiceAsync

    fun orders(): OrderServiceAsync

    /** Returns a map of status codes to quantities */
    suspend fun listInventory(
        params: St000reListInventoryParams = St000reListInventoryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): St000reListInventoryResponse

    /** @see listInventory */
    suspend fun listInventory(requestOptions: RequestOptions): St000reListInventoryResponse =
        listInventory(St000reListInventoryParams.none(), requestOptions)

    /**
     * A view of [St000reServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): St000reServiceAsync.WithRawResponse

        fun orders(): OrderServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /st000re/inventory`, but is otherwise the same as
         * [St000reServiceAsync.listInventory].
         */
        @MustBeClosed
        suspend fun listInventory(
            params: St000reListInventoryParams = St000reListInventoryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<St000reListInventoryResponse>

        /** @see listInventory */
        @MustBeClosed
        suspend fun listInventory(
            requestOptions: RequestOptions
        ): HttpResponseFor<St000reListInventoryResponse> =
            listInventory(St000reListInventoryParams.none(), requestOptions)
    }
}
