package com.feature.movie.domain.di

import com.feature.movie.domain.repository.MovieRepository
import com.feature.movie.domain.use_cases.GetMovieList
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object DomainLayerModule {

    @Provides
    fun getMovieListUseCase(movieRepository: MovieRepository): GetMovieList =
        GetMovieList(movieRepository)

}