package com.dashlane.benchmarks.json.test1

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class JsonEntityKotlinSerialization (
    @SerialName(JsonEntity.A)
    val a: String,

    @SerialName(JsonEntity.B)
    val b: String,

    @SerialName(JsonEntity.C)
    val c: Int,

    @SerialName(JsonEntity.D)
    val d: Int,

    @SerialName(JsonEntity.E)
    val e: Boolean,

    @SerialName(JsonEntity.F)
    val f: Boolean,
)