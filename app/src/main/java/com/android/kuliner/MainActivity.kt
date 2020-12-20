package com.android.kuliner

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun mulaiBtn(view: View) {
        startActivity(Intent(this, PulauActivity::class.java))
    }

    fun tentangBtn(view: View) {
        msgShow2("Tentang")
    }

    fun keluarBtn(view: View){
        moveTaskToBack(true);
        exitProcess(-1)
    }

    fun msgShow2(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }
}
