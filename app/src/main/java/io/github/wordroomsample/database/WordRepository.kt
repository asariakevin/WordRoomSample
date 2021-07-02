package io.github.wordroomsample.database

import kotlinx.coroutines.flow.Flow

class WordRepository(private val wordDao: WordDao) {

    val allWords: Flow<List<Word>> = wordDao.getAlphabatizedWords()

    suspend fun insert(word: Word){
        wordDao.insert(word)
    }
}