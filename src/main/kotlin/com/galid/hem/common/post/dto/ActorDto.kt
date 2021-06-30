package com.galid.hem.common.post.dto

import com.galid.hem.common.user.dto.Actor

data class ActorDto(
    val actorId: Long,
    val profileImageUrl: String? = null,
    val relationType: Actor.RelationType = Actor.RelationType.ME
)