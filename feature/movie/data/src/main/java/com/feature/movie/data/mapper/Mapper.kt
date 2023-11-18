package com.feature.movie.data.mapper

import com.core.network.model.MovieListResponse
import com.feature.movie.domain.model.Movie

fun MovieListResponse.toDomainMovieList(): List<Movie> {
    return this.result.map {
        Movie(
            it.posterPath.orEmpty()
        )
    }
}