package com.example.listviewpresiden.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.listviewpresiden.Model.Presiden
import com.example.listviewpresiden.R

class ListPresidenAdapter(private val listPresiden: ArrayList<Presiden>) : RecyclerView.Adapter<ListPresidenAdapter.PresidenViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PresidenViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_presiden, parent, false)
        return PresidenViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listPresiden.size
    }

    override fun onBindViewHolder(holder: PresidenViewHolder, position: Int) {
        val presiden = listPresiden[position]
        holder.tvName.text = presiden.name
        holder.tvDetail.text = presiden.detail
        Glide.with(holder.itemView.context)
            .load(presiden.poster)
            .into(holder.imgPoster)
    }

    inner class PresidenViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPoster: ImageView = itemView.findViewById(R.id.img_item_poster)
    }
}