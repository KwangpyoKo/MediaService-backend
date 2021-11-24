package com.mediaservice.web

import com.mediaservice.application.UserService
import com.mediaservice.application.dto.UserResponseDto
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/users")
class UserController(private val userService: UserService){
    @GetMapping("/")
    private fun getUserById(@RequestParam(value = "id") id: String): UserResponseDto?
    {
        return userService.getUserById(id)
    }


}