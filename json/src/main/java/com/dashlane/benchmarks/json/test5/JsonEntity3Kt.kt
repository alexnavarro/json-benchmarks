package com.dashlane.benchmarks.json.test5

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class JsonEntity3Kt(
    @SerialName(JsonEntity3.A)
    val a: String? = null,

    @SerialName(JsonEntity3.B)
    val b: Int,

    @SerialName(JsonEntity3.C)
    val c: Long,

    @SerialName(JsonEntity3.D)
    val d: Float,

    @SerialName(JsonEntity3.E)
    val e: Double,

    @SerialName(JsonEntity3.F)
    val f: Boolean,

    @SerialName(JsonEntity3.G)
    val g: JsonEntity1Kt
)