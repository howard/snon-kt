package com.codexfons.snon.common

import kotlin.test.Test
import kotlin.test.assertEquals

class UnitTranslationMapTest {
    @Test
    fun testTypicalMapOperationsWork() {
        val map = UnitTranslationMap()
        val expectedLocale = RFC5646Locale("en")
        val expectedUnit = "cm"

        map[expectedLocale] = expectedUnit
        assertEquals(expectedUnit, map[expectedLocale])

        assertEquals(1, map.size)

        map.remove(expectedLocale)
        assertEquals(0, map.size)
    }

    @Test
    fun testCanCreateEmptyMap() {
        // Specify the type explicitly for extra test coverage that the return type doesn't change by accident.
        val map: UnitTranslationMap = emptyUnitTranslationMap()
        assertEquals(map.size, 0)
    }

    @Test
    fun testCanCreateNewPrePopulatedMap() {
        val map = unitTranslationMapOf(
            RFC5646Locale("en") to "centimeters",
            RFC5646Locale("de") to "Zentimeter"
        )

        assertEquals(2, map.size)
    }
}