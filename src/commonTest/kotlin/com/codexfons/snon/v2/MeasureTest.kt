package com.codexfons.snon.v2

import kotlin.test.Test
import kotlin.test.assertEquals

class MeasureTest {
    private val defaultMeasure = Measure<Double>()

    @Test
    fun testDefaultUnitIsEmptyString() {
        assertEquals("", defaultMeasure.unit.name)
    }

    @Test
    fun testDefaultTypeIsNumeric() {
        assertEquals(MeasureType.NUMERIC, defaultMeasure.type)
    }

    @Test
    fun testDefaultAcquisitionMethodIsSample() {
        assertEquals(AcquisitionMethod.SAMPLE, defaultMeasure.acquisitionMethod)
    }

    @Test
    fun testDefaultMeasureUnitPrefixMapIsEmpty() {
        assertEquals(0, defaultMeasure.unit.prefix.size)
    }
}