package io.github.wordroomsample

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import io.github.wordroomsample.database.Word
import io.github.wordroomsample.database.WordRepository
import kotlinx.coroutines.launch

class WordViewModel(private val wordRepository: WordRepository) : ViewModel() {
    val allWords : LiveData<List<Word>> = wordRepository.allWords.asLiveData()

    fun insert(word: Word) = viewModelScope.launch{
        wordRepository.insert(word)

    }

}