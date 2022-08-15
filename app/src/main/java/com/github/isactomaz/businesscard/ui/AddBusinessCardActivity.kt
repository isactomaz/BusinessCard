package com.github.isactomaz.businesscard.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.isactomaz.businesscard.R
import com.github.isactomaz.businesscard.databinding.ActivityAddBusinessCardBinding

class AddBusinessCardActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAddBusinessCardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddBusinessCardBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_close_black_24dp)
    }
}