package com.dashlane.benchmarks.json.test1

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
open class JsonEntityMoshi(
    @Json(name = JsonEntity.A) val a: String,

    @Json(name = JsonEntity.B) val b: String,

    @Json(name = JsonEntity.C) val c: Int,

    @Json(name = JsonEntity.D) val d: Int,

    @Json(name = JsonEntity.E) val e: Boolean,

    @Json(name = JsonEntity.F) val f: Boolean,
)