package com.codexfons.snon.common.v2

import com.codexfons.snon.uuid.UUID
import com.codexfons.snon.uuid.PlatformSpecificUUIDMaker

data class Message(val messageId: UUID = PlatformSpecificUUIDMaker().makeUUID4()) {
}