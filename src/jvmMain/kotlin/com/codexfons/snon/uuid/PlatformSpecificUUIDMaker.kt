package com.codexfons.snon.uuid

/**
 * UUID maker using Java's own UUID class.
 */
actual class PlatformSpecificUUIDMaker : UUIDMaker {
    actual override fun makeUUID4(): UUID {
        return UUID(java.util.UUID.randomUUID().toString())
    }
}