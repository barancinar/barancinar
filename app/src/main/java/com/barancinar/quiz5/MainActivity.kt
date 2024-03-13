package com.barancinar.quiz5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var tvStadiumCounter: TextView
    private var itemCount: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initUI()
    }

    private fun initUI() {
        recyclerView = findViewById(R.id.recyclerView)
        tvStadiumCounter = findViewById(R.id.tvStadiumCount)

        loadStadium()

        tvStadiumCounter.text = itemCount.toString()
    }

    private fun loadStadium() {
        val repo = StadiumRepository()
        val items = repo.getItems()
        itemCount = items.size

        val adapter = StadiumAdapter(this, items)

        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = adapter
    }
}