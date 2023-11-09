package com.hieunguyen.newsapp.model

import com.hieunguyen.newsapp.model.Article

class NewsResponse {
    data class NewsResponse(
        val articles: List<Article>,
        val status: String,
        val totalResults: Int
    )
}