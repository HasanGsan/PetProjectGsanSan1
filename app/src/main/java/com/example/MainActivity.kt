package com.example

import adapter_fragment.TableAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.example.petprojectgsansan.R
import com.example.petprojectgsansan.databinding.ActivityMainBinding
import com.example.petprojectgsansan.databinding.PreloaderContentBinding
import container_fragment_main.ContainerFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val fragment = ContainerFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.container_content, fragment)
            .commit()

    }
}
