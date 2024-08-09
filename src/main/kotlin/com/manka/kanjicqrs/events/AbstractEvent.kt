package com.manka.kanjicqrs.events

import jakarta.persistence.*
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.JdbcTypeCode
import org.hibernate.type.SqlTypes
import java.time.LocalDateTime
import java.util.UUID

@Table(name = "events")
@Entity
open class AbstractEvent(
    @JdbcTypeCode(SqlTypes.VARCHAR) @Column(name = "aggregateId", nullable = true) open var aggregateId: UUID?,
    @Enumerated(EnumType.STRING) @Column(name = "eventType", nullable = false) open var eventType: EventType?,
    @JdbcTypeCode(SqlTypes.JSON) @Convert(converter = ObjectConverter::class) open var payload: Any?
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    var id: Long? = null

    @CreationTimestamp
    @Column(name = "creationTimestamp", nullable = false)
    val timestamp: LocalDateTime? = null


}

