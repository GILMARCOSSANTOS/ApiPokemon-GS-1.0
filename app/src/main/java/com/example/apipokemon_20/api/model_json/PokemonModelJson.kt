package com.example.apipokemon_20.api.model_json


import com.google.gson.annotations.SerializedName

data class PokemonModelJson(
    @SerializedName("count")
    val count: Int,
    @SerializedName("next")
    val next: String,
    @SerializedName("previous")
    val previous: Any,
    @SerializedName("results")
    val results: List<Result>
)