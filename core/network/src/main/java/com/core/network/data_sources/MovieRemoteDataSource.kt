package com.core.network.data_sources

import com.core.network.ApiService
import javax.inject.Inject

class MovieRemoteDataSource
@Inject constructor(
    private val apiService: ApiService
) {
    suspend fun getMovieList(
        apiKey: String,
        q: String
    ) = apiService.getMovieList(
        apiKey = apiKey,
        q = q
    )

}