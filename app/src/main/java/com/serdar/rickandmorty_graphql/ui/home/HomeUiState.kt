package com.serdar.rickandmorty_graphql.ui.home

import androidx.annotation.StringRes
import com.serdar.rickandmorty_graphql.data.dto.Character

sealed class HomeUiState {
    object Loading : HomeUiState()
    data class Success(val data: List<Character>?) : HomeUiState()
    data class Error(@StringRes val message: Int) : HomeUiState()
}