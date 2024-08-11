package com.manka.kanjicqrs.infra

data class MessageStructure(
    val type: EventType,
    val correlationId: String,
    val sendTo: String,
    val replyTo: String,
    val content: Any
)
enum class EventType {
    Create,Delete
}