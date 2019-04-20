package com.codexfons.snon.comon.v2

import com.codexfons.snon.common.v2.Message
import kotlin.test.Test
import kotlin.test.assertEquals

class MessageTest {
    @Test
    fun testMessageIdIsDifferentEveryTimeByDefault() {
        val iterations = 100
        val uniqueMessageIds = (0 until iterations).toList().map { Message().messageId }.toSet()

        assertEquals(iterations, uniqueMessageIds.size)
    }
}