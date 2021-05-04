package com.dashlane.benchmarks.json.test5

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class JsonEntityMoshi2(
    @Json(name = JsonEntity2.A)
    val a: String? = null,

    @Json(name = JsonEntity2.B)
    val b: Int,

    @Json(name = JsonEntity2.C)
    val c: Long,

    @Json(name = JsonEntity2.D)
    val d: Float,

    @Json(name = JsonEntity2.E)
    val e: Double,

    @Json(name = JsonEntity2.F)
    val f: Boolean
)