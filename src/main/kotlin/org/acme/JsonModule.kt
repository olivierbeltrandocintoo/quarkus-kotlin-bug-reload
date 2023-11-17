package org.acme

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.databind.ObjectMapper

val mapper = jacksonObjectMapper()

inline fun <reified T> String.fromJson(): T {
    return mapper.readValue(this, T::class.java)
}