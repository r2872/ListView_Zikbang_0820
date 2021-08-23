package com.example.listview_zikbang_0820

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

        roomList.add(RoomData(8000, "강남구", 5, "방1"))
        roomList.add(RoomData(2700, "강서구", 2, "방2"))
        roomList.add(RoomData(6000, "마포구", -2, "방3"))
        roomList.add(RoomData(4500, "서대문구", 0, "방4"))
        roomList.add(RoomData(2900, "용산구", -1, "방5"))
        roomList.add(RoomData(3400, "동대문구", 2, "방6"))
        roomList.add(RoomData(3100, "은평구", 3, "방7"))
        roomList.add(RoomData(8700, "경기도 파주시", 1, "방8"))

        mRoomAdapter = RoomAdapter(this, R.layout.roomlist_item, roomList)

        binding.roomListView.adapter = mRoomAdapter
    }
}