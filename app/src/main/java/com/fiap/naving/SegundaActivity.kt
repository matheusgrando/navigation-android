package com.fiap.naving

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.ComponentActivity

class SegundaActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.segunda)

        var button = findViewById<Button>(R.id.button_two)
        val stringRecebida = intent.getStringExtra("chaveString")
        button.text = stringRecebida

        button.setOnClickListener { view : View? ->
            finish()
        }
    }
}