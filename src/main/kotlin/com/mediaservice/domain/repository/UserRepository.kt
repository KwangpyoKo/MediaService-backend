package com.mediaservice.domain.repository

import com.mediaservice.domain.User
import org.springframework.data.repository.Repository


interface UserRepository: Repository<User, String> {
    fun findById(id: String): User?
}