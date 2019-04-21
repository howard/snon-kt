package com.codexfons.snon.v2

import com.codexfons.snon.common.URN
import com.codexfons.snon.common.UnitTranslationMap
import com.codexfons.snon.common.emptyUnitTranslationMap
import com.soywiz.klock.TimeSpan

data class Measure<T>(
    val type: MeasureType = MeasureType.NUMERIC,
    val values: List<Value<T>> = emptyList(),
    val unit: Unit = Unit(),
    val range: Range = Range(),
    val entity: Entity? = null,
    val acquisitionMethod: AcquisitionMethod = AcquisitionMethod.SAMPLE,
    val label: UnitTranslationMap = emptyUnitTranslationMap(), // TODO not 100% correct
    val updateRate: TimeSpan? = null,
    val timeout: TimeSpan? = null,
    val resolution: Double? = null,
    val accuracy: Double? = null,
    val valueError: String? = null,
    val precendentId: URN? = null,
    val extensions: Map<String, Map<String, String>> = emptyMap()
)