package com.manka.kanjicqrs.events

import com.manka.kanjicqrs.aggregate.Aggregate
import jakarta.persistence.*
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.JdbcTypeCode
import org.hibernate.type.SqlTypes
import java.time.LocalDateTime
import java.util.UUID

@Table(name = "events")
@Entity
abstract class AbstractEvent(
    @JdbcTypeCode(SqlTypes.VARCHAR) @Column(name = "aggregateId", nullable = true) open var aggregateId: UUID?,
    @Enumerated(EnumType.STRING) @Column(name = "eventType", nullable = false) open var eventType: EventType?,
    @JdbcTypeCode(SqlTypes.JSON) @Convert(converter = ObjectConverter::class) open var payload: Any?
) : Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    var id: Long? = null

    @CreationTimestamp
    @Column(name = "creationTimestamp", nullable = false)
    val timestamp: LocalDateTime? = null

}

