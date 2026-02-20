// File generated from our OpenAPI spec by Stainless.

package com.jd_project.api.services.async

import com.jd_project.api.client.okhttp.JdProjectOkHttpClientAsync
import com.jd_project.api.models.users.User
import com.jd_project.api.models.users.UserLoginParams
import com.jd_project.api.models.users.UserUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UserServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun create() {
        val client = JdProjectOkHttpClientAsync.builder().apiKey("My API Key").build()
        val userServiceAsync = client.users()

        val user =
            userServiceAsync.create(
                User.builder()
                    .id(1L)
                    .email("take five")
                    .firstName("take five")
                    .lastName("take five")
                    .password("take five")
                    .phone("take five")
                    .username("take five")
                    .userStatus(1)
                    .build()
            )

        user.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun retrieve() {
        val client = JdProjectOkHttpClientAsync.builder().apiKey("My API Key").build()
        val userServiceAsync = client.users()

        val user = userServiceAsync.retrieve("username")

        user.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun update() {
        val client = JdProjectOkHttpClientAsync.builder().apiKey("My API Key").build()
        val userServiceAsync = client.users()

        userServiceAsync.update(
            UserUpdateParams.builder()
                .existingUsername("username")
                .user(
                    User.builder()
                        .id(1L)
                        .email("take five")
                        .firstName("take five")
                        .lastName("take five")
                        .password("take five")
                        .phone("take five")
                        .username("take five")
                        .userStatus(1)
                        .build()
                )
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun delete() {
        val client = JdProjectOkHttpClientAsync.builder().apiKey("My API Key").build()
        val userServiceAsync = client.users()

        userServiceAsync.delete("username")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun createWithList() {
        val client = JdProjectOkHttpClientAsync.builder().apiKey("My API Key").build()
        val userServiceAsync = client.users()

        val user =
            userServiceAsync.createWithList(
                listOf(
                    User.builder()
                        .id(1L)
                        .email("take five")
                        .firstName("take five")
                        .lastName("take five")
                        .password("take five")
                        .phone("take five")
                        .username("take five")
                        .userStatus(1)
                        .build()
                )
            )

        user.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun login() {
        val client = JdProjectOkHttpClientAsync.builder().apiKey("My API Key").build()
        val userServiceAsync = client.users()

        userServiceAsync.login(
            UserLoginParams.builder().password("password").username("username").build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun logout() {
        val client = JdProjectOkHttpClientAsync.builder().apiKey("My API Key").build()
        val userServiceAsync = client.users()

        userServiceAsync.logout()
    }
}
