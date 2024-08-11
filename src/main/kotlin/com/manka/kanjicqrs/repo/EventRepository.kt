package com.manka.kanjicqrs.repo

import com.manka.kanjicqrs.events.AbstractEvent
import org.springframework.data.jpa.repository.JpaRepository

interface EventRepository : JpaRepository<AbstractEvent, Long> {
}