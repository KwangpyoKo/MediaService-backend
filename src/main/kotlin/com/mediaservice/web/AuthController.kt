package com.mediaservice.web

import com.mediaservice.application.UserService
import com.mediaservice.application.dto.UserResponseDto
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import com.mediaservice.application.dto.UserRequestDto
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import javax.validation.Valid

@RestController
@RequestMapping("/api/v1/auth")
class AuthController(private val userService: UserService) {
    @PostMapping("/sign-up")
    fun signUp(@Valid @RequestBody userRequestDto: UserRequestDto): UserResponseDto {
        return this.userService.signUp(userRequestDto)
    }

    @PostMapping("/sign-in")
    fun signIn(@Valid @RequestBody userRequestDto: UserRequestDto): String {
        return this.userService.signIn(userRequestDto)
    }
}