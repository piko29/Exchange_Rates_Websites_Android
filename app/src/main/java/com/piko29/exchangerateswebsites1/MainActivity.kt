package com.piko29.exchangerateswebsites1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.piko29.exchangerateswebsites1.databinding.ActivityMainBinding

/**
 * Simple application, connecting user
 * with specific website,
 * after clicking on specific button.
 * Written in Kotlin and XML for Android.
 */

class MainActivity : ComponentActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        binding.button1.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.xe.com/")))
        }
        binding.button2.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.oanda.com/currency/live-exchange-rates/")))
        }
        binding.button3.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://finance.yahoo.com/currencies/")))
        }
        binding.button4.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://finance.yahoo.com/currencies/")))
        }

    }
}

