package com.eggy.nusantara

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.eggy.nusantara.batik.BatikActivity
import com.eggy.nusantara.covid.CovidActivity
import com.eggy.nusantara.daerah.DaerahActivity
import com.eggy.nusantara.museum.MuseumActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ll_batik.setOnClickListener {
            startActivity(Intent(this, BatikActivity::class.java))
        }
        ll_musium.setOnClickListener {
            startActivity(Intent(this, MuseumActivity::class.java))
        }
        ll_corona.setOnClickListener {
            startActivity(Intent(this, CovidActivity::class.java))
        }
        ll_daerah.setOnClickListener {
            startActivity(Intent(this, DaerahActivity::class.java))
        }


    }
}