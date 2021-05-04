package com.dashlane.benchmarks.json.test2

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class JsonEntityMosh2(
    @Json(name = JsonEntity2.A)
    val a: String? = null,

    @Json(name = JsonEntity2.B)
    val b: String? = null,

    @Json(name = JsonEntity2.C)
    val c: String? = null,

    @Json(name = JsonEntity2.D)
    val d: String? = null
)