package com.mediaservice.application.dto

import com.mediaservice.domain.User
import org.jetbrains.exposed.dao.id.EntityID
import java.util.*

data class UserResponseDto(val email: String) {
    companion object {
        fun from(user: User) = UserResponseDto(
            email = user.email
        )
    }
}