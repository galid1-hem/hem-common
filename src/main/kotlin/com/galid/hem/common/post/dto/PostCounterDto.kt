package com.galid.hem.common.post.dto

class PostCounterDto {
    data class Response(
        val likeCount: Long,
        val commentCount: Long,
        val bookmarkCount: Long,
        val viewCount: Long
    )
}