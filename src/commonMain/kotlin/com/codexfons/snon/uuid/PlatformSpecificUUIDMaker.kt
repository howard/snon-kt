package com.codexfons.snon.uuid

/**
 * Variety of UUID maker that uses some platform-specific facility to accomplish that.
 */
expect class PlatformSpecificUUIDMaker() : UUIDMaker {
    override fun makeUUID4(): UUID
}