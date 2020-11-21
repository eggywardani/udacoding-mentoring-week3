package com.eggy.nusantara.model.nastional

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CovidIndoResponse(

	@field:SerializedName("data")
	val data: Data? = null,

	@field:SerializedName("update")
	val update: Update? = null
) : Parcelable

@Parcelize
data class HarianItem(

	@field:SerializedName("key_as_string")
	val keyAsString: String? = null,

	@field:SerializedName("doc_count")
	val docCount: Int? = null,

	@field:SerializedName("jumlah_positif_kum")
	val jumlahPositifKum: JumlahPositifKum? = null,

	@field:SerializedName("jumlah_sembuh_kum")
	val jumlahSembuhKum: JumlahSembuhKum? = null,

	@field:SerializedName("jumlah_meninggal_kum")
	val jumlahMeninggalKum: JumlahMeninggalKum? = null,

	@field:SerializedName("jumlah_meninggal")
	val jumlahMeninggal: JumlahMeninggal? = null,

	@field:SerializedName("jumlah_sembuh")
	val jumlahSembuh: JumlahSembuh? = null,

	@field:SerializedName("key")
	val key: Long? = null,

	@field:SerializedName("jumlah_positif")
	val jumlahPositif: JumlahPositif? = null,

	@field:SerializedName("jumlah_dirawat_kum")
	val jumlahDirawatKum: JumlahDirawatKum? = null,

	@field:SerializedName("jumlah_dirawat")
	val jumlahDirawat: JumlahDirawat? = null
) : Parcelable

@Parcelize
data class Penambahan(

	@field:SerializedName("created")
	val created: String? = null,

	@field:SerializedName("jumlah_meninggal")
	val jumlahMeninggal: Int? = null,

	@field:SerializedName("tanggal")
	val tanggal: String? = null,

	@field:SerializedName("jumlah_sembuh")
	val jumlahSembuh: Int? = null,

	@field:SerializedName("jumlah_positif")
	val jumlahPositif: Int? = null,

	@field:SerializedName("jumlah_dirawat")
	val jumlahDirawat: Int? = null
) : Parcelable

@Parcelize
data class Update(

	@field:SerializedName("penambahan")
	val penambahan: Penambahan? = null,

	@field:SerializedName("total")
	val total: Total? = null,

	@field:SerializedName("harian")
	val harian: List<HarianItem?>? = null
) : Parcelable

@Parcelize
data class JumlahDirawatKum(

	@field:SerializedName("value")
	val value: Int? = null
) : Parcelable

@Parcelize
data class JumlahMeninggal(

	@field:SerializedName("value")
	val value: Int? = null
) : Parcelable

@Parcelize
data class JumlahPositifKum(

	@field:SerializedName("value")
	val value: Int? = null
) : Parcelable

@Parcelize
data class JumlahSembuhKum(

	@field:SerializedName("value")
	val value: Int? = null
) : Parcelable

@Parcelize
data class JumlahPositif(

	@field:SerializedName("value")
	val value: Int? = null
) : Parcelable

@Parcelize
data class Data(

	@field:SerializedName("jumlah_odp")
	val jumlahOdp: Int? = null,

	@field:SerializedName("jumlah_pdp")
	val jumlahPdp: Int? = null,

	@field:SerializedName("total_spesimen")
	val totalSpesimen: Int? = null,

	@field:SerializedName("total_spesimen_negatif")
	val totalSpesimenNegatif: Int? = null,

	@field:SerializedName("id")
	val id: Int? = null
) : Parcelable

@Parcelize
data class Total(

	@field:SerializedName("jumlah_meninggal")
	val jumlahMeninggal: Int? = null,

	@field:SerializedName("jumlah_sembuh")
	val jumlahSembuh: Int? = null,

	@field:SerializedName("jumlah_positif")
	val jumlahPositif: Int? = null,

	@field:SerializedName("jumlah_dirawat")
	val jumlahDirawat: Int? = null
) : Parcelable

@Parcelize
data class JumlahMeninggalKum(

	@field:SerializedName("value")
	val value: Int? = null
) : Parcelable

@Parcelize
data class JumlahDirawat(

	@field:SerializedName("value")
	val value: Int? = null
) : Parcelable

@Parcelize
data class JumlahSembuh(

	@field:SerializedName("value")
	val value: Int? = null
) : Parcelable
