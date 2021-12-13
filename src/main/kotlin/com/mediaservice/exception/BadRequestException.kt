package com.mediaservice.exception

class BadRequestException(
    val errorCode: ErrorCode,
    override val message: String
) : BaseRuntimeException(message)
