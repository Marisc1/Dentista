package com.dentista.repository;

import com.dentista.data.DentistaDao
import com.dentista.model.Dentista
import androidx.lifecycle.LiveData;

import com.dentista.data.DentistaDao;
import com.dentista.model.Dentista;

import java.util.List;

class DentistaRepository(private val dentistaDao: DentistaDao) {
    val getAllData: LiveData<List<Dentista>> = dentistaDao.getAllData()

    suspend fun addDentista(dentista: Dentista){
        dentistaDao.addDentista(dentista)
    }

    suspend fun updateDentista(dentista: Dentista){
        dentistaDao.updateDentista(dentista)
    }
    suspend fun deleteDentista(dentista: Dentista){
        dentistaDao.deleteDentista(dentista)
    }


}
