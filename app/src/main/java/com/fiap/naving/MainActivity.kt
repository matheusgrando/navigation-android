package com.fiap.naving

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.view.View
import androidx.activity.ComponentActivity
import com.fiap.naving.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var buttonNav = findViewById<Button>(R.id.button)

        buttonNav.setOnClickListener { view : View? ->
            var navegar = Intent(this,  SegundaActivity::class.java)
            startActivity(navegar)
        }

    }
}
