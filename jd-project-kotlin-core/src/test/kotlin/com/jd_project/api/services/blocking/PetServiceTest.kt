// File generated from our OpenAPI spec by Stainless.

package com.jd_project.api.services.blocking

import com.jd_project.api.client.okhttp.JdProjectOkHttpClient
import com.jd_project.api.models.pets.Category
import com.jd_project.api.models.pets.Pet
import com.jd_project.api.models.pets.PetFindByStatusParams
import com.jd_project.api.models.pets.PetFindByTagsParams
import com.jd_project.api.models.pets.PetUpdateByIdParams
import com.jd_project.api.models.pets.PetUploadImageParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PetServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = JdProjectOkHttpClient.builder().apiKey("My API Key").build()
        val petService = client.pets()

        val pet =
            petService.create(
                Pet.builder()
                    .name("take five")
                    .addPhotoUrl("take five")
                    .id(1L)
                    .category(Category.builder().id(1L).name("take five").build())
                    .status(Pet.Status.AVAILABLE)
                    .addTag(Pet.Tag.builder().id(1L).name("take five").build())
                    .build()
            )

        pet.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = JdProjectOkHttpClient.builder().apiKey("My API Key").build()
        val petService = client.pets()

        val pet = petService.retrieve(0L)

        pet.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = JdProjectOkHttpClient.builder().apiKey("My API Key").build()
        val petService = client.pets()

        val pet =
            petService.update(
                Pet.builder()
                    .name("take five")
                    .addPhotoUrl("take five")
                    .id(1L)
                    .category(Category.builder().id(1L).name("take five").build())
                    .status(Pet.Status.AVAILABLE)
                    .addTag(Pet.Tag.builder().id(1L).name("take five").build())
                    .build()
            )

        pet.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = JdProjectOkHttpClient.builder().apiKey("My API Key").build()
        val petService = client.pets()

        petService.delete(0L)
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun findByStatus() {
        val client = JdProjectOkHttpClient.builder().apiKey("My API Key").build()
        val petService = client.pets()

        val pets =
            petService.findByStatus(
                PetFindByStatusParams.builder()
                    .status(PetFindByStatusParams.Status.AVAILABLE)
                    .build()
            )

        pets.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun findByTags() {
        val client = JdProjectOkHttpClient.builder().apiKey("My API Key").build()
        val petService = client.pets()

        val pets = petService.findByTags(PetFindByTagsParams.builder().addTag("string").build())

        pets.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateById() {
        val client = JdProjectOkHttpClient.builder().apiKey("My API Key").build()
        val petService = client.pets()

        petService.updateById(
            PetUpdateByIdParams.builder().petId(0L).name("name").status("status").build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun uploadImage() {
        val client = JdProjectOkHttpClient.builder().apiKey("My API Key").build()
        val petService = client.pets()

        val response =
            petService.uploadImage(
                PetUploadImageParams.builder()
                    .petId(0L)
                    .additionalMetadata("additionalMetadata")
                    .image("some content")
                    .build()
            )

        response.validate()
    }
}
