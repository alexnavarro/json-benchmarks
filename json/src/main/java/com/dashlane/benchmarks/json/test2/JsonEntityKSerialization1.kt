package com.dashlane.benchmarks.json.test2

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class JsonEntityKSerialization1(
    @SerialName(JsonEntity1.A)
    val a: List<JsonEntityKSerialization2>,

    @SerialName(JsonEntity1.B)
    val b: List<JsonEntityKSerialization2>? = null,

    @SerialName(JsonEntity1.C)
    val c: List<JsonEntityKSerialization2>? = null,

    @SerialName(JsonEntity1.D)
    val d: List<JsonEntityKSerialization2>? = null
)