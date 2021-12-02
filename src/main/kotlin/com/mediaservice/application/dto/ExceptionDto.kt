package com.mediaservice.application.dto

import com.mediaservice.exception.ErrorCode
import java.time.LocalDateTime

class ExceptionDto(val errorCode: ErrorCode, var message: String?, timestamp: LocalDateTime)