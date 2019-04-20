package com.codexfons.snon.uuid

actual class PlatformSpecificUUIDMaker : UUIDMaker {
    private val maker: PlatformIndependentUUIDMaker =
        PlatformIndependentUUIDMaker()

    actual override fun makeUUID4(): UUID {
        return maker.makeUUID4()
    }
}