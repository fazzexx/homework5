package com.example.java3hw5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.java3hw5.databinding.ActivityMain2Binding
import com.example.java3hw5.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}