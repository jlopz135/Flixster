package com.example.flixster

import com.google.gson.annotations.SerializedName

class Movie {
    @JvmField
    @SerializedName("title")
    val movie_title: String? = null

    @SerializedName("poster_path")
    var imageUrl: String? = null

    @SerializedName("overview")
    var description: String? = null

}