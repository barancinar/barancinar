package com.barancinar.studyquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    private lateinit var tvSonuc: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        initUI()
    }

    private fun initUI() {
        tvSonuc = findViewById(R.id.tvSonuc)
        val mesaj = intent.extras?.getInt(Intent.EXTRA_TEXT)
        if (mesaj == 1)
        {
            tvSonuc.setText(getString(R.string.ifTrue_text))
        }
        else if (mesaj == 2)
        {
            tvSonuc.setText(getString(R.string.ifFalse_text))
        }
    }
}