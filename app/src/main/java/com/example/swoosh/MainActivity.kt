package com.example.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.swoosh.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.getStartedBtn.setOnClickListener(View.OnClickListener { v->
            val firstIntent:Intent  = Intent(this,ChoiceActivity::class.java)
            startActivity(firstIntent)
            finish()
        })
    }
}