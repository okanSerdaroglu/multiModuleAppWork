package com.core.network

import com.core.network.model.MovieListResponse
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * in network module
 * 1- we create ApiService interface for retrofit
 * 2- we create response model classes as DTO
 * 3 - we create our dataProvider
 */

interface ApiService {

    // https://api.themoviedb.org/3/search/movie?api_key%3Capi_key%3Ef&query=Harry

    @GET("3/search/movie")
    suspend fun getMovieList(
        @Query("api_key") apiKey: String,
        @Query("query") q: String
    ): MovieListResponse

}