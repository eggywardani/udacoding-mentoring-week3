package com.eggy.nusantara.network

import com.eggy.nusantara.model.*
import com.eggy.nusantara.model.nastional.CovidIndoResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface NusantaraService {
    @GET("batik/all")
    fun getBatikData():Call<BatikResponse>

    @GET("CcariMuseum/searchGET?nama=museum")
    fun getMuseumData():Call<MuseumResponse>


    @GET("CcariMuseum/searchGET?nama=")
    fun getMuseumDataByName(
        @Query("nama") nama:String?
    ):Call<MuseumResponse>


    @GET("prov.json")
    fun getCovidDataProv():Call<CovidResponse>

    @GET("update.json")
    fun getCovidNasional():Call<CovidIndoResponse>

    @GET("provinsi")
    fun getProvinsi():Call<ProvinsiResponse>

    @GET("kota?id_provinsi=")
    fun getCityByProvince(
        @Query("id_provinsi") id_provinsi: Int?
    ):Call<KotaResponse>


}