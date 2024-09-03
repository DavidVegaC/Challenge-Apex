package com.davega.data.datasource.remote.api

import com.davega.domain.util.BadRequestException
import com.davega.domain.util.Constant.HttpCode
import com.davega.domain.util.GenericException
import retrofit2.Response

fun <T> Response<T>?.getBody(): T = when {
    this == null -> throw GenericException()
    isSuccessful -> body() ?: throw GenericException()
    code() == HttpCode.BAD_REQUEST -> throw BadRequestException(errorBody()?.string())
    else -> throw GenericException()
}
