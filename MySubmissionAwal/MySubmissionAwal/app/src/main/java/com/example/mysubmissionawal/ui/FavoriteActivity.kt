package com.example.mysubmissionawal.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mysubmissionawal.R
import com.example.mysubmissionawal.ui.viewmodel.DetailActivityViewModel
import com.example.mysubmissionawal.ui.viewmodel.FavoriteActivityViewModel

class FavoriteActivity : AppCompatActivity() {
    private lateinit var viewModel: FavoriteActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favorite)
    }

    private fun isFavoriteUser(username: String): Boolean {
        return viewModel.isFavoriteUser(username)
    }
}