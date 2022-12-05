package com.example.apipokemon_20.api.adapter_pokemon

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.apipokemon_20.R
import com.example.apipokemon_20.api.model_json.PokemonModelJson

class PokemonAdapter(private val context: Context, private var items: List<PokemonModelJson?>

): RecyclerView.Adapter<PokemonAdapter.PokemonViewHolder>() {

    class PokemonViewHolder(view: View): RecyclerView.ViewHolder(view) {

        var namePokemon: TextView? = null

        init {
            namePokemon = view.findViewById(R.id.txtVw_namePokemon_rcclrVwActcvtMain_id)
        }
    }

    override fun onBindViewHolder(holder:PokemonViewHolder, position: Int) {
               val listPokemon = items.get(position)
        if (listPokemon != null) {
            holder.namePokemon?.text = listPokemon.results.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonViewHolder {
        val inflater = LayoutInflater.from(context)
        val view: View = inflater.inflate(R.layout.itens_rcclrvw_actvtmain, parent, false)
        return PokemonViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }
}