package com.example.utsmobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.utsmobile.fragment.HomeFragment


class DetailBungaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_bunga)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val bunga = intent.getParcelableExtra<Bunga>(HomeFragment.INTENT_PARCELABLE)

        val imgBunga = findViewById<ImageView>(R.id.img_item_photo)
        val nameBunga = findViewById<TextView>(R.id.tv_item_name)
        val descBunga = findViewById<TextView>(R.id.tv_item_description)

        imgBunga.setImageResource(bunga?.imgBunga!!)
        nameBunga.text = bunga.nameBunga
        descBunga.text = bunga.descBunga
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}