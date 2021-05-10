package io.github.aiwithab.newsapp.network.api

import io.github.aiwithab.newsapp.BuildConfig.NEWS_API_KEY
import io.github.aiwithab.newsapp.network.models.NewsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsAPI {

    @GET("v2/everything")
    suspend fun getAllNews(
        @Query("q")
        searchQuery: String = "apple",
        @Query("page")
        pageNumber: Int = 1,
        @Query("apiKey")
        apiKey: String = NEWS_API_KEY
    ): Response<NewsResponse>
}