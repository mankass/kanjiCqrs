package com.manka.kanjicqrs.events

import com.fasterxml.jackson.databind.ObjectMapper
import jakarta.persistence.AttributeConverter
import jakarta.persistence.Converter

@Converter
class ObjectConverter : AttributeConverter<Any, String> {
    override fun convertToDatabaseColumn(p0: Any?): String {
        val mapper = ObjectMapper()
        return mapper.writeValueAsString(p0)
    }

    override fun convertToEntityAttribute(p0: String?): Any {
        val mapper = ObjectMapper()
        return mapper.convertValue(p0, Any::class.java)
    }
}