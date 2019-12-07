package com.example.listviewpresiden

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.listviewpresiden.Adapter.ListPresidenAdapter
import com.example.listviewpresiden.Model.Presiden
import com.example.listviewpresiden.Model.PresidenData

class MainActivity : AppCompatActivity() {
    private lateinit var rvPresiden: RecyclerView
    private var list: ArrayList<Presiden> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvPresiden = findViewById(R.id.rv_presiden)
        rvPresiden.setHasFixedSize(true)
        list.addAll(PresidenData.listPresiden)
        showPresidenList()
    }

    private fun showPresidenList() {
        rvPresiden.layoutManager = LinearLayoutManager(this)
        val listPresidenAdapter= ListPresidenAdapter(list)
        rvPresiden.adapter = listPresidenAdapter
    }
}