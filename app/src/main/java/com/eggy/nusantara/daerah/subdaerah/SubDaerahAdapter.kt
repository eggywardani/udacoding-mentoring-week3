package com.eggy.nusantara.daerah.subdaerah

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.eggy.nusantara.R
import com.eggy.nusantara.model.KotaKabupatenItem
import kotlinx.android.synthetic.main.item_kota.view.*

class SubDaerahAdapter(private val dataKota:List<KotaKabupatenItem?>?):RecyclerView.Adapter<SubDaerahAdapter.KotaViewHolder>() {
    class KotaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(item:KotaKabupatenItem?){
            itemView.nama_kota.text = item?.nama
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KotaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_kota, parent, false)
        return KotaViewHolder(view)
    }

    override fun onBindViewHolder(holder: KotaViewHolder, position: Int) {
        holder.bind(dataKota?.get(position))
    }

    override fun getItemCount(): Int = dataKota?.size ?:0
}