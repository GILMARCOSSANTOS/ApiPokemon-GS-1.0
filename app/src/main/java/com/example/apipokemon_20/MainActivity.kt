package com.example.apipokemon_20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.apipokemon_20.api.adapter_pokemon.PokemonAdapter
import com.example.apipokemon_20.api.api_url.ApiUrlBase
import com.example.apipokemon_20.api.model_json.PokemonModelJson
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    /* Variáveis de Escopo Global: */
    private var listPokemon: MutableList<PokemonModelJson> = mutableListOf<PokemonModelJson>()

    //    private lateinit var listPokemon: PokemonModelJson
    private var adapterPokemon: PokemonAdapter? = null
    private lateinit var recyclerViewPokemon: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* Functions: */
        settingsRecyclerViewUsers()
        getUsersApi()
    }

    private fun settingsRecyclerViewUsers() {
        //   listPokemon = mutableListOf()
        recyclerViewPokemon = findViewById(R.id.rcclrVw_actvtMain_id)

        recyclerViewPokemon.layoutManager = LinearLayoutManager(this)
        adapterPokemon = PokemonAdapter(
            this,
            listPokemon
        )
        recyclerViewPokemon.adapter = adapterPokemon
    }

    private fun getUsersApi() {
        ApiUrlBase.apiServicePokemon.getPokemonUrlRelative()
            .enqueue(object : Callback<PokemonModelJson> {
//                override fun onResponse(
//                    call: Call<List<PokemonModelJson>>,
//                    response: Response<MutableList<PokemonModelJson>>
//                ) {
//
//                    }
//                }
//
//                override fun onFailure(call: Call<MutableList<PokemonModelJson>>, t: Throwable) {
//
//                }

                //                override fun onResponse(
//                    call: Call<List<PokemonModelJson>>,
//                    response: Response<List<PokemonModelJson>>
//                ) {
//                    val responseUseres = response.body()
//                    listPokemon.clear()
//                    responseUseres?.let {
//                        listPokemon.addAll(it)
//                        adapterPokemon?.notifyDataSetChanged()
//                        println("Resposta da API = " + responseUseres)
//                    }
//
//                    override fun onFailure(call: Call<List<PokemonModelJson>>, t: Throwable) {
//                        Log.e("Resposta de Erro da API = ", t.localizedMessage)
//                    }
//                })
//            }
//                override fun onResponse(
//                    call: Call<List<PokemonModelJson>>,
//                    response: Response<List<PokemonModelJson>>
//                ) {
//                    val responseUseres = response.body()
//                    listPokemon.clear()
//                    responseUseres?.let {
//                        listPokemon.addAll(it)
//                        adapterPokemon?.notifyDataSetChanged()
//                        println("Resposta da API = " + responseUseres)
//                    }
//                }
//
//                override fun onFailure(call: Call<List<PokemonModelJson>>, t: Throwable) {
//                    Log.e("Resposta de Erro da API = ", t.localizedMessage)
//                }

                override fun onResponse(
                    call: Call<PokemonModelJson>,
                    response: Response<PokemonModelJson>
                ) {
                                        val responseUseres = response.body()
                    listPokemon.clear()
                    responseUseres?.let {
                        listPokemon.addAll(listOf(it))
                        adapterPokemon?.notifyDataSetChanged()
                        println("Resposta da API = " + responseUseres)
                    }
                }

                override fun onFailure(call: Call<PokemonModelJson>, t: Throwable) {
                    Log.e("Resposta de Erro da API = ", t.localizedMessage)
                }

            })
    }
}




//            .enqueue(object : Callback<PokemonModelJson>{
//                override fun onResponse(
//                    call: Call<PokemonModelJson>,
//                    response: Response<PokemonModelJson>
//                ) {
//                    val responseUseres = response.body()
//                    listPokemon.clear()
//                    responseUseres?.let {
//                        listPokemon.addAll(listOf(it))
//                        adapterPokemon?.notifyDataSetChanged()
//                        println("Resposta de Conexão da API = " + responseUseres)
//                    }
//                }
//
//                override fun onFailure(call: Call<PokemonModelJson>, t: Throwable) {
//                    Log.e("Resposta de Erro da API = ", t.localizedMessage)
//                }
//
//            })

