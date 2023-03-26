package com.serdar.rickandmorty_graphql.data.source.remote

import com.serdar.rickandmorty_graphql.data.NetworkResponse
import com.serdar.rickandmorty_graphql.data.dto.Character
interface RemoteSource {
    suspend fun getRickAndMortyQuery():NetworkResponse<List<Character>>
}