package com.galid.hem.common.post.dto

import com.galid.hem.common.user.dto.Actor

class LikeDto {
    data class Response(
        val likeId: String,
        val postId: String,
        val actor: Actor,
    )
}