package com.dashlane.benchmarks.json.test2

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class JsonEntityKSerialization2(
    @SerialName(JsonEntity2.A)
    val a: String? = null,

    @SerialName(JsonEntity2.B)
    val b: String? = null,

    @SerialName(JsonEntity2.C)
    val c: String? = null,

    @SerialName(JsonEntity2.D)
    val d: String? = null
)