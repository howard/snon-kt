package com.codexfons.snon.comon.v2

import com.codexfons.snon.uuid.UUID
import com.codexfons.snon.uuid.PlatformSpecificUUIDMaker
import kotlin.test.Test
import kotlin.test.fail

abstract class UUIDMakerTestBase {
    private fun assertWellFormedUUID(uuid: UUID) {
        if ("^[0-9a-f]{12}4[0-9a-f]{3}[89ab][0-9a-f]{15}$".toRegex().matches(uuid.value)) {
            fail("The provided UUID is not a wellformed UUID4.")
        }
    }

    @Test
    fun testUUIDsAreWellFormed() {
        val maker = PlatformSpecificUUIDMaker()

        // Run a bunch of times for good measure.
        repeat(100) {
            assertWellFormedUUID(maker.makeUUID4())
        }
    }
}