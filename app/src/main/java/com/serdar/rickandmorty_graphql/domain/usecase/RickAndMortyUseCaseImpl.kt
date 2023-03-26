package com.serdar.rickandmorty_graphql.domain.usecase

import com.serdar.rickandmorty_graphql.data.NetworkResponse
import com.serdar.rickandmorty_graphql.data.dto.Character
import com.serdar.rickandmorty_graphql.domain.source.remote.RemoteSource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class RickAndMortyUseCaseImpl @Inject constructor(private val source: RemoteSource) :
    RicAndMortyUseCase {
    override suspend fun invoke(): Flow<NetworkResponse<List<Character>>> =
        flow {
            emit(NetworkResponse.Loading)
            when (val response = source.getRickAndMortyQuery()) {
                is NetworkResponse.Error -> emit(response)
                NetworkResponse.Loading -> Unit
                is NetworkResponse.Success -> emit(
                    NetworkResponse.Success(
                        response.result
                    )
                )
            }
        }
}