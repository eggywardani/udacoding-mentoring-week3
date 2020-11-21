package com.eggy.nusantara.covid

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.eggy.nusantara.R
import com.eggy.nusantara.model.CovidResponse
import com.eggy.nusantara.model.ListDataItem
import com.eggy.nusantara.model.nastional.CovidIndoResponse
import com.eggy.nusantara.model.nastional.Penambahan
import com.eggy.nusantara.model.nastional.Total
import com.eggy.nusantara.network.Config
import kotlinx.android.synthetic.main.activity_covid.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.text.DecimalFormat

class CovidActivity : AppCompatActivity() {
    private var ribuan = DecimalFormat()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_covid)
        showCovidNational()
        showCovidProv()

    }


    private fun showCovidNational() {
        Config.getCovidData().getCovidNasional().enqueue(object : Callback<CovidIndoResponse> {
            override fun onResponse(
                call: Call<CovidIndoResponse>,
                response: Response<CovidIndoResponse>
            ) {

                if (response.isSuccessful) {
                    showHeader(true)
                    bindCovidIndo(response.body()?.update?.penambahan)
                    getAllCase(response.body()?.update?.total)
                }
            }

            override fun onFailure(call: Call<CovidIndoResponse>, t: Throwable) {
                Log.e("error", t.toString())
            }


        })
    }

    private fun showCovidProv() {
        Config.getCovidData().getCovidDataProv().enqueue(object : Callback<CovidResponse> {
            override fun onResponse(call: Call<CovidResponse>, response: Response<CovidResponse>) {
                if (response.isSuccessful) {
                    showLoading(false)
                    binData(response.body()?.listData)



                }
            }

            override fun onFailure(call: Call<CovidResponse>, t: Throwable) {
                Log.e("error", t.toString())

            }
        })
    }


    private fun bindCovidIndo(item: Penambahan?) {

        ribuan = DecimalFormat("#,###")
        val sembuh = ribuan.format(item?.jumlahSembuh)
        val positif = ribuan.format(item?.jumlahPositif)
        val meninggal = ribuan.format(item?.jumlahMeninggal)

        tanggal_update.text = item?.tanggal
        jumlah_postif.text = "+ $positif"
        jumlah_meninggal.text = "+ $meninggal"
        jumlah_sembuh.text = "+ $sembuh"
    }
    private fun getAllCase(item:Total?){
        val total = ribuan.format(item?.jumlahPositif)
        jumlah_postif_all.text = "$total orang"
    }

    private fun binData(data: List<ListDataItem?>?) {
        list_covid.setHasFixedSize(true)
        list_covid.adapter = CovidAdapter(data)
    }

    private fun showLoading(state: Boolean) {
        when (state) {
            true -> progress_covid.visibility = View.VISIBLE
            else -> progress_covid.visibility = View.GONE

        }
    }
    private fun showHeader(state: Boolean) {
        when (state) {
            true -> covid_header.visibility = View.VISIBLE
            else -> covid_header.visibility = View.GONE

        }
    }

}