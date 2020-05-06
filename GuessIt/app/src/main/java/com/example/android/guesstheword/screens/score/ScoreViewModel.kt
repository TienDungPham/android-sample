package com.example.android.guesstheword.screens.score

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ScoreViewModel(private val score: Int): ViewModel() {
    private val _finalScore = MutableLiveData<Int>()
    val finalScore: LiveData<Int>
        get() {
            return _finalScore
        }

    init {
        _finalScore.value = score
    }
}