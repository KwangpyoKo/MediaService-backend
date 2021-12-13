package com.mediaservice.exception

class DataNotFoundException(val errorCode: ErrorCode, override val message: String): BaseRuntimeException(message)
