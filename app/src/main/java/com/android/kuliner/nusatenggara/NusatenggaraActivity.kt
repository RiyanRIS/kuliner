package com.android.kuliner.nusatenggara

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.android.kuliner.R
import com.android.kuliner.maluku.KetupatActivity

class NusatenggaraActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nusatenggara)
    }

    fun mandai(view: View) {
        startActivity(Intent(this, MandaiActivity::class.java))
    }
}
