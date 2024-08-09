package com.manka.kanjicqrs.events.wordAndStat

import com.manka.kanjicqrs.events.AbstractEvent
import com.manka.kanjicqrs.events.EventType
import jakarta.persistence.Entity
import java.util.UUID

//@Entity
//class CreateWordAndStat(
//    override var aggregateId: UUID?,
//    override var eventType: EventType?,
//    override var payload: Any?
//) : AbstractEvent(aggregateId, eventType, payload)