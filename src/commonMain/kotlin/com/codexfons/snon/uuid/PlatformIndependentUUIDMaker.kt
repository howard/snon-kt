package com.codexfons.snon.uuid

import kotlin.random.Random

/**
 * DIY implementation for generating random UUIDs for platforms that don't provide their own mechanism.
 */
class PlatformIndependentUUIDMaker : UUIDMaker {
    override fun makeUUID4(): UUID {
        // The third group in the textual representation of a UUID needs to be 4, because that's the identifier for
        // the random variety of UUIDs. Not sure what the reason is for how the first digit in the fourth group. Just
        // found this like that somewhere.
        return UUID("xxxxxxxx-xxxx-4xxx-yxxx-xxxxxxxxxxxx".split("").joinToString("") {
            val randomHexDigit = (Random.nextDouble() * 16).toInt()

            when (it) {
                "x" -> randomHexDigit.toString()
                "y" -> (randomHexDigit and 0x4 or 0x8).toString()
                else -> it
            }
        })
    }
}