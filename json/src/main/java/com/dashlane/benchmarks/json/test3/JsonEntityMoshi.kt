package com.dashlane.benchmarks.json.test3

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class JsonEntityMoshi(
    @Json(name = JsonEntity.A)
    val a: JsonEntityMoshi? = null,

    @Json(name = JsonEntity.B)
    val b: JsonEntityMoshi? = null,

    @Json(name = JsonEntity.C)
    val c: JsonEntityMoshi? = null,

    @Json(name = JsonEntity.D)
    val d: JsonEntityMoshi? = null
)