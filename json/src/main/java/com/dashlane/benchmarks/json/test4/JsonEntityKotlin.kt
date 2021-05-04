package com.dashlane.benchmarks.json.test4

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class JsonEntityKotlin(
    @SerialName(JsonEntity.A)
    val a: List<JsonEntityKotlin>,

    @SerialName(JsonEntity.B)
    val b: List<JsonEntityKotlin>,

    @SerialName(JsonEntity.C)
    val c: List<JsonEntityKotlin>,

    @SerialName(JsonEntity.D)
    val d: List<JsonEntityKotlin>
)