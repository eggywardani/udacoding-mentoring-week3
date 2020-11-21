package com.eggy.nusantara.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Config{
    companion object{
        fun getBatikRetrofit(): NusantaraService{
            val retrofit = Retrofit.Builder()
                .baseUrl("http://batikita.herokuapp.com/index.php/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            val service = retrofit.create(NusantaraService::class.java)

            return service

        }
        fun getMuseumRetrofit(): NusantaraService{
            val retrofit = Retrofit.Builder()
                .baseUrl("http://jendela.data.kemdikbud.go.id/api/index.php/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            val service = retrofit.create(NusantaraService::class.java)

            return service
        }
        fun getCovidData(): NusantaraService{
            val retrofit = Retrofit.Builder()
                .baseUrl("https://data.covid19.go.id/public/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            val service = retrofit.create(NusantaraService::class.java)

            return service
        }
        fun getDaerahData(): NusantaraService{
            val retrofit = Retrofit.Builder()
                .baseUrl("https://dev.farizdotid.com/api/daerahindonesia/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            val service = retrofit.create(NusantaraService::class.java)

            return service
        }



    }
}