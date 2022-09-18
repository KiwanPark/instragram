package com.pkw.instarglam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.pkw.instarglam.api.AlbumData
import com.pkw.instarglam.api.CallApi
import com.pkw.instarglam.databinding.ActivityRetrofitBinding

class RetrofitActivity : AppCompatActivity() {

    lateinit var binding: ActivityRetrofitBinding
    val adapter = AlbumAdapter()
    val datas: ArrayList<AlbumData.Data> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRetrofitBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setData()
        setRv()
    }

    private fun setRv() {
        binding.rvAlbum.layoutManager = LinearLayoutManager(this)
        binding.rvAlbum.adapter = adapter
    }

    private fun setData() {
//        datas.add(
//            AlbumData.Data(
//                "임희영",
//                "0RumPYZIvCggqnABaJbU",
//                "https://firebasestorage.googleapis.com/v0/b/vidvu-1ba83.appspot.com/o/dantalkTestImage%2F28.jpg?alt=media",
//                "As time does by",
//            )
//        )
//        datas.add(
//            AlbumData.Data(
//                "임영웅",
//                "2u6Zn1aKVXM0vB2S7T08",
//                "https://firebasestorage.googleapis.com/v0/b/findpcroom-f0e38.appspot.com/o/dantalkTestImage%2F23.jpg?alt=media",
//                "별빛 같은 나의 사랑",
//            )
//        )
//        datas.add(
//            AlbumData.Data(
//                "웬디",
//                "4rqAU9Lf837tgLKUFcEF",
//                "https://firebasestorage.googleapis.com/v0/b/findpcroom-f0e38.appspot.com/o/dantalkTestImage%2F14.jpg?alt=media",
//                "Like Water",
//            )
//        )
//        adapter.setData(datas)
        CallApi().loadAlbum({
            datas.clear()
            datas.addAll(it)
            adapter.setData(datas)
        })
    }
}