package com.codexfons.snon.v2

import com.codexfons.snon.common.URN
import com.codexfons.snon.common.UnitTranslationMap
import com.codexfons.snon.common.emptyUnitTranslationMap

data class Entity(val id: URN,
                  val clazz: EntityClass?,
                  val name: UnitTranslationMap = emptyUnitTranslationMap(),
                  val type: UnitTranslationMap = emptyUnitTranslationMap(),
                  val relations: Map<String, Set<URN>> = emptyMap()
)