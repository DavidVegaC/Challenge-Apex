package com.davega.domain.util

class NetworkException : Throwable()

class GenericException(message: String? = null) : Throwable(message)

class BadRequestException(message: String? = null) : Throwable(message)
