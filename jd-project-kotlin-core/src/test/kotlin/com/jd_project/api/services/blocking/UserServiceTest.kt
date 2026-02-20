// File generated from our OpenAPI spec by Stainless.

package com.jd_project.api.services.blocking

import com.jd_project.api.client.okhttp.JdProjectOkHttpClient
import com.jd_project.api.models.users.User
import com.jd_project.api.models.users.UserLoginParams
import com.jd_project.api.models.users.UserUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UserServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = JdProjectOkHttpClient.builder().apiKey("My API Key").build()
        val userService = client.users()

        val user =
            userService.create(
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
    fun retrieve() {
        val client = JdProjectOkHttpClient.builder().apiKey("My API Key").build()
        val userService = client.users()

        val user = userService.retrieve("username")

        user.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = JdProjectOkHttpClient.builder().apiKey("My API Key").build()
        val userService = client.users()

        userService.update(
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
    fun delete() {
        val client = JdProjectOkHttpClient.builder().apiKey("My API Key").build()
        val userService = client.users()

        userService.delete("username")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createWithList() {
        val client = JdProjectOkHttpClient.builder().apiKey("My API Key").build()
        val userService = client.users()

        val user =
            userService.createWithList(
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
    fun login() {
        val client = JdProjectOkHttpClient.builder().apiKey("My API Key").build()
        val userService = client.users()

        userService.login(
            UserLoginParams.builder().password("password").username("username").build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun logout() {
        val client = JdProjectOkHttpClient.builder().apiKey("My API Key").build()
        val userService = client.users()

        userService.logout()
    }
}
