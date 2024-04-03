package com.example.mysubmissionawal.ui.insert

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mysubmissionawal.database.fav
import com.example.mysubmissionawal.repository.FavRepository
import kotlinx.coroutines.launch

class FavAddUpdateViewModel(application : Application) : ViewModel() {
    private val mFavRepository : FavRepository = FavRepository(application)

    fun insert(fav : fav) {
        mFavRepository.insert(fav)
    }

    fun toggleFavorite(fav: fav) {
        viewModelScope.launch {
            mFavRepository.toggleFavorite(fav)
        }
    }
}
