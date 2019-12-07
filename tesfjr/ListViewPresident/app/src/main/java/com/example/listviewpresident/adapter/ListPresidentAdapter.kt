package com.example.listviewpresident.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.listviewpresident.R
import com.example.listviewpresident.model.President

class ListPresidentAdapter(private val listPresident: ArrayList<President>) : RecyclerView.Adapter<ListPresidentAdapter.PresidentViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PresidentViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_president, parent, false)
        return PresidentViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listPresident.size
    }

    override fun onBindViewHolder(holder: PresidentViewHolder, position: Int) {
        val president = listPresident[position]
        holder.tvName.text = president.name
        holder.tvDetail.text = president.detail
        Glide.with(holder.itemView.context)
            .load(president.poster)
            .into(holder.imgPoster)
    }

    inner class PresidentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPoster: ImageView = itemView.findViewById(R.id.img_item_poster)
    }
}