package com.example.datasiswa.viewmodel

import androidx.lifecycle.ViewModel
import com.example.datasiswa.repositori.RepositoriSiswa

class HomeViewModel(private val repositoriSiswa: RepositoriSiswa): ViewModel(){

    companion object{
        private const val TIMEOUT_MILLIS = 5_000L
    }

}