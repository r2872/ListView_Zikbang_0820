package com.example.listview_zikbang_0820

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listview_zikbang_0820.data.RoomData
import com.example.listview_zikbang_0820.databinding.ActivityViewRoomDetailBinding

class ViewRoomDetail : AppCompatActivity() {

    private lateinit var binding: ActivityViewRoomDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewRoomDetailBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val roomData = intent.getSerializableExtra("roomData") as RoomData


    }
}