package com.mediaservice.application

import com.mediaservice.application.dto.ProfileResponseDto
import com.mediaservice.domain.repository.ProfileRepository
import com.mediaservice.exception.BadRequestException
import com.mediaservice.exception.ErrorCode
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.util.UUID
import javax.validation.Valid

@Service
class ProfileService(private val profileRepository: ProfileRepository) {
    @Transactional(readOnly = true)
    fun findById(id: UUID): @Valid ProfileResponseDto {
        return ProfileResponseDto.from(
                this.profileRepository.findById(id)
                        ?: throw BadRequestException(ErrorCode.ROW_DOES_NOT_EXIST, "NO SUCH PROFILE $id")
        )
    }
}