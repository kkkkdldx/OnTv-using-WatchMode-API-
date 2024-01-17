package com.example.ontv

import com.google.gson.annotations.SerializedName

data class GenreHandler(

    @SerializedName("id")
    val id: String,

    @SerializedName("name")
    val name: String,

    @SerializedName("tmdb_id")
    val tmdbId: String,

){
    override fun toString(): String {
        return name
    }
}