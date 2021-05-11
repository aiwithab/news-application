package io.github.aiwithab.newsapp.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import io.github.aiwithab.newsapp.repository.NewsRepository

class HomeViewModelProviderFactory(
    private val newsRepository: NewsRepository
): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return HomeViewModel(newsRepository) as T
    }
}