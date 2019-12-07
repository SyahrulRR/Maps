package com.example.listviewpresident

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.listviewpresident.adapter.ListPresidentAdapter
import com.example.listviewpresident.model.President
import com.example.listviewpresident.model.PresidentData

class MainActivity : AppCompatActivity() {
    private lateinit var rvPresident: RecyclerView
    private var list: ArrayList<President> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvPresident= findViewById(R.id.rv_president)
        rvPresident.setHasFixedSize(true)
        list.addAll(PresidentData.listPresident)
        showPresidentList()
    }

    private fun showPresidentList() {
        rvPresident.layoutManager = LinearLayoutManager(this)
        val listPresidentAdapter = ListPresidentAdapter(list)
        rvPresident.adapter = listPresidentAdapter
    }
}