package com.example.objectapi

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class myAdepter(val mainActivity: MainActivity, val l1: Datamodel?) : RecyclerView.Adapter<myAdepter.ViewData>() {

    class ViewData(itemView: View) : RecyclerView.ViewHolder(itemView){

        var nation_txt = itemView.findViewById<TextView>(R.id.nation_txt)
        var year_txt = itemView.findViewById<TextView>(R.id.year_txt)
        var population_txt = itemView.findViewById<TextView>(R.id.population_txt)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewData {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return ViewData(view)
    }

    override fun onBindViewHolder(holder: ViewData, position: Int) {
        holder.year_txt.text = l1?.data?.get(position)?.year
        holder.nation_txt.text = l1?.data?.get(position)?.nation
        holder.population_txt.text = l1?.data?.get(position)?.population.toString()
    }

    override fun getItemCount(): Int {
        return l1?.data!!.size
    }
}