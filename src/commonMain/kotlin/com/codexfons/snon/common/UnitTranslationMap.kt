package com.codexfons.snon.common

fun emptyUnitTranslationMap(): UnitTranslationMap {
    return UnitTranslationMap()
}

fun unitTranslationMapOf(vararg pairs: Pair<RFC5646Locale, String>): UnitTranslationMap {
    val map = emptyUnitTranslationMap()
    map.putAll(pairs)

    return map
}

class UnitTranslationMap : MutableMap<RFC5646Locale, String> {
    private val map: MutableMap<RFC5646Locale, String> = mutableMapOf()

    override val size: Int
        get() = map.size

    override fun containsKey(key: RFC5646Locale): Boolean {
        return map.containsKey(key)
    }

    override fun containsValue(value: String): Boolean {
        return map.containsValue(value)
    }

    override fun get(key: RFC5646Locale): String? {
        return map[key]
    }

    override fun isEmpty(): Boolean {
        return map.isEmpty()
    }

    override val entries: MutableSet<MutableMap.MutableEntry<RFC5646Locale, String>>
        get() = map.entries
    override val keys: MutableSet<RFC5646Locale>
        get() = map.keys
    override val values: MutableCollection<String>
        get() = map.values

    override fun clear() {
        map.clear()
    }

    override fun put(key: RFC5646Locale, value: String): String? {
        return map.put(key, value)
    }

    override fun putAll(from: Map<out RFC5646Locale, String>) {
        map.putAll(from)
    }

    override fun remove(key: RFC5646Locale): String? {
        return map.remove(key)
    }
}