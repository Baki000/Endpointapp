package com.example.endpointapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TourAdapter(private val tours: List<Tour>) :
    RecyclerView.Adapter<TourAdapter.TourViewHolder>() {

    class TourViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tourName: TextView = itemView.findViewById(R.id.tourName)
        val tourDescription: TextView = itemView.findViewById(R.id.tourDescription)
        val tourPrice: TextView = itemView.findViewById(R.id.tourPrice)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TourViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_tour, parent, false)
        return TourViewHolder(view)
    }

    override fun onBindViewHolder(holder: TourViewHolder, position: Int) {
        val tour = tours[position]
        holder.tourName.text = tour.name
        holder.tourDescription.text = tour.description
        holder.tourPrice.text = "Price: ${tour.price}"
    }

    override fun getItemCount(): Int {
        return tours.size
    }
}
