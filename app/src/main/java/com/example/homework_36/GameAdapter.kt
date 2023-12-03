package com.example.homework_36

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.homework_36.databinding.ItemGameBinding

class GameAdapter(private val gameList: ArrayList<GameModel>) : Adapter<ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemGameBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount() = gameList.size


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(gameList[position])
    }

}

class ViewHolder(private var binding: ItemGameBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(game: GameModel) {
        binding.imgGame.loadImage(game.image)
        binding.tvName.text = game.name
    }
}