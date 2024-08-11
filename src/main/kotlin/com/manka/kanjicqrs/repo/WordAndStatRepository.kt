package com.manka.kanjicqrs.repo

import com.manka.kanjicqrs.domain.WordAndStat
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface WordAndStatRepository : JpaRepository<WordAndStat, UUID> {
}