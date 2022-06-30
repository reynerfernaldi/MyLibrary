package com.example.mylibrary

object BooksData {
    private val bookNames = arrayOf("Bulan",
        "Dilan",
        "Bumi Manusia",
        "Kamus Inggris-Indoensia",
        "Hujan",
        "Romeo & Juliet",
        "KKN di Desa Penari",
        "Laskar Pelangi",
        "Pulang-Pergi",
        "Kosmos")

    private val bookDetails = arrayOf("Penulis: Tere Liye",
        "Penulis: Pidi Baiq",
        "Penulis: Pramoedya Ananta Toer",
        "Penulis: John M. Echols & Hassan Sadily",
        "Penulis: Tere Liye",
        "Penulis: William Shakespeare",
        "Penulis: Simpleman ",
        "Penulis: Andrea Hirata",
        "Penulis: Tere Liye",
        "Penulis: Carl Sagan")

    private val booksImages = intArrayOf(R.drawable.bulan,
        R.drawable.dilan,
        R.drawable.bumi_manusia,
        R.drawable.kamus,
        R.drawable.hujan,
        R.drawable.romeo_juliet,
        R.drawable.kkn,
        R.drawable.laskar_pelangi,
        R.drawable.pulang_pergi,
        R.drawable.kosmos)

    val listData: ArrayList<Book>
        get() {
            val list = arrayListOf<Book>()
            for (position in bookNames.indices) {
                val hero = Book()
                hero.name = bookNames[position]
                hero.detail = bookDetails[position]
                hero.photo = booksImages[position]
                list.add(hero)
            }
            return list
        }
}