package com.feature.movie.domain.repository

import com.feature.movie.domain.model.Movie

interface MovieRepository {
    suspend fun getMovieList(apiKey:String,q:String):List<Movie>?

}