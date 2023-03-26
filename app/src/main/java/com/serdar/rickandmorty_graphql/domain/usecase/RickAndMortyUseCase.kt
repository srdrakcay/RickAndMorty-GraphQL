package com.serdar.rickandmorty_graphql.domain.usecase

import com.serdar.rickandmorty_graphql.data.NetworkResponse
import com.serdar.rickandmorty_graphql.data.dto.Character
import kotlinx.coroutines.flow.Flow


interface RickAndMortyUseCase {
    suspend operator fun invoke(): Flow<NetworkResponse<List<Character>>>
}