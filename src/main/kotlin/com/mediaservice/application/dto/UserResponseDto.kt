package com.mediaservice.application.dto

import com.mediaservice.domain.User


data class UserResponseDto(var user: User?){
    var email: String? = user?.email
    var password: String? = user?.password
}