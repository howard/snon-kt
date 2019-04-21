package com.codexfons.snon

import com.codexfons.snon.v2.Collection

abstract class AbstractTransformer {
    companion object {
        fun getInstance(version: Version): AbstractTransformer {
            return when (version) {
                Version.V2 -> com.codexfons.snon.v2.Transformer()
            }
        }
    }

    abstract fun fromJson(raw: String): Collection
    abstract fun toJson(collection: Collection): String
}