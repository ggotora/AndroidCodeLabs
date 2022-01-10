package com.example.droidrecyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.droidrecyclerview.R
import com.example.droidrecyclerview.model.Affirmation

class ItemAdapter(private val context: Context,
                  private val dataset: List<Affirmation>
                  ) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>(){
    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView : TextView = view.findViewById(R.id.item_title)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        
    }

    override fun getItemCount(): Int = dataset.size

}