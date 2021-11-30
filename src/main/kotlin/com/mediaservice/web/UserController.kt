package com.mediaservice.web

import com.mediaservice.application.UserService
import com.mediaservice.application.dto.UserResponseDto
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/api/v1/users")
class UserController(private val userService: UserService) {
    @GetMapping("/{id}")
    fun findById(@PathVariable id: UUID): UserResponseDto{
        return this.userService.findById(id)
    }
}