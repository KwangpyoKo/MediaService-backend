package com.mediaservice.application.dto

import javax.validation.constraints.Email
import javax.validation.constraints.NotBlank

data class UserRequestDto(
    @field:Email(message = "NOT EMAIL FORMAT")
    val email: String,
    @field:NotBlank(message = "PASSWORD BLANK")
    val password: String
)
