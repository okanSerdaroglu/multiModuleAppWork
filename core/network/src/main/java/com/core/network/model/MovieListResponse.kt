package com.core.network.model

import com.google.gson.annotations.SerializedName

data class MovieListResponse(
    val page: Int?,
    val result: List<MovieDTO>?,
    @SerializedName("total_pages")
    val totalPages: Int?,
    @SerializedName("total_results")
    val totalResults: Int?
)
