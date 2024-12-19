package com.example.roomdatabase.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.roomdatabase.data.dao.MahasiswaDao
import com.example.roomdatabase.data.entity.Mahasiswa

@Database(entities = [Mahasiswa::class], version = 1, exportSchema = false)
abstract class KrsDatabase : RoomDatabase() {

    // Mendefinisikan fungsi untuk mengakses data Mahasiswa
    abstract fun mahasiswaDao(): MahasiswaDao

    companion object {
        @Volatile // Memastikan bahwa nilai variabel Instance selalu sama di semua thread
        private var instance: KrsDatabase? = null
        
    }
}