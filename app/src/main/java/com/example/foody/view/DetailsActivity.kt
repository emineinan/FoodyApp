package com.example.foody.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foody.databinding.ActivityDetailsBinding
import com.example.foody.databinding.ActivityMainBinding

class DetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}