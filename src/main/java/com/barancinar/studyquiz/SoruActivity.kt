package com.barancinar.studyquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.barancinar.studyquiz.Constants.BINLIK

class SoruActivity : AppCompatActivity() {
    private lateinit var textView: TextView
    private lateinit var tvTimer: TextView
    private lateinit var btnSec1: Button
    private lateinit var btnSec2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_soru)

        initUI()
    }

    private fun initUI() {
        textView = findViewById(R.id.soruText)
        tvTimer = findViewById(R.id.tvTimer)
        btnSec1 = findViewById(R.id.btnSec1)
        btnSec2 = findViewById(R.id.btnSec2)

        startTimer(30)

        btnSec1.setOnClickListener {
            val intent = Intent(this, ResultActivity::class.java)
            val bundle = Bundle()
            bundle.putInt(Intent.EXTRA_TEXT, 1)
            intent.putExtras(bundle)
            startActivity(intent)
        }
        btnSec2.setOnClickListener {
            val intent = Intent(this, ResultActivity::class.java)
            val bundle = Bundle()
            bundle.putInt(Intent.EXTRA_TEXT, 2)
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }

    private fun startTimer(saniye: Long) {
        val timer = object: CountDownTimer(saniye*BINLIK, BINLIK) {
            override fun onTick(p0: Long) {
                val s = p0 / BINLIK
                tvTimer.setText(getString(R.string.sure, s))
                Log.d(TAG, "onTick: $s")
            }

            override fun onFinish() {
                tvTimer.setText(getString(R.string.sure_doldu))
                btnSec1.visibility = View.GONE
                btnSec2.visibility = View.GONE
                Log.d(TAG, "onFinish: ")
            }
        }
        timer.start()
    }

    companion object {
        private const val TAG = "SoruActivity"
    }
}