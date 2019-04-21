package com.codexfons.snon.v2

import com.codexfons.snon.AbstractTransformer

actual class Transformer : AbstractTransformer() {
    actual override fun fromJson(raw: String): Collection {
        TODO("jackson, plus map idiomatic parts of the library to the drunk parts of the standard.")
    }

    actual override fun toJson(collection: Collection): String {
        TODO("jackson, plus map drunk parts of the standard to their idiomatic counterpart")
    }
}