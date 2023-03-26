package com.serdar.rickandmorty_graphql.ui.home

import androidx.lifecycle.ViewModel
import com.serdar.rickandmorty_graphql.domain.usecase.RickAndMortyUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val rickAndMortyUseCase: RickAndMortyUseCase
) : ViewModel() {
    // TODO: Implement the ViewModel
}