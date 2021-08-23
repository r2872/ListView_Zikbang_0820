package com.example.listview_zikbang_0820.data

import android.graphics.drawable.Drawable
import java.text.NumberFormat
import java.util.*

class RoomData(val price: Int, val address: String, val floor: Int, val details: String) {

    fun getFormattedPrice(): String {
        if (this.price >= 10000) {
            val uk = this.price / 10000
            val rest = this.price % 10000
            val result = "${uk}억${NumberFormat.getIntegerInstance(Locale.KOREA).format(rest)}"

            return result
        } else {
            val result = NumberFormat.getNumberInstance(Locale.KOREA).format(this.price)

            return result
        }
    }
}