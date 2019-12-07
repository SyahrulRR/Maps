package com.example.listviewpresiden.Model

import com.example.listviewpresiden.R

object PresidenData {
    private val presidenName = arrayOf(
        "Soekarno",
        "Soeharto",
        "BJ Habibie",
        "Abdurrahman Wahid",
        "Megawati Soekarno Putri",
        "Susilo Bambang Yudhoyono",
        "Joko Widodo"
    )

    private val detail = arrayOf(
        "18 Agustus 1945 - 12 Maret 1967",
        "12 Maret 1967 - 21 Mei 1998",
        "21 Mei 1998 - 20 Oktober 1999",
        "20 Oktober 1999 - 23 Juli 2001",
        "23 Juli 2001 - 20 Oktober 2004",
        "20 Oktober 2004 - 20 Oktober 2014",
        "20 Oktober 2014 - Sampai Sekarang"
    )

    private val presidenPoster = intArrayOf(
        R.drawable.soekarno,
        R.drawable.soeharto,
        R.drawable.bj_habibie,
        R.drawable.abdurrahman_wahid,
        R.drawable.megawati,
        R.drawable.sby,
        R.drawable.jokowi
    )

    val listPresiden: ArrayList<Presiden>
        get() {
            val list = arrayListOf<Presiden>()
            for (position in presidenName.indices) {
                val presiden = Presiden()
                presiden.name = presidenName[position]
                presiden.detail = detail[position]
                presiden.poster = presidenPoster[position]
                list.add(presiden)
            }
            return list
        }
}