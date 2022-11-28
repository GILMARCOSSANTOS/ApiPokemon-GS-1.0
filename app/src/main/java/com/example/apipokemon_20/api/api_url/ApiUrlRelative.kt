package com.example.apipokemon_20.api.api_url

import com.example.apipokemon_20.api.model_json.PokemonModelJson
import retrofit2.Call
import retrofit2.http.GET

interface ApiUrlRelative {
    @GET("users")
    fun getPokemonUrlRelative(): Call<PokemonModelJson>
}