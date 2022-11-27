package com.example.apipokemon_20.api.model_json

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class PokemonModelJson(

    @SerializedName("name")
    val name: String? = null

) : Serializable

//data class PokemonModelJson(
//    val name: String,
//
//)
//
//class Result {
//    var name: String? = null
//    var url: String? = null
//}
//
//class Department {
//    var count = 0
//    var next: String? = null
//   // var previous: `object`? = null
//    var results: List<Result>? = null
