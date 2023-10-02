package com.example.android.trackmysleepquality

import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.android.trackmysleepquality.sleeptracker.DataItem
import com.example.android.trackmysleepquality.sleeptracker.SleepNightDiffCallback
import com.example.android.trackmysleepquality.sleeptracker.SleepNightListener

class adapter(val clickListener: SleepNightListener):
    ListAdapter<DataItem, RecyclerView.ViewHolder>(SleepNightDiffCallback())  {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemViewType(position: Int): Int {
        return super.getItemViewType(position)
    }

    override fun onBindViewHolder(
        holder: RecyclerView.ViewHolder,
        position: Int,
        payloads: MutableList<Any>
    ) {
        super.onBindViewHolder(holder, position, payloads)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

}