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
                "",
                "Hong",
                "길동"
            )
        )
        demendDatas.add(
            DemandData(
                "",
                "Go",
                "길동"
            )
        )
        demendDatas.add(
            DemandData(
                "",
                "Dul",
                "리"
            )
        )
        demendDatas.add(
            DemandData(
                "",
                "Dou",
                "너"
            )
        )
        demendDatas.add(
            DemandData(
                "",
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