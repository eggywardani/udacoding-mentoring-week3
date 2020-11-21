package com.eggy.nusantara.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ProvinsiResponse(

    @field:SerializedName("provinsi")
    val provinsi: List<ProvinsiItem?>? = null
) : Parcelable

@Parcelize
data class ProvinsiItem(

    @field:SerializedName("nama")
    val nama: String? = null,

    @field:SerializedName("id")
    val id: Int? = null
) : Parcelable
