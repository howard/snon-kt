package com.codexfons.snon.v2

import com.codexfons.snon.common.UnitTranslationMap
import com.codexfons.snon.common.emptyUnitTranslationMap

data class Unit(
    val name: String = "",
    val prefix: UnitTranslationMap = emptyUnitTranslationMap(),
    val suffix: UnitTranslationMap = emptyUnitTranslationMap(),
    val prefixLong: UnitTranslationMap = emptyUnitTranslationMap(),
    val suffixLong: UnitTranslationMap = emptyUnitTranslationMap(),
    val displayUnit: UnitTranslationMap = emptyUnitTranslationMap()
)