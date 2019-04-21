package com.codexfons.snon.v2

import com.soywiz.klock.DateTime
import com.soywiz.klock.TimeSpan

data class StringValue(
    override val value: String,
    override val time: DateTime,
    override val min: String,
    override val max: String,
    override val timeout: TimeSpan
) : Value<String>