package com.android.kuliner.maluku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.android.kuliner.R

class MalukuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maluku)
    }

    fun ketupat(view: View) {
        startActivity(Intent(this, KetupatActivity::class.java))
    }
}
