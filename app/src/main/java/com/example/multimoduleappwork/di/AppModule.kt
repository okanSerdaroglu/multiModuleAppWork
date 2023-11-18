package com.example.multimoduleappwork.di

import com.example.multimoduleappwork.navigation.NavigationProvider
import com.feature.movie.ui.navigation.MovieAPI
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object AppModule {
    @Provides
    fun provideNavigationProvider(movieAPI: MovieAPI): NavigationProvider {
        return NavigationProvider(movieAPI)
    }
}