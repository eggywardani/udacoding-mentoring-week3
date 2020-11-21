package com.eggy.nusantara.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class BatikResponse(

	@field:SerializedName("max_price")
	val maxPrice: Int? = null,

	@field:SerializedName("min_price")
	val minPrice: Int? = null,

	@field:SerializedName("total_halaman")
	val totalHalaman: Int? = null,

	@field:SerializedName("hasil")
	val hasil: List<HasilItem?>? = null,

	@field:SerializedName("total_element")
	val totalElement: Int? = null
) : Parcelable

@Parcelize
data class HasilItem(

	@field:SerializedName("daerah_batik")
	val daerahBatik: String? = null,

	@field:SerializedName("harga_rendah")
	val hargaRendah: Int? = null,

	@field:SerializedName("harga_tinggi")
	val hargaTinggi: Int? = null,

	@field:SerializedName("nama_batik")
	val namaBatik: String? = null,

	@field:SerializedName("makna_batik")
	val maknaBatik: String? = null,

	@field:SerializedName("link_batik")
	val linkBatik: String? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("hitung_view")
	val hitungView: Int? = null
) : Parcelable
