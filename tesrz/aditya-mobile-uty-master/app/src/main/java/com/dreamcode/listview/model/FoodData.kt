package com.dreamcode.listview.model

object FoodData {
    private val foodName = arrayOf(
        "Bola Ubi",
        "Churros",
        "Dadar Gulung",
        "Gudeg",
        "Ikan Tauco",
        "Nagasari Labu",
        "Nasi Goreng",
        "Pie Buah",
        "Pisang Gapit",
        "Srikaya Roti"
    )

    private val detail = arrayOf(
        "Bola ubi adalah cemilan terlezat didunia",
        "Churros adalah makanan",
        "Dadar Gulung adalah telur yang digulung",
        "Gudeg Khas Yogyakarta",
        "Ikan Tauco mantepppe poll",
        "Nagasari manakanan manis kayak kamu",
        "Nasi goreng adalah nasi dingin",
        "Pie Buah seger eee",
        "Pisang mantul banget",
        "Srikaya roti adalah roti yang ternikmat di semua galaxy"
    )

    private val foodPoster = intArrayOf(
        R.drawable.bola_ubi,
        R.drawable.churros,
        R.drawable.dadar_gulung,
        R.drawable.gudeg,
        R.drawable.ikan_tauco,
        R.drawable.nagasari_labu,
        R.drawable.nasi_goreng,
        R.drawable.pie_buah,
        R.drawable.pisang_gapit,
        R.drawable.srikaya_roti
    )

    val listFood: ArrayList<Food>
        get() {
            val list = arrayListOf<Food>()
            for (position in foodName.indices) {
                val food = Food()
                food.name = foodName[position]
                food.detail = detail[position]
                food.poster = foodPoster[position]
                list.add(food)
            }
            return list
        }
}