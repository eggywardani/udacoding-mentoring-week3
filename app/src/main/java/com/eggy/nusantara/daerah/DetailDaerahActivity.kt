package com.eggy.nusantara.daerah

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.eggy.nusantara.R
import com.eggy.nusantara.daerah.subdaerah.SubDaerahAdapter
import com.eggy.nusantara.model.KotaKabupatenItem
import com.eggy.nusantara.model.KotaResponse
import com.eggy.nusantara.model.ProvinsiItem
import com.eggy.nusantara.network.Config
import kotlinx.android.synthetic.main.activity_detail_daerah.*
import kotlinx.android.synthetic.main.daerah_header.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class DetailDaerahActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_DAERAH = "extra_daerah"
    }

    private lateinit var daerah: ProvinsiItem

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_daerah)


        daerah = intent.getParcelableExtra<ProvinsiItem>(EXTRA_DAERAH) as ProvinsiItem
        propinsi_nama.text = daerah.nama
        showDaerah()
    }

    private fun showDaerah() {
        Config.getDaerahData().getCityByProvince(daerah.id)
            .enqueue(object : Callback<KotaResponse> {
                override fun onResponse(
                    call: Call<KotaResponse>,
                    response: Response<KotaResponse>
                ) {

                    if (response.isSuccessful) {
                        showLoading(false)
                        binData(response.body()?.kotaKabupaten)
                    }
                }

                override fun onFailure(call: Call<KotaResponse>, t: Throwable) {
                    Log.e("error", t.message.toString())
                }

            })
    }

    private fun binData(data: List<KotaKabupatenItem?>?) {
        list_kota.setHasFixedSize(true)
        list_kota.adapter = SubDaerahAdapter(data)
    }

    private fun showLoading(state: Boolean) {
        when (state) {
            true -> progress_kota.visibility = View.VISIBLE
            else -> progress_kota.visibility = View.GONE

        }
    }
}