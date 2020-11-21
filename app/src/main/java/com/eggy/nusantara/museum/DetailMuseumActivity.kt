package com.eggy.nusantara.museum

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.eggy.nusantara.R
import com.eggy.nusantara.model.DataItem
import kotlinx.android.synthetic.main.activity_detail_museum.*
import kotlinx.android.synthetic.main.museum_header.*

class DetailMuseumActivity : AppCompatActivity() {
    companion object{
        const val EXTRA_MUSEUM = "extra_museum"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_museum)


        val museum = intent.getParcelableExtra<DataItem>(EXTRA_MUSEUM)

        tv_nama_museum.text = museum?.nama
        tv_kota_museum.text = museum?.kabupatenKota
        propinsi_museum.text = museum?.propinsi
        alamat_museum.text = museum?.alamatJalan
        tahun_berdiri.text = museum?.tahunBerdiri
        pengelola_museum.text = museum?.pengelola




    }
}