package com.manka.kanjicqrs.domain

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.SequenceGenerator
import jakarta.persistence.Table
import java.sql.Timestamp
import java.time.LocalDate
import java.util.UUID

@Entity
@Table(name = "word-and-stat")
class WordAndStat(

    val wordId: String,

    val wrongAttempts: Int,

    val correctAttempts: Int,

    var lastUsingDate: Timestamp,

    @Id
    @SequenceGenerator(
        name = "word_seq",
        sequenceName = "word_sequence",
        allocationSize = 20
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "word_seq"
    )
    val id: UUID
) {

}