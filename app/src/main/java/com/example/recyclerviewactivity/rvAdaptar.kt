package com.example.recyclerviewactivity

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewactivity.databinding.ItemRowBinding

class rvAdaptar (val list:ArrayList<String>): RecyclerView.Adapter<rvAdaptar.ItemHolder>(){
    class ItemHolder (val binding:ItemRowBinding):RecyclerView.ViewHolder(binding.root)



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        return ItemHolder(ItemRowBinding.inflate(LayoutInflater.from(
            parent.context),parent,false)
        )
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        val data = list[position]
        holder.binding.apply {
            txt1.text=data
        }
    }

    override fun getItemCount()= list.size

}