package io.github.wordroomsample

import android.app.Application
import io.github.wordroomsample.database.WordRepository
import io.github.wordroomsample.database.WordRoomDatabase

class WordsApplication : Application() {

    val database by lazy { WordRoomDatabase.getDatabase(this) }
    val repository by lazy { WordRepository(database.wordDao()) }
}