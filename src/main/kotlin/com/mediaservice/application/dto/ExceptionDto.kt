package com.mediaservice.application.dto

import com.mediaservice.exception.ErrorCode
import java.time.LocalDateTime

class ExceptionDto(val errorCode:ErrorCode,timestamp: LocalDateTime)