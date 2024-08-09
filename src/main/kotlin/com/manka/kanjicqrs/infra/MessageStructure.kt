package com.manka.kanjicqrs.infra

import java.time.LocalDateTime

data class MessageStructure(
    val messageId: String,
    val correlationId: String,
    val sendTo: String,
    val replyTo: String,
    val content: Any
)