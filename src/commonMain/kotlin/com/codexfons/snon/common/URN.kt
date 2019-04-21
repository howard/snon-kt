package com.codexfons.snon.common

abstract class URN {
    protected abstract fun getProtocol(): String
    protected abstract fun getId(): String

    override fun toString(): String {
        return "urn:${getProtocol()}:${getId()}"
    }
}