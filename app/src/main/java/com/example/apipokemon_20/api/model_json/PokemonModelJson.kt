package com.example.apipokemon_20.api.model_json

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class PokemonModelJson(

    @SerializedName("name")
    val name: String? = null

) : Serializable

