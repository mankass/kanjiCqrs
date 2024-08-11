package com.manka.kanjicqrs.events

import com.fasterxml.jackson.databind.ObjectMapper
import jakarta.persistence.AttributeConverter
import jakarta.persistence.Converter

@Converter
class ObjectConverter : AttributeConverter<Any, String> {

    private val mapper = ObjectMapper()

    override fun convertToDatabaseColumn(data: Any?): String = mapper.writeValueAsString(data)

    override fun convertToEntityAttribute(data: String?): Any = mapper.convertValue(data, Any::class.java)

}