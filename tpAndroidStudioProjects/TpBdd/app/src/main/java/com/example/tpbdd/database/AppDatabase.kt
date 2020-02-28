package com.example.tpbdd.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [User::class], version = 1)
abstract class AppDatabase(): RoomDatabase() {
    abstract fun userDao(): UserDao
}

private var instance: AppDatabase? = null
fun getDatabase(context : Context): AppDatabase? {
    if (instance == null) {
        instance = Room.databaseBuilder(
            context,
            AppDatabase::class.java,
            "user_db")
            .allowMainThreadQueries()
            .build()
    }
    return instance
}