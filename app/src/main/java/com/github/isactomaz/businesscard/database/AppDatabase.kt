package com.github.isactomaz.businesscard.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.github.isactomaz.businesscard.data.BusinessCard
import com.github.isactomaz.businesscard.data.BusinessCardDao

@Database(entities = [BusinessCard::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun businessCardDao(): BusinessCardDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "database_business_card",
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}