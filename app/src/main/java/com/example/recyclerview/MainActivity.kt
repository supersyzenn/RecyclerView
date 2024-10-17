package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.ItemsViewModel


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // getting the recyclerview by its id
        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)


        // this creates a vertical layout Manager
        recyclerview.layoutManager = LinearLayoutManager(this)


        // ArrayList of class ItemsViewModel
        val data = ArrayList<ItemsViewModel>()


        // This loop will create 20 Views containing
        // the image with the count of view
        for (i in 1..15) {
            data.add(ItemsViewModel("User " + i))


        }


        // This will pass the ArrayList to our Adapter
        val adapter = CustomAdapter(data)
        Log.d("test string","Jumlah data: "+data.size)


        // Setting the Adapter with the recyclerview
        recyclerview.adapter = adapter
    }
}
