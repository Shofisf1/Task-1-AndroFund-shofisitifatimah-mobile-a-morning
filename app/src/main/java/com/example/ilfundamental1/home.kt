package com.example.ilfundamental1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputBinding
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.ilfundamental1.databinding.ActivityHomeBinding


class home : AppCompatActivity(), View.OnClickListener {
    @SuppressLint("MissingInflatedId")

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.fragment1Button.setOnClickListener() { replaceFragment(fragment1()) }

        binding.fragment2Button.setOnClickListener() { replaceFragment(fragment2()) }
    }
    private fun replaceFragment(fragment: Fragment){
        val fragmentManager = supportFragmentManager
        val fragmnetTransaction = fragmentManager.beginTransaction()
        fragmnetTransaction.replace(R.id.fragment1_button, fragment)
        fragmnetTransaction.commit()
    }

    override fun onClick(p0: View?) {
        TODO("Not yet implemented")
    }
}






