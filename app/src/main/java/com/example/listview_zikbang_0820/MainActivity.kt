package com.example.listview_zikbang_0820

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listview_zikbang_0820.databinding.ActivityMainBinding
import com.example.listview_zikbang_0820.adapter.RoomAdapter
import com.example.listview_zikbang_0820.data.RoomData
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val roomList = ArrayList<RoomData>()

    private lateinit var mRoomAdapter: RoomAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        roomList.add(RoomData(18000, "강남구", 5, "방1"))
        roomList.add(RoomData(2700, "강서구", 2, "방2"))
        roomList.add(RoomData(26000, "마포구", -2, "방3"))
        roomList.add(RoomData(4500, "서대문구", 0, "방4"))
        roomList.add(RoomData(32900, "용산구", -1, "방5"))
        roomList.add(RoomData(3400, "동대문구", 2, "방6"))
        roomList.add(RoomData(3100, "은평구", 3, "방7"))
        roomList.add(RoomData(18700, "경기도 파주시", 1, "방8"))

        mRoomAdapter = RoomAdapter(this, R.layout.roomlist_item, roomList)

        binding.roomListView.adapter = mRoomAdapter

        binding.roomListView.setOnItemClickListener { parent, view, position, id ->
            val clickedRoom = roomList[position]

            val intent = Intent(this, ViewRoomDetail::class.java)

            intent.putExtra("roomData", clickedRoom)

            startActivity(intent)
        }
    }
}