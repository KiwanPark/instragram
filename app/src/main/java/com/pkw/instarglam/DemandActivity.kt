package com.pkw.instarglam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.pkw.instarglam.databinding.ActivityDemandBinding

class DemandActivity : AppCompatActivity() {
    lateinit var binding:ActivityDemandBinding
    var adapter = DemandAdapter()
    var demendDatas:ArrayList<DemandData> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDemandBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setData()
        setRv()
    }

    private fun setData() {
        demendDatas.add(
            DemandData(
                "https://picsum.photos/id/102/200/300",
                "Hong",
                "길동"
            )
        )
        demendDatas.add(
            DemandData(
                "https://picsum.photos/id/192/200/300",
                "Go",
                "길동"
            )
        )
        demendDatas.add(
            DemandData(
                "https://picsum.photos/id/152/200/300",
                "Dul",
                "리"
            )
        )
        demendDatas.add(
            DemandData(
                "https://picsum.photos/id/193/200/300",
                "Dou",
                "너"
            )
        )
        demendDatas.add(
            DemandData(
                "https://picsum.photos/id/195/200/300",
                "TTO",
                "치"
            )
        )

        adapter.setData(demendDatas)
    }

    private fun setRv() {
        binding.rvDemand.layoutManager = LinearLayoutManager(this)
        binding.rvDemand.adapter = adapter
    }
}