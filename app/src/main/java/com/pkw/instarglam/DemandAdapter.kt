package com.pkw.instarglam

import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup
import com.pkw.instarglam.databinding.ItemDemandBinding

class DemandAdapter : RecyclerView.Adapter<DemandAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding:ItemDemandBinding =
            ItemDemandBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {}
    override fun getItemCount(): Int {
        return 0
    }

    inner class ViewHolder(val binding: ItemDemandBinding) : RecyclerView.ViewHolder(binding.root)
}