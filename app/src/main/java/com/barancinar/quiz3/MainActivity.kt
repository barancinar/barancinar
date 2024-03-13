package com.barancinar.quiz3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.inputmethod.EditorInfo
import android.widget.EditText
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvSuperLig: RecyclerView
    private lateinit var rvBirinciLig: RecyclerView
    private lateinit var rvIngiltere: RecyclerView
    private lateinit var edArama: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initUI()
    }

    private fun initUI() {
        rvSuperLig = findViewById(R.id.rvSuperLig)
        rvBirinciLig = findViewById(R.id.rvBirinciLig)
        rvIngiltere = findViewById(R.id.rvIngiltere)
        edArama = findViewById(R.id.edArama)

        edArama.setOnKeyListener { _, keyCode, event ->
            if (event.action == KeyEvent.ACTION_DOWN && keyCode == KeyEvent.KEYCODE_ENTER) {

                Toast.makeText(this, "Arama Yapmaya Çalıştınız!", Toast.LENGTH_SHORT).show()
                true
            } else {
                false
            }
        }

        loadSuperLig()
        loadBirinciLig()
        loadIngiltereLig()
    }

    private fun loadSuperLig() {
        val repo = MatchRepository()
        val items = repo.getItemsSuperLig()

        val adapter = MatchAdapter(this, items)

        rvSuperLig.layoutManager = LinearLayoutManager(this)
        rvSuperLig.adapter = adapter
    }

    private fun loadBirinciLig() {
        val repo = MatchRepository()
        val items = repo.getItemsBirinciLig()

        val adapter = MatchAdapter(this, items)

        rvBirinciLig.layoutManager = LinearLayoutManager(this)
        rvBirinciLig.adapter = adapter
    }

    private fun loadIngiltereLig() {
        val repo = MatchRepository()
        val items = repo.getItemsIngiltereLig()

        val adapter = MatchAdapter(this, items)

        rvIngiltere.layoutManager = LinearLayoutManager(this)
        rvIngiltere.adapter = adapter
    }
}