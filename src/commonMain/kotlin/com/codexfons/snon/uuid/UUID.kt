package com.codexfons.snon.uuid

/**
 * Platform-independent representation of UUIDs. Can't use Java's because of non-JVM targets.
 */
data class UUID(val value: String) {
    override fun toString(): String {
        return value
    }
}