package com.codexfons.snon.common

import com.codexfons.snon.uuid.UUID

class UUIDURN(private val uuid: UUID) : URN() {
    override fun getId(): String {
        return uuid.value
    }

    override fun getProtocol(): String {
        return "uuid"
    }
}