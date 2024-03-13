package com.barancinar.quiz3

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MatchAdapter(val context: Context, val data: ArrayList<MatchModel>)
    : RecyclerView.Adapter<MatchAdapter.ViewHolder>() {

    class ViewHolder(val itemView: View) : RecyclerView.ViewHolder(itemView) {
        val img: ImageView = itemView.findViewById(R.id.img)
        val tvShortName: TextView = itemView.findViewById(R.id.tvShortName)
        val tvIlkYari: TextView = itemView.findViewById(R.id.tvIlkYari)
        val tvDurum: TextView = itemView.findViewById(R.id.tvDurum)
        val tvStartTime: TextView = itemView.findViewById(R.id.tvStartTime)
        val tvCode: TextView = itemView.findViewById(R.id.tvCode)
        val tvEvSahibi: TextView = itemView.findViewById(R.id.tvEvSahibi)
        val tvSkor: TextView = itemView.findViewById(R.id.tvSkor)
        val tvDeplasman: TextView = itemView.findViewById(R.id.tvDeplasman)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.match_line, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = data[position]

        holder.img.setImageDrawable(context.getDrawable(item.image))
        holder.tvShortName.text = item.shortName
        holder.tvIlkYari.text = item.iYSkor
        holder.tvDurum.text = item.msDurum
        holder.tvStartTime.text = item.hour
        holder.tvCode.text = item.kod.toString()
        holder.tvEvSahibi.text = item.evSahibi
        holder.tvSkor.text = item.skor
        holder.tvDeplasman.text = item.deplasman
    }

    override fun getItemCount(): Int {
        return data.size
    }
}
