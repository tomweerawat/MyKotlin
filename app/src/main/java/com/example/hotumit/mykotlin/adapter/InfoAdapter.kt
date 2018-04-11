package com.example.hotumit.mykotlin.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.akexorcist.recyclerviewwithitemtouchhelper.CustomItemTouchHelperListener
import com.bumptech.glide.Glide
import com.example.hotumit.mykotlin.R
import com.example.hotumit.mykotlin.model.PhotoItemCollectionDao
import java.util.*

class InfoAdapter(private val androidList: PhotoItemCollectionDao?) : RecyclerView.Adapter<InfoViewHolder>() {
    override fun getItemCount(): Int {
        return androidList?.data?.size ?: 0
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InfoViewHolder {
        return InfoViewHolder(LayoutInflater.from(parent?.context).inflate(R.layout.view_android_info, parent, false))
    }

    override fun onBindViewHolder(holder: InfoViewHolder, position: Int) {
        holder?.let {
            val android = androidList?.data?.get(position)
            val unknownInfo = it.itemView?.context?.getString(R.string.unknown) ?: "Unknown"
            it.codeName(android?.caption ?: unknownInfo)
            it.version(android?.username ?: unknownInfo)
            it.releaseDate(android?.createdTime ?: unknownInfo)
           /* it.imgData(android?.imageUrl?: unknownInfo)*/
            Glide
                    .with(holder.imageView.getContext())
                    .load(android?.imageUrl)
                    .into(it.imgData())


        }
    }


}