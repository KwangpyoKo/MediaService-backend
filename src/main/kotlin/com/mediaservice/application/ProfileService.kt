package com.mediaservice.application

import com.mediaservice.application.dto.ProfileResponseDto
import com.mediaservice.domain.repository.ProfileRepository
import com.mediaservice.exception.DataNotFoundException
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.util.*

@Service
class ProfileService(private val profileRepository: ProfileRepository) {
    @Transactional(readOnly = true)
    fun findById(id: UUID): ProfileResponseDto {
        return ProfileResponseDto.from(this.profileRepository.findById(id)?: throw DataNotFoundException("NO SUCH PROFILE $id")
        )
    }
}