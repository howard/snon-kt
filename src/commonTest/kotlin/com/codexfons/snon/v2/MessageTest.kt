package com.codexfons.snon.v2

import com.soywiz.klock.DateTime
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class MessageTest {
    @Test
    fun testMessageIdIsDifferentEveryTimeByDefault() {
        val iterations = 100
        val uniqueMessageIds = (0 until iterations).toList().map {
            Message(measure = Measure<Double>()).id
        }.toSet()

        assertEquals(iterations, uniqueMessageIds.size)
    }

    @Test
    fun testMessageTimeIsNowByDefault() {
        val message = Message(measure = Measure<Double>())
        val now = DateTime.now()

        assertTrue(now.unixMillis - message.time.unixMillis < 100,
            "Artificial now and default message time were not sufficiently close.")
    }
}