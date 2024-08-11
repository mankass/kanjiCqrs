package com.manka.kanjicqrs.application

import com.manka.kanjicqrs.infra.MessageStructure

interface MessageProcessor<AbstractEvent> {

    fun process(event: MessageStructure): MessageStructure

}