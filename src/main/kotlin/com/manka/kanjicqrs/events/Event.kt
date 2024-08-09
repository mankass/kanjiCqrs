package com.manka.kanjicqrs.events

import com.manka.kanjicqrs.aggregate.Aggregate

interface Event {

    fun apply(aggregate: Aggregate)
}