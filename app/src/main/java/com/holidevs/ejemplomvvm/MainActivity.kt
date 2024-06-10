package com.holidevs.ejemplomvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.holidevs.ejemplomvvm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(this.binding.root)
    }
}