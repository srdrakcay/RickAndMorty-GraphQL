package com.serdar.rickandmorty_graphql.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.serdar.rickandmorty_graphql.R
import com.serdar.rickandmorty_graphql.data.NetworkResponse
import com.serdar.rickandmorty_graphql.domain.usecase.RickAndMortyUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val rickAndMortyUseCase: RickAndMortyUseCase
) : ViewModel() {

    private val _character= MutableLiveData<HomeUiState>()
    val character:LiveData<HomeUiState> =_character


    init {
        getAllCharacter()
    }
        private fun getAllCharacter(){
        viewModelScope.launch {
            rickAndMortyUseCase().onEach {
                when (it) {
                    is NetworkResponse.Error -> {
                        _character.postValue(HomeUiState.Error(R.string.error))
                    }
                    NetworkResponse.Loading -> {
                        _character.postValue(HomeUiState.Loading)
                    }
                    is NetworkResponse.Success -> {
                        _character.postValue(HomeUiState.Success(it.result))
                    }
                }

            }.launchIn(viewModelScope)

        }

        }

}