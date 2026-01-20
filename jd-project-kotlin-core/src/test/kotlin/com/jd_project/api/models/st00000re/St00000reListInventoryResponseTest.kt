// File generated from our OpenAPI spec by Stainless.

package com.jd_project.api.models.st00000re

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.jd_project.api.core.JsonValue
import com.jd_project.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class St00000reListInventoryResponseTest {

    @Test
    fun create() {
        val st00000reListInventoryResponse =
            St00000reListInventoryResponse.builder()
                .putAdditionalProperty("foo", JsonValue.from(0))
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val st00000reListInventoryResponse =
            St00000reListInventoryResponse.builder()
                .putAdditionalProperty("foo", JsonValue.from(0))
                .build()

        val roundtrippedSt00000reListInventoryResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(st00000reListInventoryResponse),
                jacksonTypeRef<St00000reListInventoryResponse>(),
            )

        assertThat(roundtrippedSt00000reListInventoryResponse)
            .isEqualTo(st00000reListInventoryResponse)
    }
}
