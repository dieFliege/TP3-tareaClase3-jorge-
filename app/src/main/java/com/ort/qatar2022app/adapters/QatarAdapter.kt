package com.ort.qatar2022app.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.ort.qatar2022app.R
import com.ort.qatar2022app.entities.Qatar

class QatarAdapter (var qatarList: MutableList<Qatar>,
                    var onClick : (Int) -> Unit) : RecyclerView.Adapter<QatarAdapter.QatarHolder>() {

    class QatarHolder (v : View) : RecyclerView.ViewHolder(v) {
        private var view : View
        init {
            this.view = v
        }
        fun setName (name : String) {
            var txtName : TextView = view.findViewById(R.id.txtItemName)
            txtName.text = name
        }
        fun getCard () : CardView {
            return view.findViewById(R.id.card)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QatarHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_qatar,parent,false)
        return (QatarHolder(view))
    }

    override fun onBindViewHolder(holder: QatarHolder, position: Int) {
        holder.setName(qatarList[position].name)
        holder.getCard().setOnClickListener {
            onClick(position)
        }
    }

    override fun getItemCount(): Int {
        return qatarList.size
    }

}