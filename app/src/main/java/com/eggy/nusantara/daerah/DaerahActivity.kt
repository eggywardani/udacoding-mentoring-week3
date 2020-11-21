package com.eggy.nusantara.daerah

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.eggy.nusantara.R
import com.eggy.nusantara.model.ProvinsiItem
import com.eggy.nusantara.model.ProvinsiResponse
import com.eggy.nusantara.network.Config
import kotlinx.android.synthetic.main.activity_daerah.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class DaerahActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daerah)
        showDaerah()
    }

    private fun showDaerah(){
        Config.getDaerahData().getProvinsi().enqueue(object : Callback<ProvinsiResponse>{
            override fun onResponse(
                call: Call<ProvinsiResponse>,
                response: Response<ProvinsiResponse>
            ) {
                if (response.isSuccessful){
                    showLoading(false)
                    binData(response.body()?.provinsi)
                }
            }

            override fun onFailure(call: Call<ProvinsiResponse>, t: Throwable) {
                Log.e("error", t.message.toString())
            }

        })
    }


    private fun binData(data:List<ProvinsiItem?>?) {
        list_daerah.setHasFixedSize(true)
        list_daerah.adapter = DaerahAdapter(data)
    }

    private fun showLoading(state:Boolean){
        when(state){
            true -> progress_daerah.visibility = View.VISIBLE
            else -> progress_daerah.visibility = View.GONE

        }
    }


}
