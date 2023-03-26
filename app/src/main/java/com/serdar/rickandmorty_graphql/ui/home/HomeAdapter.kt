package com.serdar.rickandmorty_graphql.ui.home

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.serdar.rickandmorty_graphql.data.dto.Character
import com.serdar.rickandmorty_graphql.databinding.CharacterItemBinding
import com.serdar.rickandmorty_graphql.utility.loadUrl

class HomeAdapter(
    private var characterUiData: List<Character>,
) :
    RecyclerView.Adapter<HomeAdapter.MyViewHolder>() {


    inner class MyViewHolder(private val viewBinding: CharacterItemBinding) :
        RecyclerView.ViewHolder(viewBinding.root) {

        fun bindItems(characterUiData: Character) {
            viewBinding.ivCharacter.loadUrl(characterUiData.image)
            viewBinding.txtCharacter.text = characterUiData.name
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int
    ): MyViewHolder {
        val binding =
            CharacterItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bindItems(characterUiData[position])


    }

    override fun getItemCount(): Int {
        return characterUiData.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun updateData(characterUiData: List<Character>) {
        this.characterUiData = characterUiData
        notifyDataSetChanged()

    }
}
