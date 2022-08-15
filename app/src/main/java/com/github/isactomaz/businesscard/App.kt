package com.github.isactomaz.businesscard

import android.app.Application
import com.github.isactomaz.businesscard.database.AppDatabase
import com.github.isactomaz.businesscard.data.BusinessCardRepository

class App : Application() {
    val database by lazy { AppDatabase.getDatabase(this) }
    val repository by lazy { BusinessCardRepository(database.businessCardDao()) }
}