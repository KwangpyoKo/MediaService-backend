package com.mediaservice.exception

import org.springframework.context.MessageSourceResolvable
import java.util.*

class DataNotFoundException(val id:UUID): RuntimeException(), MessageSourceResolvable {
    override fun getCodes(): Array<out String> = arrayOf("error.dataNotFound")
    override fun getArguments(): Array<Any>? = arrayOf()
    override fun getDefaultMessage(): String? = message
}