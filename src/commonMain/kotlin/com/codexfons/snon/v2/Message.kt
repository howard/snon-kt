package com.codexfons.snon.v2

import com.codexfons.snon.common.URN
import com.codexfons.snon.common.UUIDURN
import com.codexfons.snon.uuid.PlatformSpecificUUIDMaker
import com.soywiz.klock.DateTime

data class Message<T>(
    val id: URN = UUIDURN(PlatformSpecificUUIDMaker().makeUUID4()),
    val time: DateTime = DateTime.now(),
    val measure: Measure<T>
)