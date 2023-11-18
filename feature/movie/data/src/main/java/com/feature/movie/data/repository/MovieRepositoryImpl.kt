package com.feature.movie.data.repository

import com.core.network.data_sources.MovieRemoteDataSource
import com.feature.movie.data.mapper.toDomainMovieList
import com.feature.movie.domain.model.Movie
import com.feature.movie.domain.repository.MovieRepository
import javax.inject.Inject

/**
 * we need to implement MovieRepository in our data layer
 * but it is in different module, that's why we need to
 * add domain dependency to data layer.
 */
class MovieRepositoryImpl @Inject constructor(
    private val movieDataProviders: MovieRemoteDataSource
) : MovieRepository {
    override suspend fun getMovieList(apiKey: String, q: String): List<Movie> {
        return movieDataProviders.getMovieList(
            apiKey = apiKey,
            q = q
        ).toDomainMovieList()
    }
}