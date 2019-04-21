package com.codexfons.snon.v2

import com.soywiz.klock.DateTime
import com.soywiz.klock.TimeSpan

data class NumericValue(
    override val value: Double,
    override val time: DateTime,
    override val min: Double,
    override val max: Double,
    override val timeout: TimeSpan
) : Value<Double>