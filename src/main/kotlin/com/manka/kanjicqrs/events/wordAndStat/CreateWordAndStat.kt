package com.manka.kanjicqrs.events.wordAndStat

import com.manka.kanjicqrs.aggregate.Aggregate
import com.manka.kanjicqrs.events.AbstractEvent
import com.manka.kanjicqrs.events.Event
import com.manka.kanjicqrs.events.EventType
import jakarta.persistence.Entity
import java.util.UUID

@Entity
data class CreateWordAndStat(
    override var aggregateId: UUID?,
    override var eventType: EventType?,
    override var payload: Any?
) : AbstractEvent(aggregateId, eventType, payload) {

    fun create(payload: Any?): CreateWordAndStat {
        return CreateWordAndStat(null, EventType.WORD_AND_STAT_CREATE, payload)
    }

    override fun apply(aggregate: Aggregate) {
        TODO("Not yet implemented")
    }

}