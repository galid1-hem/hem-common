package com.galid.hem.common.user.dto

class Actor(
    val actorId: Long,
    val profileImageUrl: String? = null,
    val relationType: RelationType
) {
    enum class RelationType {
        ME, OTHER
    }
}