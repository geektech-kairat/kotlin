package com.example.kotlin.ui.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin.databinding.ItemLayoutBinding

class HomeAdapter : RecyclerView.Adapter<HomeAdapter.HomeViewHolder>() {

    private val list: List<HomeModel> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        return HomeViewHolder(ItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    class HomeViewHolder(itemView:ItemLayoutBinding) : RecyclerView.ViewHolder(itemView.root) {
        val binding = itemView

        fun onBind(homeModel: HomeModel) {
            binding.date.text = homeModel.date
            binding.editDate.text = homeModel.editDate
            binding.nameItem.text = homeModel.title
            binding.deck.text = homeModel.deck

        }

    }
}
