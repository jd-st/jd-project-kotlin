// File generated from our OpenAPI spec by Stainless.

package com.jd_project.api.models.st00000re.orders

import com.jd_project.api.models.Order
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrderCreateParamsTest {

    @Test
    fun create() {
        OrderCreateParams.builder()
            .order(
                Order.builder()
                    .id(1L)
                    .complete(true)
                    .petId(1L)
                    .quantity(1)
                    .shipDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status(Order.Status.PLACED)
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            OrderCreateParams.builder()
                .order(
                    Order.builder()
                        .id(1L)
                        .complete(true)
                        .petId(1L)
                        .quantity(1)
                        .shipDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(Order.Status.PLACED)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                Order.builder()
                    .id(1L)
                    .complete(true)
                    .petId(1L)
                    .quantity(1)
                    .shipDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status(Order.Status.PLACED)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = OrderCreateParams.builder().build()

        val body = params._body()
    }
}
