package com.example.utsmobile.fragment

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.utsmobile.Bunga
import com.example.utsmobile.BungaAdapter
import com.example.utsmobile.DetailBungaActivity
import com.example.utsmobile.R

class HomeFragment : AppCompatActivity() {

    companion object {
        const val INTENT_PARCELABLE = "OBJECT INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_home)

        val bungaList = listOf<Bunga>(
            Bunga(
                R.drawable.anggrek,
                nameBunga = "Bunga Anggrek",
                descBunga = "Bunga anggrek adalah satu suku tumbuhan  berbunga dengan anggota jenis terbanyak. Dikenal sebagai tanaman hias populer yang dimanfaatkan bunga nya."
            ),
            Bunga(
                R.drawable.daisy,
                nameBunga = "Bunga Daisy",
                descBunga = "Berasal dari Eropa dan daerah beriklim sedang di Asia."
            ),
            Bunga(
                R.drawable.dandelion,
                nameBunga = "Bunga Dandelion",
                descBunga = "Merujuk kepada sebuah tumbuhan yang memiliki bunga-bunga kecil yang dapat terbang ketika ditiup angin."
            ),
            Bunga(
                R.drawable.edelweis,
                nameBunga = "Bunga Edelweis",
                descBunga = "Tumbuhan endemik zona alpina/montana diberbagai pegunungan tinggi di Indonesia, dikategorikan sebagai tumbuhan langka."
            ),
            Bunga(
                R.drawable.lavender,
                nameBunga = "Bunga Lavender",
                descBunga = "Bunga berwarna ungu yang sangat anggun, memiliki aroma yang harum namun menenangkan, juga melambangkan kemurnian."
            ),
            Bunga(
                R.drawable.matahari,
                nameBunga = "Bunga Matahari",
                descBunga = "Tumbuhan semusim dari suku kenikir-kenikiran (Asteraceae) yang populer, baik sebagai tanaman hias maupun tanaman penghasil minyak."
            ),
            Bunga(
                R.drawable.mawar,
                nameBunga = "Bunga Mawar",
                descBunga = "Tumbuhan perdu, pohonnya berduri, bunganya berbau wangi dan berwarna indah, terdiri atas daun bunga yang bersusun; meliputi ratusan jenis, tumbuh tegak atau memanjat, batangnya berduri, bunganya beraneka warna, seperti merah, putih, merah jambu, merah tua, dan berbau harum."
            ),
            Bunga(
                R.drawable.melati,
                nameBunga = "Bunga Melati",
                descBunga = "Termasuk salah satu genus dari semak dan tanaman merambat dalam keluarga zaitun (Oleaceae)."
            ),
            Bunga(
                R.drawable.sakura,
                nameBunga = "Bunga Sakura",
                descBunga = "Bunga nasional Jepang yang mekar pada musim semi, yaitu semakin kurang awal April hingga penghabisan April."
            ),
            Bunga(
                R.drawable.teratai,
                nameBunga = "Bunga Teratai",
                descBunga = "Teratai yang tumbuh di air yang sangat berlumpur (kotor, coklat), warna bunganya lebih cemerlang. Warna bunga bila putih lebih putih, bila merah lebih merah, bila merah muda makin terang warnanya."
        )
        )
        val recyclerView = findViewById<RecyclerView>(R.id.rv_bunga)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = BungaAdapter(this, bungaList){
            val intent = Intent (this,  DetailBungaActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}

