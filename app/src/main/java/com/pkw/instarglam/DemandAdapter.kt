package com.pkw.instarglam

import android.os.Binder
import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.pkw.instarglam.databinding.ItemDemandBinding

class DemandAdapter : RecyclerView.Adapter<DemandAdapter.ViewHolder>() {

    val datas: ArrayList<DemandData> = arrayListOf()
    fun setData(arrayList: ArrayList<DemandData>) {
        datas.clear()
        datas.addAll(arrayList)
    }

    fun removeData(index: Int) {
        datas.removeAt(index)
        notifyItemRemoved(index)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding: ItemDemandBinding = ItemDemandBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(datas[position])
    }
    override fun getItemCount(): Int {
        return datas.size
    }

    inner class ViewHolder(val binding: ItemDemandBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(data: DemandData) {
            Glide.with(binding.root).load(data.imageUri).into(binding.ivProfile)
            binding.tvName.text = data.name
            binding.tvNickName.text = data.nickname
        }
    }
}