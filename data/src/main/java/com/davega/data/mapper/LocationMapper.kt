package com.davega.data.mapper

import com.davega.data.datasource.remote.response.LocationResponse
import com.davega.domain.model.Location
import com.davega.domain.util.Constant.Number

fun LocationResponse.toDomain() = Location(
    latitude = latitude ?: Number.ZERO_DEC,
    longitude = longitude ?: Number.ZERO_DEC
)
