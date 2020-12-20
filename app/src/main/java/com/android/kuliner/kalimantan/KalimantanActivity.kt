package com.android.kuliner.kalimantan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.android.kuliner.R

class KalimantanActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kalimantan)
    }

    fun soto(view: View) {
        startActivity(Intent(this, SotoActivity::class.java))
    }

    fun patin(view: View) {
        startActivity(Intent(this, PatinActivity::class.java))
    }
}
