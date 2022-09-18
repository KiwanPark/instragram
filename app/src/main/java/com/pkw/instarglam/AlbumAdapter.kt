package com.pkw.instarglam

import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.pkw.instarglam.api.AlbumData
import com.pkw.instarglam.databinding.ItemAlbumBinding

class AlbumAdapter : RecyclerView.Adapter<AlbumAdapter.ViewHolder>() {

    val datas:ArrayList<AlbumData.Data> = arrayListOf()
    fun setData(arrayList: ArrayList<AlbumData.Data>) {
        datas.clear()
        datas.addAll(arrayList)
        notifyItemRangeInserted(0, datas.size)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding:ItemAlbumBinding =
            ItemAlbumBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(datas[position])
    }

    override fun getItemCount(): Int {
        return datas.size
    }

    inner class ViewHolder(val binding: ItemAlbumBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(data: AlbumData.Data) {
            Glide.with(binding.root).load(data.imgUrl).into(binding.ivImage)
            binding.tvAlbumName.text = data.name
            binding.tvArtistName.text = data.artist
        }
    }
}