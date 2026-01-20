// File generated from our OpenAPI spec by Stainless.

package com.jd_project.api.models.st000re

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.jd_project.api.core.JsonValue
import com.jd_project.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class St000reListInventoryResponseTest {

    @Test
    fun create() {
        val st000reListInventoryResponse =
            St000reListInventoryResponse.builder()
                .putAdditionalProperty("foo", JsonValue.from(0))
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val st000reListInventoryResponse =
            St000reListInventoryResponse.builder()
                .putAdditionalProperty("foo", JsonValue.from(0))
                .build()

        val roundtrippedSt000reListInventoryResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(st000reListInventoryResponse),
                jacksonTypeRef<St000reListInventoryResponse>(),
            )

        assertThat(roundtrippedSt000reListInventoryResponse).isEqualTo(st000reListInventoryResponse)
    }
}
