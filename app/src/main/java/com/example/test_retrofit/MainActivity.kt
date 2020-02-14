package com.example.test_retrofit

import OnParkingListner
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myparking.models.Parking
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), OnParkingListner {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DataSource.getParkings(this)

    }

    override fun onParkingsReceived(parkings: ArrayList<Parking>) {
        list.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        list.adapter = TestAdapter(parkings)
    }
}
