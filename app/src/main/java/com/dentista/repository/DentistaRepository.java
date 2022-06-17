package com.dentista.repository;

import com.dentista.data.DentistaDao
import com.dentista.model.Dentista
import androidx.lifecycle.LiveData;

import com.dentista.data.DentistaDao;
import com.dentista.model.Dentista;

class DentistaRepository(private val dentistaDao: DentistaDao) {
    val getAllData: LiveData<List<Dentista>> = dentistaDao.getAllData()

    suspend fun addLugar(lugar)
}
