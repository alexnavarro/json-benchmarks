package com.dashlane.benchmarks.json.test5

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class JsonEntity2Kt(
    @SerialName(JsonEntity2.A)
    val a: String? = null,

    @SerialName(JsonEntity2.B)
    val b: Int,

    @SerialName(JsonEntity2.C)
    val c: Long,

    @SerialName(JsonEntity2.D)
    val d: Float,

    @SerialName(JsonEntity2.E)
    val e: Double,

    @SerialName(JsonEntity2.F)
    val f: Boolean
)