package com.android.kuliner

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.android.kuliner.kalimantan.KalimantanActivity
import com.android.kuliner.maluku.MalukuActivity
import com.android.kuliner.nusatenggara.NusatenggaraActivity

class PulauActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pulau)
    }

    fun kalimantan(view: View) {
        startActivity(Intent(this, KalimantanActivity::class.java))
    }

    fun nusatenggara(view: View) {
        startActivity(Intent(this, NusatenggaraActivity::class.java))
    }

    fun maluku(view: View) {
        startActivity(Intent(this, MalukuActivity::class.java))
    }

    fun jawa(view: View) {
        msgShow2("Jawa")
    }

    fun sumatra(view: View) {
        msgShow2("Sumatra")
    }

    fun msgShow2(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }


}
