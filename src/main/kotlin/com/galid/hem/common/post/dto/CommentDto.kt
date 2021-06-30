package com.galid.hem.common.post.dto

import com.galid.hem.common.image.dto.MediaIdDto
import java.time.LocalDateTime

class CommentDto {
    data class Request(
        val parentCommentId: String ?= null,
        val mediaId: MediaIdDto?= null,
        val contents: List<DecoratorDto>
    )

    data class Response(
        val commentId: String,
        val parentCommentId: String ?= null,
        val postId: String,
        val actor: ActorDto,
        val mediaId: MediaIdDto?= null,
        val contents: List<DecoratorDto>,
        val subCommentCount: Long? = 0L,
        val likeCount: Long? = 0L,
        val createdAt: LocalDateTime,
        val updatedAt: LocalDateTime
    )
}