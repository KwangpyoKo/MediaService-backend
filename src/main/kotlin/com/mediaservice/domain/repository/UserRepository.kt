package com.mediaservice.domain.repository

import com.mediaservice.domain.User
import com.mediaservice.domain.UserEntity
import org.springframework.stereotype.Repository
import java.util.*

@Repository
class UserRepository {
    fun findById(id: UUID): User? {
        return UserEntity.findById(id)?.let { User.from(it) }
    }
}