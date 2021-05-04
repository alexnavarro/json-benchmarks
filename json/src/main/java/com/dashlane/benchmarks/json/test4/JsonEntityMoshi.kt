package com.dashlane.benchmarks.json.test4

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class JsonEntityMoshi(
    @Json(name = JsonEntity.A)
    val a: List<JsonEntityMoshi>,

    @Json(name = JsonEntity.B)
    val b: List<JsonEntityMoshi>,

    @Json(name = JsonEntity.C)
    val c: List<JsonEntityMoshi>,

    @Json(name = JsonEntity.D)
    val d: List<JsonEntityMoshi>
)