package com.example.listview_zikbang_0820.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.listview_zikbang_0820.R
import com.example.listview_zikbang_0820.data.RoomData

class RoomAdapter(
    private val mContext: Context,
    private val resId: Int,
    private val mList: ArrayList<RoomData>
) : ArrayAdapter<RoomData>(mContext, resId, mList) {

    private val mInflater: LayoutInflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var temRow = convertView

        if (temRow == null) {
            temRow = mInflater.inflate(R.layout.roomlist_item, null)
        }
        val row = temRow!!

        val data = mList[position]

        val price = row.findViewById<TextView>(R.id.roomPrice)
        val addressAndFloor = row.findViewById<TextView>(R.id.addressAndFloor)
        val detail = row.findViewById<TextView>(R.id.roomDetail)

        price.text = data.getFormattedPrice()
        addressAndFloor.text = data.address
        detail.text = data.details


        return row
    }

}