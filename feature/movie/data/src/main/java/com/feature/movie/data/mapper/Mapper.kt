package com.feature.movie.data.mapper

import com.core.network.model.MovieListResponse
import com.feature.movie.domain.model.Movie

fun MovieListResponse.toDomainMovieList(): List<Movie>? {
    return this.result?.let { movieDtoList ->
        movieDtoList.map {movieDTO ->
            Movie(
                movieDTO.posterPath.orEmpty()
            )
        }
    }
}