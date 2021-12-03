package com.mediaservice.web

import com.mediaservice.application.dto.ProfileResponseDto
import com.mediaservice.application.ProfileService
import org.springframework.web.bind.annotation.*
import java.util.UUID

@RestController
@RequestMapping("/api/v1/profiles")
class ProfileController(private val profileService: ProfileService) {
    @GetMapping("/{id}")
    fun findById(@PathVariable id: UUID): ProfileResponseDto {
        return this.profileService.findById(id)
    }
}