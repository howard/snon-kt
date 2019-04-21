package com.codexfons.snon.v2

import com.codexfons.snon.AbstractTransformer

actual class Transformer : AbstractTransformer() {
    actual override fun fromJson(raw: String): Collection {
        // TODO: Map idiomatic parts of the library to the drunk parts of the standard.
        return JSON.parse(raw)
    }

    actual override fun toJson(collection: Collection): String {
        // TODO: Map drunk parts of the standard to their idiomatic counterpart.
        return JSON.stringify(collection)
    }
}