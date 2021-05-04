package com.dashlane.benchmarks.json.test5

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class JsonEntity1Kt(
    @SerialName(JsonEntity1.A)
    val a: String,

    @SerialName(JsonEntity1.B)
    val b: Int,

    @SerialName(JsonEntity1.C)
    val c: Long = 0,

    @SerialName(JsonEntity1.D)
    val d: Float,

    @SerialName(JsonEntity1.E)
    val e: Double,

    @SerialName(JsonEntity1.F)
    val f: Boolean,

    @SerialName(JsonEntity1.G)
    val g: JsonEntity2Kt,

    @SerialName(JsonEntity1.H)
    val h: List<JsonEntity3Kt>
)