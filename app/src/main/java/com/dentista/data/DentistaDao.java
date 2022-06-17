package com.dentista.data;

import androidx.lifecycle.LiveData;
import androidx.room.*
import androidx.room.OnConflictStrategy;

import com.dentista.model.Dentista;

import java.util.List;

@Dao
public interface DentistaDao {
    @Query("SELECT * FROM DENTISTA")
    fun getAllData() : LiveData<List<Dentista>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addDentista(dentista: Dentista)

    @Update(onConflict = OnConflictStrategy.IGNORE)
    suspend fun updateDentista(dentista: Dentista)

    @Delate(onConflict = OnConflictStrategy.IGNORE)
    suspend fun delateDentista(dentista: Dentista)
}
