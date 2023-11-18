package com.feature.movie.domain.use_cases

import com.core.common.Resource
import com.feature.movie.domain.repository.MovieRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class GetMovieList @Inject constructor(
    private val movieRepository: MovieRepository
) {
    operator fun invoke(
        apiKey: String,
        q: String
    ) = flow {
        emit(Resource.Loading())
        emit(Resource.Success(movieRepository.getMovieList(apiKey, q)))
    }.catch {
        emit(Resource.Error(it.message.toString()))
    }.flowOn(Dispatchers.IO)

}