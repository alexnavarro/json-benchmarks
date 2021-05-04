package com.dashlane.benchmarks.json.test2

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class JsonEntityMosh1(
    @Json(name = JsonEntity1.A)
    val a: List<JsonEntityMosh2>,

    @Json(name = JsonEntity1.B)
    val b: List<JsonEntityMosh2>? = null,

    @Json(name = JsonEntity1.C)
    val c: List<JsonEntityMosh2>? = null,

    @Json(name = JsonEntity1.D)
    val d: List<JsonEntityMosh2>? = null
)