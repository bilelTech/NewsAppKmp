package org.example.project.appcore.domain.models

import kotlinx.datetime.LocalDateTime

data class News(
    val author: String,
    val content: String,
    val description: String,
    val publishedAt: LocalDateTime?,
    val title: String,
    val url: String,
    val urlToImage: String
)