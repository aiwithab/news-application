package io.github.aiwithab.newsapp.cache.db

import androidx.lifecycle.LiveData
import androidx.room.*
import io.github.aiwithab.newsapp.cache.models.Article

@Dao
interface ArticleDao {
    
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertArticles(article: Article): Long
    
    @Query("SELECT * FROM articles")
    fun getAllArticles(): LiveData<List<Article>>
    
    @Delete
    suspend fun deleteArticle(article: Article)
}