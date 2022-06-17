package com.dentista.model

import android.os.Parcelable
import kotlinx.parselize.Parcelize
import androidx.room.Entity
import androidx.room.ColumnInfo
import androidx.room.PrimaryKey

@Parcelize
@Entity(tableName="dentista")
data class Dentista(
    @PrimaryKey(autoGenerate = true)
    val id: Int,@
    @ColumnInfo(name = "name")
    val nombre: String,
    @ColumnInfo(name = "email")
    val email: String?,
    @ColumnInfo(name = "telefono")
    val telefono: String?,
    @ColumnInfo(name = "web")
    val web: String?
    : Parcelable

)
