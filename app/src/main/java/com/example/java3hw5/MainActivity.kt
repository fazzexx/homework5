package com.example.java3hw5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.java3hw5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnPlus.setOnClickListener{
            count ++
            binding.btnNumber.text=count.toString()
            if (count == 10 || binding.btnPlus.text.equals("-1")){
                binding.btnPlus.text="-1"
                count --
                binding.btnNumber.text=count.toString()

            }

            if  (count == 0){
                val intent = Intent(this, MainActivity2 :: class.java)
                startActivity(intent)
            }
        }

    }

}