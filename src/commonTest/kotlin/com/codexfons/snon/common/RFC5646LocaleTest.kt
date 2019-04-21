package com.codexfons.snon.common

import kotlin.test.Test
import kotlin.test.fail

class RFC5646LocaleTest {
    @Test
    fun testVariousGoodLocaleStringsAreAccepted()
    {
        val knownGoodCodes = listOf(
            "de",
            "i-enochian",
            "zh-Hant",
            "zh-cmn-Hans-CN",
            "zh-Hans-CN",
            "sl-rozaj",
            "sl-rozaj-biske",
            "de-CH-1901",
            "sl-IT-nedis",
            "de-DE",
            "es-419",
            "de-CH-x-phonebk",
            "az-Arab-x-AZE-derbend",
            "x-whatever",
            "qaa-Qaaa-QM-x-southern",
            "de-Qaaa"
        )

        knownGoodCodes.forEach { RFC5646Locale(it) }
    }

    @Test
    fun testAsteriskIsAnAcceptableLocale()
    {
        RFC5646Locale("*")
    }

    @Test
    fun testBadLocaleCausesException()
    {
        try {
            RFC5646Locale("adasfasfasdfasdfa")
            fail("A bad locale should cause an exception.")
        } catch (e: IllegalArgumentException) {
            // This is expected.
        }
    }
}