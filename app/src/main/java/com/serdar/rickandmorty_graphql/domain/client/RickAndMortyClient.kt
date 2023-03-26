package com.serdar.rickandmorty_graphql.domain.client

import com.serdar.rickandmorty_graphql.data.dto.Character

interface RickAndMortyClient {

    suspend fun getAllCharacterQuery():List<Character>?
}