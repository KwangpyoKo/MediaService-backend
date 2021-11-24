package com.mediaservice.application

import com.mediaservice.application.dto.UserResponseDto
import com.mediaservice.domain.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(private val userRepository: UserRepository) {
    fun getUserById(id: String): UserResponseDto?{ return UserResponseDto(userRepository.findById(id)) }
}