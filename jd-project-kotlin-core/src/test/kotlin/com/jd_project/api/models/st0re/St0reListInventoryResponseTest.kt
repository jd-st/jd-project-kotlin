// File generated from our OpenAPI spec by Stainless.

package com.jd_project.api.models.st0re

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.jd_project.api.core.JsonValue
import com.jd_project.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class St0reListInventoryResponseTest {

    @Test
    fun create() {
        val st0reListInventoryResponse =
            St0reListInventoryResponse.builder()
                .putAdditionalProperty("foo", JsonValue.from(0))
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val st0reListInventoryResponse =
            St0reListInventoryResponse.builder()
                .putAdditionalProperty("foo", JsonValue.from(0))
                .build()

        val roundtrippedSt0reListInventoryResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(st0reListInventoryResponse),
                jacksonTypeRef<St0reListInventoryResponse>(),
            )

        assertThat(roundtrippedSt0reListInventoryResponse).isEqualTo(st0reListInventoryResponse)
    }
}
