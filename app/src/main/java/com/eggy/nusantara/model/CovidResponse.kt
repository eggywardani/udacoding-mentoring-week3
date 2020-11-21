package com.eggy.nusantara.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CovidResponse(

	@field:SerializedName("missing_data")
	val missingData: Double? = null,

	@field:SerializedName("tanpa_provinsi")
	val tanpaProvinsi: Int? = null,

	@field:SerializedName("current_data")
	val currentData: Double? = null,

	@field:SerializedName("list_data")
	val listData: List<ListDataItem?>? = null,

	@field:SerializedName("last_date")
	val lastDate: String? = null
) : Parcelable

@Parcelize
data class ListDataItem(

    @field:SerializedName("penambahan")
	val penambahan: Penambahan? = null,

    @field:SerializedName("doc_count")
	val docCount: Double? = null,

    @field:SerializedName("lokasi")
	val lokasi: Lokasi? = null,

    @field:SerializedName("jumlah_meninggal")
	val jumlahMeninggal: Int? = null,

    @field:SerializedName("kelompok_umur")
	val kelompokUmur: List<KelompokUmurItem?>? = null,

    @field:SerializedName("jumlah_kasus")
	val jumlahKasus: Int? = null,

    @field:SerializedName("jumlah_sembuh")
	val jumlahSembuh: Int? = null,

    @field:SerializedName("jenis_kelamin")
	val jenisKelamin: List<JenisKelaminItem?>? = null,

    @field:SerializedName("key")
	val key: String? = null,

    @field:SerializedName("jumlah_dirawat")
	val jumlahDirawat: Int? = null
) : Parcelable

@Parcelize
data class JenisKelaminItem(

	@field:SerializedName("doc_count")
	val docCount: Int? = null,

	@field:SerializedName("key")
	val key: String? = null
) : Parcelable

@Parcelize
data class Lokasi(

	@field:SerializedName("lon")
	val lon: Double? = null,

	@field:SerializedName("lat")
	val lat: Double? = null
) : Parcelable

@Parcelize
data class KelompokUmurItem(

	@field:SerializedName("usia")
	val usia: Usia? = null,

	@field:SerializedName("doc_count")
	val docCount: Int? = null,

	@field:SerializedName("key")
	val key: String? = null
) : Parcelable

@Parcelize
data class Usia(

	@field:SerializedName("value")
	val value: Int? = null
) : Parcelable

@Parcelize
data class Penambahan(

	@field:SerializedName("meninggal")
	val meninggal: Int? = null,

	@field:SerializedName("positif")
	val positif: Int? = null,

	@field:SerializedName("sembuh")
	val sembuh: Int? = null
) : Parcelable
