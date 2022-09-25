package com.pkw.instarglam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pkw.instarglam.api.CallApi
import com.pkw.instarglam.databinding.ActivityAlbumDetailBinding

class AlbumDetailActivity : AppCompatActivity() {

    lateinit var binding:ActivityAlbumDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAlbumDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loadData()
    }

    private fun loadData() {
        CallApi().loadAlbumInfo("2u6Zn1aKVXM0vB2S7T08") {
            //binding.tvInfo.text = it.albumInfo
        }
    }
}