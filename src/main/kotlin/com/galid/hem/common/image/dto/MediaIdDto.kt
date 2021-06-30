package com.galid.hem.common.image.dto

data class MediaIdDto(
    val id: String,
    val type: MediaType = MediaType.PHOTO,
    val imageUrl: String,
)