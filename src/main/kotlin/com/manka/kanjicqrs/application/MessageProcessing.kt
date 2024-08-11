package com.manka.kanjicqrs.application

import com.manka.kanjicqrs.infra.EventType
import com.manka.kanjicqrs.infra.MessageStructure
import org.springframework.stereotype.Component
import java.util.*

@Component
class MessageProcessing {

    fun process(message: MessageStructure): MessageStructure {

        println(message)

        when (message.type) {
            EventType.Create -> TODO()
            EventType.Delete -> TODO()
            else -> throw Error("Not implemented eventType")

        }

    }
}