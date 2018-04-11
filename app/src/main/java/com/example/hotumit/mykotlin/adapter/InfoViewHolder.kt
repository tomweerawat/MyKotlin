package com.example.hotumit.mykotlin.adapter

import android.media.Image
import android.support.v7.widget.RecyclerView
import android.view.View
import com.example.hotumit.mykotlin.R
import com.example.hotumit.mykotlin.model.PhotoItemDao
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.view_android_info.view.*

class InfoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun codeName(codeName: String) {
        itemView.tvCodeName.text = codeName
    }

    fun version(version: String) {
        itemView.tvVersion.text = version
    }

    fun apiLevel(apiLevel: Int) {
        itemView.tvApiLevel.text = itemView.resources.getString(R.string.api_level, apiLevel)
    }

    fun releaseDate(date: String) {
        itemView.tvReleaseDate.text = date
    }

    fun imgData(img: String) {
        itemView.img.adjustViewBounds


    /*   Picasso
               .with(itemView.context)
               .load(photo.imageUrl)
               .into(itemView.img)
*/


    }
}