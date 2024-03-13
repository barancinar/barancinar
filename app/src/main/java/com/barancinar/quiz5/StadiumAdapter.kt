package com.barancinar.quiz5

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class StadiumAdapter(private val context: Context, private val data: ArrayList<StadiumModel>)
    :RecyclerView.Adapter<StadiumAdapter.ViewHolder>() {

    class ViewHolder(private val itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgStadium: ImageView = itemView.findViewById(R.id.imgStadium)
        val tvCapacity: TextView = itemView.findViewById(R.id.tvCapacity)
        val tvLocation: TextView = itemView.findViewById(R.id.tvLocation)
        val tvName: TextView = itemView.findViewById(R.id.tvName)
        val imgIcon: ImageView = itemView.findViewById(R.id.imgIcon)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.stadium_card,parent,false)
        return ViewHolder(view)
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = data[position]

        holder.imgStadium.setImageDrawable(context.getDrawable(item.image))
        holder.tvCapacity.text = item.stadiumCapacity
        holder.tvLocation.text = item.stadiumLocation
        holder.tvName.text = item.stadiumName
        holder.imgIcon.setImageDrawable(context.getDrawable(R.drawable.like_icon_empty))

        holder.imgIcon.setOnClickListener {
            if (item.likeIcon == R.drawable.like_icon_empty) {
                item.likeIcon = R.drawable.like_icon
                Toast.makeText(context, item.stadiumName+"'nu beğendiniz", Toast.LENGTH_SHORT).show()
            } else {
                item.likeIcon = R.drawable.like_icon_empty
                Toast.makeText(context, "Beğenmenizi geri aldınız.", Toast.LENGTH_SHORT).show()
            }
            holder.imgIcon.setImageDrawable(context.getDrawable(item.likeIcon))
            notifyItemChanged(position)
        }
        holder.imgIcon.setImageDrawable(context.getDrawable(item.likeIcon))
    }

    override fun getItemCount(): Int {
        return data.size
    }
}