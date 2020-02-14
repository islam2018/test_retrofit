package com.example.test_retrofit

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myparking.models.Parking
import java.util.zip.Inflater

class TestAdapter(val list: ArrayList<Parking>) : RecyclerView.Adapter<TestAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false)
        return MyViewHolder(view)

    }

    override fun getItemCount(): Int {
       return list.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
       val p = list[position]
        holder.t1.text = p.nom
        holder.t2.text = p.adresse
        holder.t3.text = p.ouvert
    }

    inner class MyViewHolder(i: View): RecyclerView.ViewHolder(i) {
        val t1 = i.findViewById<TextView>(R.id.t1)
        val t2 = i.findViewById<TextView>(R.id.t2)
        val t3 = i.findViewById<TextView>(R.id.t3)
    }
}