package com.codexfons.snon.v2

import com.soywiz.klock.DateTime
import com.soywiz.klock.TimeSpan

interface Value<T> {
    val value: T
    val time: DateTime
    val min: T
    val max: T
    val timeout: TimeSpan
}