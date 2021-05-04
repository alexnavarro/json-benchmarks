package com.dashlane.benchmarks.json.test5

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class JsonEntityMoshi1(
    @Json(name = JsonEntity1.A)
    val a: String,

    @Json(name = JsonEntity1.B)
    val b: Int,

    @Json(name = JsonEntity1.C)
    val c: Long = 0,

    @Json(name = JsonEntity1.D)
    val d: Float,

    @Json(name = JsonEntity1.E)
    val e: Double,

    @Json(name = JsonEntity1.F)
    val f: Boolean,

    @Json(name = JsonEntity1.G)
    val g: JsonEntityMoshi2,

    @Json(name = JsonEntity1.H)
    val h: List<JsonEntityMoshi3>
)