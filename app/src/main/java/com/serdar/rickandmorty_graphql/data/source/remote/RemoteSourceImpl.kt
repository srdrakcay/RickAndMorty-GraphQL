package com.serdar.rickandmorty_graphql.data.source.remote

import com.serdar.rickandmorty_graphql.data.NetworkResponse
import com.serdar.rickandmorty_graphql.data.client.RickAndMortyClient
import com.serdar.rickandmorty_graphql.data.dto.Character
import javax.inject.Inject

class RemoteSourceImpl @Inject constructor(private val client: RickAndMortyClient):RemoteSource {
    override suspend fun getRickAndMortyQuery(): NetworkResponse<List<Character>> =
        try {
            val response =client.getAllCharacterQuery()
            NetworkResponse.Success(response)
        }catch (e: Exception) {
            NetworkResponse.Error(e)
        }
}