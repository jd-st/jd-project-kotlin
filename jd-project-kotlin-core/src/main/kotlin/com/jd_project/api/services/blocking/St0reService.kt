// File generated from our OpenAPI spec by Stainless.

package com.jd_project.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.jd_project.api.core.ClientOptions
import com.jd_project.api.core.RequestOptions
import com.jd_project.api.core.http.HttpResponseFor
import com.jd_project.api.models.st0re.St0reListInventoryParams
import com.jd_project.api.models.st0re.St0reListInventoryResponse
import com.jd_project.api.services.blocking.st0re.OrderService

interface St0reService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): St0reService

    fun orders(): OrderService

    /** Returns a map of status codes to quantities */
    fun listInventory(
        params: St0reListInventoryParams = St0reListInventoryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): St0reListInventoryResponse

    /** @see listInventory */
    fun listInventory(requestOptions: RequestOptions): St0reListInventoryResponse =
        listInventory(St0reListInventoryParams.none(), requestOptions)

    /** A view of [St0reService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): St0reService.WithRawResponse

        fun orders(): OrderService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /st0re/inventory`, but is otherwise the same as
         * [St0reService.listInventory].
         */
        @MustBeClosed
        fun listInventory(
            params: St0reListInventoryParams = St0reListInventoryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<St0reListInventoryResponse>

        /** @see listInventory */
        @MustBeClosed
        fun listInventory(
            requestOptions: RequestOptions
        ): HttpResponseFor<St0reListInventoryResponse> =
            listInventory(St0reListInventoryParams.none(), requestOptions)
    }
}
