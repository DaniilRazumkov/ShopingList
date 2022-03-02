package com.example.shopinglist.presentation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.shopinglist.R
import com.example.shopinglist.domain.ShopItem

class ShopListAdapter: RecyclerView.Adapter<ShopListAdapter.ShopItemViewHolde>() {

val list = listOf<ShopItem>()




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShopItemViewHolde {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.item_shop_disabled, parent, false)
                return ShopItemViewHolde(view)
    }

    override fun onBindViewHolder(viewHolder: ShopItemViewHolde, position: Int) {
        val shopItem=list[position]
        viewHolder.tvName.text=shopItem.name
        viewHolder.tvCount.text=shopItem.count.toString()
        viewHolder.view.setOnLongClickListener{

            true
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }


    class ShopItemViewHolde(val view:View): RecyclerView.ViewHolder(view){
        val tvName= view.findViewById<TextView>(R.id.tv_name)
        val tvCount=view.findViewById<TextView>(R.id.tv_count)
    }
}