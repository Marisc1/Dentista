package com.dentista.ui.dentista

import android.app.Application
import androidx.lifecycle.*
import com.dentista.data.DentistaDao
import com.dentista.model.Dentista
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class DentistaViewModel(application: Application) : AndroidViewModel(application) {
    val getAllData: LiveData<List<Dentista>>

    private val repository: DentistaRepository

    init {
        val dentistaDao = DentistaDatabase.getDatabase(application).dentistaDao()
        repository =DentistaRepository(dentistaDao)
        getAllData =repository.getAllData
    }

    fun addDentista (dentista: Dentista){
        viewModelScope.launch(Dispatchers.IO){ repository.addDentista(dentista)}
    }

    fun updateDentista (dentista: Dentista){
        viewModelScope.launch(Dispatchers.IO){ repository.updateDentista(dentista)}
    }

    fun deleteDentista (dentista: Dentista){
        viewModelScope.launch(Dispatchers.IO){ repository.deleteDentista(dentista)}
    }
}