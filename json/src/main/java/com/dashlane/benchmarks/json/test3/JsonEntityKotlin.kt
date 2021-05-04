package com.dashlane.benchmarks.json.test3

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class JsonEntityKotlin(
    @SerialName(JsonEntity.A)
    val a: JsonEntityKotlin? = null,

    @SerialName(JsonEntity.B)
    val b: JsonEntityKotlin? = null,

    @SerialName(JsonEntity.C)
    val c: JsonEntityKotlin? = null,

    @SerialName(JsonEntity.D)
    val d: JsonEntityKotlin? = null
)