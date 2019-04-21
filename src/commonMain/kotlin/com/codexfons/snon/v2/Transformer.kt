package com.codexfons.snon.v2

import com.codexfons.snon.AbstractTransformer

expect class Transformer() : AbstractTransformer {
    override fun fromJson(raw: String): Collection
    override fun toJson(collection: Collection): String
}