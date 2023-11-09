package com.hieunguyen.newsapp

class NewsResponse {
    data class NewsResponse(
        val articles: List<Article>,
        val status: String,
        val totalResults: Int
    )
}