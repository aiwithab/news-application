package io.github.aiwithab.newsapp.cache.models



data class NewsResponse(

    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)