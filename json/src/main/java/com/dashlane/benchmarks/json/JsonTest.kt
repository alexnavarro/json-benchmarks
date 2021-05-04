package com.dashlane.benchmarks.json

/**
 * Gson deserialization performance test.
 *
 * @property json
 *  The JSON string being deserialized by the test.
 */
interface JsonTest {

    val json: String

    fun parseGson()
    fun parseImmutableGson()
    fun parseOrgJson()
    fun parseKotlinSerialization()
    fun parseMoshi()

    interface Factory {
        val testName: String
        fun create(): JsonTest
    }
}