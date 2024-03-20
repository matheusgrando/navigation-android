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

        button.setOnClickListener { view : View? ->

            var navegarDeVolta = Intent( this, MainActivity::class.java)
            startActivity(navegarDeVolta)
        }
    }
}