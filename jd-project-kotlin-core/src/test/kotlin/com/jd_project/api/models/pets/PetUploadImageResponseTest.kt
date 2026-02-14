// File generated from our OpenAPI spec by Stainless.

package com.jd_project.api.models.pets

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.jd_project.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PetUploadImageResponseTest {

    @Test
    fun create() {
        val petUploadImageResponse =
            PetUploadImageResponse.builder().code(1).message("take five").type("take five").build()

        assertThat(petUploadImageResponse.code()).isEqualTo(1)
        assertThat(petUploadImageResponse.message()).isEqualTo("take five")
        assertThat(petUploadImageResponse.type()).isEqualTo("take five")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val petUploadImageResponse =
            PetUploadImageResponse.builder().code(1).message("take five").type("take five").build()

        val roundtrippedPetUploadImageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(petUploadImageResponse),
                jacksonTypeRef<PetUploadImageResponse>(),
            )

        assertThat(roundtrippedPetUploadImageResponse).isEqualTo(petUploadImageResponse)
    }
}
