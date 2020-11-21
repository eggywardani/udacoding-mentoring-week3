package com.eggy.nusantara.batik

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.eggy.nusantara.R
import com.eggy.nusantara.model.HasilItem
import kotlinx.android.synthetic.main.item_batik.view.*

class BatikAdapter(private val dataBatik:List<HasilItem?>?):RecyclerView.Adapter<BatikAdapter.BatikViewHolder>() {
    class BatikViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindItem(item:HasilItem?){
            itemView.nama_batik.text = item?.namaBatik
            itemView.asal_batik.text = item?.daerahBatik
            Glide.with(itemView.context)
                .load(item?.linkBatik)
                .into(itemView.gambar_batik)

            itemView.setOnClickListener {
                val intent = Intent(itemView.context, DetailBatikActivity::class.java)
                intent.putExtra(DetailBatikActivity.EXTRA_DATA, item)
                itemView.context.startActivity(intent)

            }



        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BatikViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_batik, parent, false)
        return BatikViewHolder(view)
    }

    override fun onBindViewHolder(holder: BatikViewHolder, position: Int) {
        holder.bindItem(dataBatik?.get(position))

    }

    override fun getItemCount(): Int = dataBatik?.size ?:0
}