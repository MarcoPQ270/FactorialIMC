package com.example.example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main_resultado.*

class MainActivityResultado : AppCompatActivity() {

    companion object VerdeCompanion {
        val EXTRA_RES = "extrares"
        private val DEFAULT_RES: Int = -1

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_resultado)

        val intent = intent

        if (intent != null && intent.hasExtra(EXTRA_RES)) {
            val res: Int = intent.getIntExtra(EXTRA_RES, DEFAULT_RES)
            tvresultado.setText(res.toString())
        }

    }
}
