package com.manka.kanjicqrs.application

import com.manka.kanjicqrs.infra.MessageStructure

class WordMessageProcess : MessageProcessor<MessageStructure> {
    override fun process(event: MessageStructure): MessageStructure {
        TODO("Not yet implemented")
    }
}