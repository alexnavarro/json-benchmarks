package com.dashlane.benchmarks.json.test5

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class JsonEntityMoshi3(
    @Json(name = JsonEntity3.A)
    val a: String? = null,

    @Json(name = JsonEntity3.B)
    val b: Int,

    @Json(name = JsonEntity3.C)
    val c: Long,

    @Json(name = JsonEntity3.D)
    val d: Float,

    @Json(name = JsonEntity3.E)
    val e: Double,

    @Json(name = JsonEntity3.F)
    val f: Boolean,

    @Json(name = JsonEntity3.G)
    val g: JsonEntityMoshi1
)