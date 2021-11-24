package com.mediaservice.application

import com.mediaservice.application.dto.UserResponseDto
import com.mediaservice.domain.User
import com.mediaservice.domain.repository.UserRepository
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.BDDMockito.given
import org.mockito.Mock
import org.junit.jupiter.api.Assertions.assertEquals
import org.mockito.junit.jupiter.MockitoExtension

@ExtendWith(MockitoExtension::class)
class UserServiceTest(
        @Mock var userRepository: UserRepository
){
    private var userService: UserService = UserService(userRepository)
    private lateinit var user: User

    @BeforeEach
    fun setUp(){
        this.user = User("kkp7982","kkp7982@gmail.com", "광표멋쟁이")
    }

    @Test
    fun findUserByIdSuccessfully(){
        //given
        given(userRepository.findById("kkp7982")).willReturn(this.user)
        println(user.email)

        //when
        val userResponseDto: UserResponseDto? = this.userService.getUserById("kkp7982")

        //then
        assertEquals(this.user.email, userResponseDto?.email, "Find user by id test failed")
    }
}