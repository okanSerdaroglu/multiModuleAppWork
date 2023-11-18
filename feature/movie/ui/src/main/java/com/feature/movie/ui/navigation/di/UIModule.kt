package com.feature.movie.ui.navigation.di

import com.feature.movie.ui.navigation.MovieAPI
import com.feature.movie.ui.navigation.MovieApiImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object UIModule {
    @Provides
    fun provideMovieApi(): MovieAPI {
        return MovieApiImpl()
    }
}