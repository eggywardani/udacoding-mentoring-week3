package com.eggy.nusantara.museum

import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import com.eggy.nusantara.R
import com.eggy.nusantara.model.DataItem
import com.eggy.nusantara.model.MuseumResponse
import com.eggy.nusantara.network.Config
import kotlinx.android.synthetic.main.activity_batik.list_batik
import kotlinx.android.synthetic.main.activity_museum.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MuseumActivity : AppCompatActivity() {
    private lateinit var museum: DataItem
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_museum)

        supportActionBar?.apply {
            elevation = 0f
        }

        museum = DataItem()
        showMuseum()

    }

    private fun showMuseum() {
        Config.getMuseumRetrofit().getMuseumData().enqueue(object : Callback<MuseumResponse> {
            override fun onResponse(
                call: Call<MuseumResponse>,
                response: Response<MuseumResponse>
            ) {
                if (response.isSuccessful) {
                    showLoading(false)
                    binData(response.body()?.data)
                }
            }

            override fun onFailure(call: Call<MuseumResponse>, t: Throwable) {
                Log.e("error", t.toString())
            }


        })
    }

    fun showMuseumByName(query:String) {
        Config.getMuseumRetrofit().getMuseumDataByName(query)
            .enqueue(object : Callback<MuseumResponse> {
                override fun onResponse(
                    call: Call<MuseumResponse>,
                    response: Response<MuseumResponse>
                ) {
                    if (response.isSuccessful) {
                        showLoading(false)
                        binData(response.body()?.data)
                    }
                }

                override fun onFailure(call: Call<MuseumResponse>, t: Throwable) {
                    Log.e("err", t.message.toString())
                }

            })
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_searh, menu)
        val search = menu?.findItem(R.id.search_action)?.actionView as SearchView
        search.queryHint = "cari museum"
        search.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String): Boolean {
                if (query.isNotEmpty()) {
                    showLoading(true)
                    showMuseumByName(query)

                }
                return true

            }

            override fun onQueryTextChange(newText: String?): Boolean {
                return false
            }

        })
        return super.onCreateOptionsMenu(menu)
    }

    private fun binData(data: List<DataItem?>?) {
        list_museum.setHasFixedSize(true)
        list_museum.adapter = MuseumAdapter(data)
    }

    private fun showLoading(state: Boolean) {
        when (state) {
            true -> progress_museum.visibility = View.VISIBLE
            else -> progress_museum.visibility = View.GONE

        }
    }
}