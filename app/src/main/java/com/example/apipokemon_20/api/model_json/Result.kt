package com.example.apipokemon_20.api.model_json

import com.google.gson.annotations.SerializedName

data class Result(
    @SerializedName("name")
    val name: String? = null,

    @SerializedName("url")
    val url: String

): java.io.Serializable