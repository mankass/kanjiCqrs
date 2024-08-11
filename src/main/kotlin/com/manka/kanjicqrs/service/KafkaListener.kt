package com.manka.kanjicqrs.service

import com.manka.kanjicqrs.application.MessageProcessing
import com.manka.kanjicqrs.infra.MessageStructure
import org.apache.kafka.clients.consumer.ConsumerRecord
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.messaging.handler.annotation.SendTo
import org.springframework.stereotype.Component
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder
import java.util.*


@Component
class KafkaListener(
    private val messageProcessing: MessageProcessing
) {

    @KafkaListener(topics = ["sendTo"])
    @SendTo
    fun listener(consumer: ConsumerRecord<String, MessageStructure>): Message<MessageStructure> {
        val messageReplay = messageProcessing.process(consumer.value())


        return MessageBuilder.withPayload(messageReplay).build()
    }
}