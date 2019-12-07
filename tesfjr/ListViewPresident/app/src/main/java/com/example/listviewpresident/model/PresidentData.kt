package com.example.listviewpresident.model

import com.example.listviewpresident.R

object PresidentData {
    private val presidentName = arrayOf(
        "Soekarno",
        "Suharto",
        "BJ.Habibie",
        "Gusdur",
        "Megawati",
        "Susilo Bambang Yudhoyono",
        "Jokowi"
    )

    private val detail = arrayOf(
        "Presiden Pertama",
        "Presiden Kedua",
        "Presiden Ketiga",
        "Presiden Keempat",
        "Presiden Kelima",
        "Presiden Keenam",
        "Presiden Ketujuh"
    )

    private val presidentPoster = intArrayOf(
        R.drawable.sukarno,
        R.drawable.suharto,
        R.drawable.habibi,
        R.drawable.gusdur,
        R.drawable.megawati,
        R.drawable.sby,
        R.drawable.jokowi

    )

    val listPresident: ArrayList<President>
        get() {
            val list = arrayListOf<President>()
            for (position in presidentName.indices) {
                val president = President()
                president.name = presidentName[position]
                president.detail = detail[position]
                president.poster = presidentPoster[position]
                list.add(president)
            }
            return list
        }
}