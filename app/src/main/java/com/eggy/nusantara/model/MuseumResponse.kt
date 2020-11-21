package com.eggy.nusantara.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MuseumResponse(

	@field:SerializedName("data")
	val data: List<DataItem?>? = null
) : Parcelable

@Parcelize
data class DataItem(

	@field:SerializedName("sumber_dana")
	val sumberDana: String? = null,

	@field:SerializedName("kabupaten_kota")
	val kabupatenKota: String? = null,

	@field:SerializedName("koleksi")
	val koleksi: String? = null,

	@field:SerializedName("desa_kelurahan")
	val desaKelurahan: String? = null,

	@field:SerializedName("lintang")
	val lintang: String? = null,

	@field:SerializedName("status_kepemilikan")
	val statusKepemilikan: String? = null,

	@field:SerializedName("luas_tanah")
	val luasTanah: String? = null,

	@field:SerializedName("alamat_jalan")
	val alamatJalan: String? = null,

	@field:SerializedName("standar")
	val standar: String? = null,

	@field:SerializedName("bujur")
	val bujur: String? = null,

	@field:SerializedName("tahun_berdiri")
	val tahunBerdiri: String? = null,

	@field:SerializedName("kode_pengelolaan")
	val kodePengelolaan: String? = null,

	@field:SerializedName("propinsi")
	val propinsi: String? = null,

	@field:SerializedName("nama")
	val nama: String? = null,

	@field:SerializedName("pengelola")
	val pengelola: String? = null,

	@field:SerializedName("kecamatan")
	val kecamatan: String? = null,

	@field:SerializedName("bangunan")
	val bangunan: String? = null,

	@field:SerializedName("tipe")
	val tipe: String? = null,

	@field:SerializedName("sdm")
	val sdm: String? = null,

	@field:SerializedName("museum_id")
	val museumId: String? = null
) : Parcelable
