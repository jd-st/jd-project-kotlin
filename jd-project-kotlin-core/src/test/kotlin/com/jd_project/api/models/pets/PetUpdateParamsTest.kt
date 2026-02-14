// File generated from our OpenAPI spec by Stainless.

package com.jd_project.api.models.pets

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PetUpdateParamsTest {

    @Test
    fun create() {
        PetUpdateParams.builder()
            .pet(
                Pet.builder()
                    .name("take five")
                    .addPhotoUrl("take five")
                    .id(1L)
                    .category(Category.builder().id(1L).name("take five").build())
                    .status(Pet.Status.AVAILABLE)
                    .addTag(Pet.Tag.builder().id(1L).name("take five").build())
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            PetUpdateParams.builder()
                .pet(
                    Pet.builder()
                        .name("take five")
                        .addPhotoUrl("take five")
                        .id(1L)
                        .category(Category.builder().id(1L).name("take five").build())
                        .status(Pet.Status.AVAILABLE)
                        .addTag(Pet.Tag.builder().id(1L).name("take five").build())
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                Pet.builder()
                    .name("take five")
                    .addPhotoUrl("take five")
                    .id(1L)
                    .category(Category.builder().id(1L).name("take five").build())
                    .status(Pet.Status.AVAILABLE)
                    .addTag(Pet.Tag.builder().id(1L).name("take five").build())
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PetUpdateParams.builder()
                .pet(Pet.builder().name("take five").addPhotoUrl("take five").build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(Pet.builder().name("take five").addPhotoUrl("take five").build())
    }
}
