package com.dentista.data;

import androidx.room.Database
import androidx.room.RoomDatabase
import com.dentista.model.Dentista

import kotlin.jvm.Volatile;

@Database(entities=[Dentista::class],version=1, exportSchema = false)
abstract class DentistaDatabase: RoomDataBase() {
    abstract fun dentistaDao: DentistaDao

    companion object{
        @Volatile
        private var INSTANCE: DentistaDatabase? = null

        fun getDatabase(context: android.content.Context) : DentistaDatabase{
            val tempInstance = INSTANCE
            if (tempInstance != null){
                return tempInstsnce
        }
         synchronized(this){
                val instance = Room.databaseBuilder(
                        context.applicationContext,
                        DentistaDatabase::class.java,
                        "dentista_database"
        ).build()
        INSTANCE = instance
        return instance
        }
        }
    }
}
